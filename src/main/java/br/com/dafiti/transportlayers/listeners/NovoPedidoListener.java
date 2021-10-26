package br.com.dafiti.transportlayers.listeners;

import br.com.dafiti.constants.RabbitConstants;
import br.com.dafiti.entities.pedido.webhook.NovoPedidoWebhook;
import br.com.dafiti.interactors.BuscarPedidoUseCase;
import br.com.dafiti.transportlayers.config.RabbitConfig;
import com.google.gson.Gson;
import com.rabbitmq.client.DeliverCallback;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class NovoPedidoListener {

    private static final Logger LOG = Logger.getLogger(NovoPedidoListener.class);

    private final RabbitConfig rabbitConfig;
    private final BuscarPedidoUseCase buscarPedidoUseCase;
    private final Gson gson;

    public NovoPedidoListener(RabbitConfig rabbitConfig, BuscarPedidoUseCase buscarPedidoUseCase, Gson gson) {
        this.rabbitConfig = rabbitConfig;
        this.buscarPedidoUseCase = buscarPedidoUseCase;
        this.gson = gson;
    }

    /**
     *  Recebe um objeto pelo callback do WebHook a cada novo pedido, é possível adicionar mais alguma lógica para controle do pedido.
     */
    public void listenerMensagens() {
        try {
            rabbitConfig.getChannel().queueBind(RabbitConstants.VENDAS_PRODUTO_QUEUE.getValue(), RabbitConstants.EXCHANGE_NAME.getValue(), "");
            DeliverCallback deliveryCallback = (consumerTag, delivery) -> {
                try {
                    var message = new String(delivery.getBody(), "UTF-8");
                    var webhookObject = gson.fromJson(message, NovoPedidoWebhook.class);
                    var pedido = buscarPedidoUseCase.executar(webhookObject.getPayload().getOrderId());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            };
            rabbitConfig.getChannel().basicConsume(RabbitConstants.VENDAS_PRODUTO_QUEUE.getValue(), true, deliveryCallback, consumerTag -> {});
        } catch (IOException | TimeoutException e) {
            LOG.info("Não foi possível deduzir do estoque: " + e.getMessage());
        }
    }
}

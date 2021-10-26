package br.com.dafiti.interactors;

import br.com.dafiti.entities.pedido.response.ResponseObterPedido;
import br.com.dafiti.repository.OrderRepository;

public class BuscarPedidoUseCase {

    private final OrderRepository orderRepository;

    public BuscarPedidoUseCase(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    /**
     *  Busca pedido pelo ID
     */
    public ResponseObterPedido executar(Long orderId) throws Exception {
        return orderRepository.consultarPedido(orderId);
    }
}

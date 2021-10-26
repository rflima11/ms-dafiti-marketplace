package br.com.dafiti.repository;

import br.com.dafiti.datasources.http.exceptions.OkHttpException;
import br.com.dafiti.entities.pedido.response.ResponseObterPedido;
import br.com.dafiti.entities.pedido.response.ResponseObterPedidoItems;

public interface OrderRepository {

    ResponseObterPedido consultarPedido(Long orderId) throws Exception;

    ResponseObterPedidoItems consultarItensPedido(Long orderId) throws Exception;

}

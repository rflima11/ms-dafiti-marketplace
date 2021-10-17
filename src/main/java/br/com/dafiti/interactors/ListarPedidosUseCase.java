package br.com.dafiti.interactors;

import com.rocketlabs.sellercenterapi.entities.GetOrdersOptions;
import com.rocketlabs.sellercenterapi.entities.OrderItemCollection;
import com.rocketlabs.sellercenterapi.entities.SellerCenter;
import com.rocketlabs.sellercenterapi.exceptions.SdkException;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class ListarPedidosUseCase {

    private static final Logger logger = LogManager.getLogger(ListarPedidosUseCase.class);

    public OrderItemCollection executar() throws SdkException {
        var opt = new GetOrdersOptions();
        opt.setLimit(1);

        var orders = SellerCenter.getOrders(opt).getAllItems();

        for (var item : orders) {
            logger.info("    Item:");
            logger.info("    |   Id:     " + item.getId());
            logger.info("    |   Name:   " + item.getString("Name"));
            logger.info("    |   Status: " + item.getString("Status"));
        }
        return orders;
    }
}

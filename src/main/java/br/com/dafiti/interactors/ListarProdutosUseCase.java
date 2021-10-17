package br.com.dafiti.interactors;

import com.rocketlabs.sellercenterapi.entities.GetProductsOptions;
import com.rocketlabs.sellercenterapi.entities.ProductCollection;
import com.rocketlabs.sellercenterapi.entities.SellerCenter;
import com.rocketlabs.sellercenterapi.exceptions.SdkException;

public class ListarProdutosUseCase {

    public ProductCollection executar() throws SdkException {
        var opt = new GetProductsOptions();
        return SellerCenter.getProducts(opt);
    }
}

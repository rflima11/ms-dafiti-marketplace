package br.com.dafiti;

import br.com.dafiti.datasources.http.FeedDafiti;
import br.com.dafiti.datasources.http.ProdutoDafiti;
import br.com.dafiti.entities.produto.ProductDataDTO;
import br.com.dafiti.entities.produto.ProdutoDTO;
import br.com.dafiti.entities.produto.request.RequestCriarNovoProduto;
import br.com.dafiti.interactors.BuscaFeedPorId;
import br.com.dafiti.interactors.CriarNovoProdutoUseCase;
import br.com.dafiti.utils.ApiUtils;
import com.rocketlabs.sellercenterapi.entities.ProductData;
import org.apache.log4j.PropertyConfigurator;

import java.util.Collections;

public class DafitiMarketplaceApplication {

    public static void main(String[] args) throws Exception {

        //CONFIGS
        ApiUtils.configurarApi();
        PropertyConfigurator.configure(System.getProperty("user.dir") + "/src/main/resources/log4j.properties");

        //FACADES
        var buscarPorId = new BuscaFeedPorId(new FeedDafiti());
        var criarProduto = new CriarNovoProdutoUseCase(buscarPorId, new ProdutoDafiti());
        //LISTENERS
        var request = new RequestCriarNovoProduto();
        var produto = new ProdutoDTO();
        produto.setName("Blusa Lisa Ombro Vazado com Detalhes em Pérola na Alça e Laço na Frente GG Ao G4  BS28");
        produto.setPrice(35.00);
        produto.setBrand("SEM MARCA");
        produto.setDescription("IDEAL PARA O SEU DIA A DIA, SEJA PARA OCASIÕES CASUAIS OU INFORMAIS !!!");
        produto.setSellerSku("BS31");
        produto.setPrimaryCategory("2823");
        var productData = new ProductDataDTO();
        productData.setWeight(0.2);
        productData.setColorFamily("Rosa");
        productData.setGender("feminino");
        productData.setOrigin("Nacional, cont Imp sup 40%");
        productData.setBoxHeight(1.0);
        productData.setBoxWidth(10.0);
        productData.setBoxLength(15.0);
        produto.setProductData(productData);
        request.setProdutos(Collections.singletonList(produto));
        criarProduto.executar(request);
    }

}

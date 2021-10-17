package br.com.dafiti;

import br.com.dafiti.utils.ApiUtils;
import org.apache.log4j.PropertyConfigurator;

public class DafitiMarketplaceApplication {

    public static void main(String[] args) {

        //CONFIGS
        ApiUtils.configurarApi();
        PropertyConfigurator.configure(System.getProperty("user.dir") + "/src/main/resources/log4j.properties");

        //FACADES


        //LISTENERS
    }

}

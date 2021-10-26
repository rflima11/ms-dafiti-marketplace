package br.com.dafiti.utils;

import br.com.dafiti.constants.ApiConstants;
import com.rocketlabs.sellercenterapi.entities.SellerCenter;
import com.rocketlabs.sellercenterapi.exceptions.SdkException;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 * Métodos utilitários para configuração da API e hash de token de autorização.
 */
public class ApiUtils {

    private ApiUtils() { throw new IllegalStateException("Classe utilitária, não deve ser instanciada"); }

    public static void configurarApi() {
        SellerCenter.apiKey = ApiConstants.API_KEY.getValue();
        SellerCenter.userId = ApiConstants.USER_ID.getValue();
        SellerCenter.url = ApiConstants.API_URL.getValue();
    }

    public static String sign(Map<String, String> params) throws SdkException {
        var sortedParams = new TreeMap(params);
        var concat = "";

        try {
            String key;
            for(Iterator var4 = sortedParams.navigableKeySet().iterator(); var4.hasNext(); concat = concat + URLEncoder.encode(key, "UTF-8") + "=" + URLEncoder.encode((String)sortedParams.get(key), "UTF-8") + "&") {
                key = (String)var4.next();
            }

            concat = concat.substring(0, concat.length() - 1);
            concat = concat.replace("+", "%20");
            return hmacDigest(concat, ApiConstants.API_KEY.getValue());
        } catch (UnsupportedEncodingException var6) {
            throw new SdkException("Error while encoding parameters : " + var6.getMessage());
        }
    }

    private static String hmacDigest(String msg, String keyString) throws SdkException {
        try {
            var key = new SecretKeySpec(keyString.getBytes(), "HmacSHA256");
            var mac = Mac.getInstance("HmacSHA256");
            mac.init(key);
            byte[] rawHmac = mac.doFinal(msg.getBytes());
            StringBuilder hash = new StringBuilder();

            for(int i = 0; i < rawHmac.length; ++i) {
                String hex = Integer.toHexString(255 & rawHmac[i]);
                if (hex.length() == 1) {
                    hash.append('0');
                }

                hash.append(hex);
            }

            return hash.toString();
        } catch (NoSuchAlgorithmException | InvalidKeyException var9) {
            throw new SdkException("Error while signing request : " + var9.getMessage());
        }
    }
}

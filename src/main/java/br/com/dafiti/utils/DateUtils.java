package br.com.dafiti.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * Método utilitário para conversão de data para o formato Iso8861
 */
public class DateUtils {

    private DateUtils() { }

    public static String getDateAsIso8661() {
        var tz = TimeZone.getTimeZone("UTC");
        var df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm'Z'");
        df.setTimeZone(tz);
        return df.format(new Date());
    }
}

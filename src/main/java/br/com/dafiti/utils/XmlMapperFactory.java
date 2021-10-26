package br.com.dafiti.utils;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator;

/**
 * Métodos utilitários para configuração de um client XmlMapper
 */
public class XmlMapperFactory {

    private XmlMapperFactory() { throw new IllegalStateException("Classe utilitária, não deve ser instanciada"); }

    public static XmlMapper getXmlMapper() {
        var xmlMapper = new XmlMapper();
        xmlMapper.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
        xmlMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        xmlMapper.configure(ToXmlGenerator.Feature.WRITE_XML_DECLARATION, true);
        return xmlMapper;
    }
}

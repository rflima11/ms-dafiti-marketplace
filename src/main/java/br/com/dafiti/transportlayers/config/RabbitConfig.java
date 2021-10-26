package br.com.dafiti.transportlayers.config;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class RabbitConfig {

    private ConnectionFactory getConnectionFactory() {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("127.0.0.1");
        factory.setUsername("guest");
        factory.setPassword("guest");
        factory.enableHostnameVerification();
        factory.setVirtualHost("/");
        factory.setPort(5672);
        return factory;
    }

    public Connection getConnection() throws IOException, TimeoutException {
        return getConnectionFactory().newConnection();
    }

    public Channel getChannel() throws IOException, TimeoutException {
        var connection = getConnection();
        return connection.createChannel();

    }



}
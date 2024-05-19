package com.Shree.Chat.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker

public class WebsocketConfig implements WebSocketMessageBrokerConfigurer {
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/ws").withSockJS();
    }

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        registry.setApplicationDestinationPrefixes("/app");
        registry.enableSimpleBroker("/topic");
    }
}

/**
 * WebSocket Endpoint: Clients will connect to /ws for WebSocket communications. SockJS is enabled to provide fallback options.
 * Message Mapping: Messages sent to the server should have a destination prefix of /app and will be routed to appropriate message handling methods in your application.
 * Message Broker: Messages with the prefix /topic will be handled by the simple in-memory message broker and broadcasted to all connected clients subscribed to those topics.
 */
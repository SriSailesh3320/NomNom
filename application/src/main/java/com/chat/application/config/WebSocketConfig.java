package com.chat.application.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

/*

* Web Sockets are used to maintain the 2 way communication channel between the Client (frontend) and the Server (backend).
* STOMP - It sits over websockets and gives a structure to the communication / messages that we pass b/w the client and server.
          It will define how the messages are organized and routed within that connection.

* WebSocketMessageBrokerConfigurer : This is an interface which contains methods for configuring message
                                     handling using simple messaging protocols (Ex; STOMP) from WebSocket clients.

What is message broking? Message broking is a way of routing messages. Whenever we are building apps using web sockets, message broker acts as a middle man,
which directs the messages to a right place. It decides to which destination a message must go.


 */
@Configuration // The below class is a config class so it this annotation tells Spring that this class is a config class.
@EnableWebSocketMessageBroker // This annotation is going to enable websocket messaging in Spring Boot and tells spring that it uses websockets for messaging.
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {
    /*
    Using of override methods:
        1. registerStompEndpoints()
        2. configureMessageBroker()
     */

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        /*
           1. Here, we are defining the endpoints for the websocket connection. (default, it will be localhost:8080/chat).
           2. setAllowedOrigins("http://localhost:8080") : The requests are only allowed from this URL only. Like CORS. 8080 is the thymeleaf URL.
           3. withSockJS() : Adds compatibility for clients who do not support web sockets using SockJS.
         */

        registry.addEndpoint("/chat")
                .setAllowedOrigins("http://localhost:8080")
                .withSockJS();
    }

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        /*
            1. We are going to set a simple message broker.
            2. We are going to tell the server as to when to expect a message.
               Ex: if client sends a message with prefix:/app then server will understand that it must process. (/app/sendmessage)
         */

            registry.enableSimpleBroker("/topic"); // Set up a message broker that can handle messages for topics. Ex: topic/ChatRoom1: Those who all are in CR1 and subscribed to topic will get the message if sent in CR1
            registry.setApplicationDestinationPrefixes("/app"); // We are telling the server that if you get any message with prefix:/app process it.

    }
}

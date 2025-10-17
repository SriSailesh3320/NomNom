package com.chat.application.controller;
import com.chat.application.model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
/*
Tasks of the controller:
    1. Handle all the incoming messages from the Client.
    2. It is going to broadcast it to all the clients.
 */

@Controller
public class ChatController {

    @MessageMapping("/sendMessage") // Maps web socket messages to the destination
    @SendTo("/topic/messages") // Tells spring to broadcast the return value of sendMessage() method to all those who are subscribed to topic.
    public ChatMessage sendMessage(ChatMessage message){
        return message;
    }

    @GetMapping("chat")
    public String chat(){
        return "chat"; // Name of thymeleaf template.
    }
}

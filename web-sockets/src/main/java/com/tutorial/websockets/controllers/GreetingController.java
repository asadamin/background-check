package com.tutorial.websockets.controllers;

import com.tutorial.websockets.dto.Greeting;
import com.tutorial.websockets.dto.HelloMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class GreetingController {

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Greeting greeting(HelloMessage helloMessage) throws Exception{
        Thread.sleep(1000);
        return new Greeting("Hello, " +HtmlUtils.htmlEscape(helloMessage.getName())+"!");
    }
}

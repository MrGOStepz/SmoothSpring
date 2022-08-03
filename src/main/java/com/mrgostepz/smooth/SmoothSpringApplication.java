package com.mrgostepz.smooth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.rsocket.RSocketRequester;
import org.springframework.util.MimeTypeUtils;
import reactor.core.publisher.Mono;
import reactor.util.retry.Retry;

import java.time.Duration;

@SpringBootApplication
public class SmoothSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmoothSpringApplication.class, args);
    }

    @MessageMapping("request-response")
    Mono<Message> requestResponse(final Message message) {
        System.out.printf("Received request message: {}", message.getMessage());
        return Mono.just(new Message("You said: " + message.getMessage()));
    }


}

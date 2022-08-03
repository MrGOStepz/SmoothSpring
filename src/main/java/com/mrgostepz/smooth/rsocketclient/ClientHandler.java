package com.mrgostepz.smooth.rsocketclient;

import org.springframework.messaging.rsocket.RSocketRequester;


public class ClientHandler {
    private final RSocketRequester rSocketRequester;

    public ClientHandler(RSocketRequester rSocketRequester) {
        this.rSocketRequester = rSocketRequester;
    }

    
}

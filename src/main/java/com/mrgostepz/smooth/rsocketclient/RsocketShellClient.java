package com.mrgostepz.smooth.rsocketclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.messaging.rsocket.RSocketRequester;
import org.springframework.messaging.rsocket.RSocketStrategies;

public class RsocketShellClient {
    private static final String CLIENT = "Client";
    private static final String REQUEST = "Request";
    private static final String FIRE_AND_FORGET = "Fire-And-Forget";

    private RSocketRequester rsocketRequester;
    private RSocketRequester.Builder rsocketRequesterBuilder;
    private RSocketStrategies rsocketStrategies;

    @Autowired
    public RsocketShellClient(RSocketRequester.Builder builder,
                              @Qualifier("rSocketStrategies") RSocketStrategies strategies) {
        this.rsocketRequesterBuilder = builder;
        this.rsocketStrategies = strategies;
    }
}

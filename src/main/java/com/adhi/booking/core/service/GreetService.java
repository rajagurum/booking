package com.adhi.booking.core.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@EnableConfigurationProperties
public class GreetService {

    @Value("${greetermessage:}")
    private String greeterMessageFormat;

    public String greet(String user) {
        String prefix = System.getenv().getOrDefault("SpringProp_Greeting_message", "Hi");
        log.info("Prefix :{} and User:{}", prefix, user);
        if (prefix == null) {
            prefix = "Hello!";
        }
        log.info("greeterMessageFormat  : ",greeterMessageFormat);
        return String.format(greeterMessageFormat, prefix, user);
    }
}

package com.mbsystems.springconfigclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class MessageRestController {

    @Value( "${msg:Hello world - Config Server is not working .. please check}" )
    private String msg;

    @RequestMapping( "/msg")
    public String getMsg() {
        return this.msg;
    }
}

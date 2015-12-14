package com.pojo;

import javax.annotation.PostConstruct;

public class HelloBean {
    @PostConstruct
    public void init(){
        System.out.println("@PostConstruct - Hello Bean say : 'HELLO' ");
    }
}

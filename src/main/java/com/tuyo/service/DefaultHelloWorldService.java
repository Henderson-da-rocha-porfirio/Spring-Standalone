package com.tuyo.service;

public class DefaultHelloWorldService implements HelloWorldService {

    @Override
    public void hello() {
        System.out.println("Hello World");
    }
}

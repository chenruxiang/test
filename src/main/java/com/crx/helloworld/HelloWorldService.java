package com.crx.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/10/10 0010.
 */
@Component
public class HelloWorldService {

    @Autowired
    private HelloWorld helloWorld;

    public HelloWorld getHelloWorld() {
        return helloWorld;
    }

    /*public void setHelloWorld(HelloWorld helloWorld) {
        this.helloWorld = helloWorld;
    }*/
}

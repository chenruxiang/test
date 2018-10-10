package com.crx.helloworldimpl;

import com.crx.helloworld.HelloWorld;

/**
 * Created by Administrator on 2018/10/10 0010.
 */
public class SpringHelloWorld implements HelloWorld {
    @Override
    public void sayHello() {
        System.out.println("Spring Hello World!");
    }
}

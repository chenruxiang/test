package com.crx.helloworldimpl;

import com.crx.helloworld.HelloWorld;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/10/10 0010.
 */
@Component
public class SpringHelloWorld implements HelloWorld {
    @Override
    public void sayHello() {
        System.out.println("Spring Hello World!！");
    }
}

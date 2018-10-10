package com.crx.main;

import com.crx.helloworld.HelloWorldService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2018/10/10 0010.
 */
public class Main {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        HelloWorldService service = (HelloWorldService)context.getBean("helloWorldService");
        service.getHelloWorld().sayHello();
    }
}

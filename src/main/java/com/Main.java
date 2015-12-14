package com;

import com.pojo.HelloBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("app-context.xml");
        HelloBean helloBean = (HelloBean) applicationContext.getBean("helloBean");

    }
}

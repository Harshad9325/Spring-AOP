  package com.AOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.AOP.service.paymentService;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("com/AOP/config.xml");
        paymentService paymentObject = context.getBean("payment",paymentService.class);
        
        //auth,print:payment Started
        
        paymentObject.makePayment(1243);
    }
}

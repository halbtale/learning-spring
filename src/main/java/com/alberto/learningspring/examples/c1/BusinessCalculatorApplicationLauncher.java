package com.alberto.learningspring.examples.c1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class BusinessCalculatorApplicationLauncher {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(BusinessCalculatorApplicationLauncher.class)) {
            System.out.println(context.getBean(BusinessCalculatorService.class).findMax());
        }
    }
}

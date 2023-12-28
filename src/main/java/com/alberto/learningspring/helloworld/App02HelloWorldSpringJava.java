package com.alberto.learningspring.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpringJava {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("age"));
            System.out.println(context.getBean("person"));
            System.out.println(context.getBean("person2"));
            System.out.println(context.getBean("address2"));
            System.out.println(context.getBean(Person.class));
            System.out.println(context.getBean("person5"));

            // Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }

    }
}

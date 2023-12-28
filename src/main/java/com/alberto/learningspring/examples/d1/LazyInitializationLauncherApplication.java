package com.alberto.learningspring.examples.d1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class ClassA {

}

@Component
@Lazy
class ClassB {
    private final ClassA classA;

    public ClassB(ClassA classA) {
        System.out.println("Initalization.classB");
        this.classA = classA;
    }

    public void doSomething() {
        System.out.println("Doing something");
    }
}

@Component
@ComponentScan
public class LazyInitializationLauncherApplication {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(LazyInitializationLauncherApplication.class)) {
            System.out.println("Initialization of context is completed");
            context.getBean(ClassB.class).doSomething();
        }
    }
}

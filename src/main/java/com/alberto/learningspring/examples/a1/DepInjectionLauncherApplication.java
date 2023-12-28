package com.alberto.learningspring.examples.a1;

import com.alberto.learningspring.game.GameRunner;
import com.alberto.learningspring.game.GamingConsole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class YourBusinessClass {
    Dependency1 dependency1;
    Dependency2 dependency2;

    public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
    }

    /*
    @Autowired
    public void setDependency1(Dependency1 dependency1) {
        this.dependency1 = dependency1;
    }

    @Autowired
    public void setDependency2(Dependency2 dependency2) {
        this.dependency2 = dependency2;
    }
    */

    @Override
    public String toString() {
        return "dependency 1: "+dependency1+" and dependency 2: "+dependency2;
    }
}

@Component
class Dependency1 {

}

@Component
class Dependency2 {

}

@Configuration
@ComponentScan
public class DepInjectionLauncherApplication {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(DepInjectionLauncherApplication.class)) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

            System.out.println(context.getBean(YourBusinessClass.class));
        }
    }
}

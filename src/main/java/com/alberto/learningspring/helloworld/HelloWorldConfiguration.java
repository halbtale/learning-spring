package com.alberto.learningspring.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person (String name, int age, Address address) {};
record Address (String firstLine, String city) {};

@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name() {
        return "Alberto";
    }

    @Bean
    public int age() {
        return 19;
    }

    @Primary
    @Bean
    public Person person() {
        return new Person("Alberto", 19, new Address("Name street", "Citt"));
    }

    @Bean
    public Person person2() {
        return new Person(name(), age(), address());
    }

    @Bean
    public Person person3() {
        return new Person(name(), age(), address());
    }

    @Bean
    public Person person4(String name, int age, Address address) {
        return new Person(name, age, address);
    }

    @Bean
    public Person person5(String name, int age, @Qualifier("address3qualifier") Address address) {
        return new Person(name, age, address);
    }

    @Bean(name = "address2")
    @Primary
    public Address address() {
        return new Address("Via dei matti", "Padova");
    }

    @Bean(name = "address3")
    @Qualifier("address3qualifier")
    public Address address3() {
        return new Address("Via dei cazzi", "Padova");
    }
}

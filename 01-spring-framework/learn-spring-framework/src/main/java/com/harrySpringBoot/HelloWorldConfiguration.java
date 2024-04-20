package com.harrySpringBoot;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age) {};
record Address(String firstLine, String city) {};

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "Ranga";
    }
    @Bean
    public int age() {
        return 21;
    }

    @Bean
    public Person person() {
        return new Person("Harry", 27); 
    }

    @Bean
    public Person person2() {
        return new Person(name(), age());
    }
    @Bean 
    public Person person3(String name  , int age) {
        return new Person(name, age);
    }

    @Bean(name = "myHome")
    @Primary
    public Address address2() {
        return new Address("Kedar Nagar", "Indore");
    }

    @Bean(name = "myHome2")
    @Qualifier("secondHome")   // used to get desired Bean  , when having same return values 
    public Address address() {
        return new Address("Kedar Nagar", "Bhopal");
    }
 
    
    
 

}

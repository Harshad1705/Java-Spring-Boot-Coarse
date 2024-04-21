package com.harrySpringBoot.examples.a0;
import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



@Configuration
@ComponentScan
public class SimpleSpringContextLanucherApplication {

    public static void main(String[] args) {
            
        try (var context = new AnnotationConfigApplicationContext           (SimpleSpringContextLanucherApplication.class)) {
            
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        };


    }
}

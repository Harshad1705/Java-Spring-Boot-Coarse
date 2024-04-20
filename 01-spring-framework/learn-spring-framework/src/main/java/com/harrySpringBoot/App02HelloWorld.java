package com.harrySpringBoot;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App02HelloWorld {
    public static void main(String[] args) {
            
        // 1 - Launch a spring context 

        try (var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
                 // 2 - configure the things that we want spring to manage @configuration
        // HelloWorldConfiguration - @COnfiguration
        // name - @Bean
        
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("person2"));
        System.out.println(context.getBean("person3"));
        System.out.println(context.getBean("myHome")); 
        System.out.println(context.getBean(Address.class));
        
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
        
   

        }
}


// Spring container :- manages spring bean and their lifecycle
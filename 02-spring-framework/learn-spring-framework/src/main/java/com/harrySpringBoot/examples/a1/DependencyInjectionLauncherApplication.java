package com.harrySpringBoot.examples.a1;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


// Dependenncy Injection can be done by three ways:-
// -constructor based  - doesnot required @AUtoWired , did automatically
// -settter based
// - field based

// Your Buisness Class
@Component
class YourBuisnessClass {

    // @Autowired     //- field based
    Dependency1 dependency1;
    // @Autowired    //- field based
    Dependency2 dependency2;

    public YourBuisnessClass(Dependency1 dependency1, Dependency2 dependency2) {
        super();
        System.out.println("Constructor Injection");
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
    }

    // @Autowired   //- setter based
    //    public void setDependency1(Dependency1 dependency1) {
    //     System.out.println("Setter Injection - setDependency1");
    //     this.dependency1 = dependency1;
    // }

    // @Autowired    //- setter based
    // public void setDependency2(Dependency2 dependency2) {
    //         System.out.println("Setter Injection - setDependency2");
    //         this.dependency2 = dependency2;
    //     }

    public String toString() {
        return "Using " + dependency1 + " and " + dependency2;
    }

}

// Dependency 1
@Component
class Dependency1 {
    
} 
// Dependency 2
@Component
class Dependency2 {
    
}

@Configuration
@ComponentScan
public class DependencyInjectionLauncherApplication {

    public static void main(String[] args) {
            
        try (var context = new AnnotationConfigApplicationContext           (DependencyInjectionLauncherApplication.class)) {
            
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

            System.out.println(context.getBean(YourBuisnessClass.class))  ;
        };


    }
}

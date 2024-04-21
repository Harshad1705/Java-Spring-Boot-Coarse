package com.harrySpringBoot;

import java.util.Arrays;

import javax.xml.crypto.Data;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

interface DataService {
    int[] retrieveData();
}

@Component
class MongoDb implements DataService {

    public int[] retrieveData() {
        return new int[] { 11, 22, 33, 44, 55 };
    }

}

@Component
@Primary
 class MySql implements DataService {

    public int[] retrieveData() {
        return new int[] { 1,2,3,4,5};
    }
    
}


@ComponentScan
public class BuisnessCalculationService {

    public static void main(String[] args) {

        // Arrays.stream(dataService.retrieveData()).max().orElse(0);

        try (var context = new AnnotationConfigApplicationContext(BuisnessCalculationService.class)) {
            System.out.println(Arrays.stream(context.getBean(DataService.class).retrieveData()).max().orElse(0));
        }
    }

}

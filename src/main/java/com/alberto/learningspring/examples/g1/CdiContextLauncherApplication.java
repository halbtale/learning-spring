package com.alberto.learningspring.examples.g1;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Named
class BusinessService {
    private DataService dataService;

    public DataService getDataService() {
        return dataService;
    }

    @Inject
    public void setDataService(DataService dataService) {
        this.dataService = dataService;
    }

}

@Named
class DataService {

}

@Configuration
@ComponentScan
public class CdiContextLauncherApplication {

    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(CdiContextLauncherApplication.class)) {
            System.out.println(context.getBean(BusinessService.class).getDataService());
        }
    }
}

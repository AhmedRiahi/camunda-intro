package org.example.camundaMain;

import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableProcessApplication
@EnableSwagger2
public class CamundaMainApp {

    public static void main(String[] args) {
        SpringApplication.run(CamundaMainApp.class, args);
    }
}

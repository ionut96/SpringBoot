package com.example.LProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LProjectApplication {

    public static void main(String[] args) {

       SpringApplication.run(LProjectApplication.class, args);
//        ConfigurableApplicationContext context = SpringApplication.run(LProjectApplication.class, args);
//        User user = context.getBean(User.class);
//        user.show();
    }
}

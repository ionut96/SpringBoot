package com.example.KProject;

import com.example.KProject.dependecyInjectionAutoWire.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class KProjectApplicationDao {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(KProjectApplicationDao.class, args);
//        User user1 = context.getBean(User.class);
//        user1.show();
//        User user2 = context.getBean(User.class);
//        user2.show();
    }
}

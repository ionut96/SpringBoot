package com.example.NProjectJpaSpringHibernate;

import com.example.LProject.LProjectApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.example.NProjectJpaSpringHibernate.repository")
@SpringBootApplication
public class SpringJpaHibernateApplication {
    public static void main(String[] args) {
        SpringApplication.run(LProjectApplication.class, args);
    }
}
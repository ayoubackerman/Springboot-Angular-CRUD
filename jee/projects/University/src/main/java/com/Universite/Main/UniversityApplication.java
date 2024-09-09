package com.Universite.Main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.cors.CorsConfigurationSource;

//import com.Universite.Entities;


@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
//@EnableAutoConfiguration
@EntityScan("com.Universite.Entities")
@EnableJpaRepositories("com.Universite.Repository")
@ComponentScan("com.Universite.Metier")
@ComponentScan("com.Universite.MetierImplementation")
@ComponentScan("com.Universite.Controller")

public class UniversityApplication implements CommandLineRunner {


    public static void main(String[] args) {
        SpringApplication.run(UniversityApplication.class, args);


    }
 

    @Override
    public void run(String... args) throws Exception {

    }

}

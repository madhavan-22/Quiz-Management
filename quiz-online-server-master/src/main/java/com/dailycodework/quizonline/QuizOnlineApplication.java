package com.dailycodework.quizonline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = "com.dailycodework.quizonline")
@EntityScan(basePackages = "com.dailycodework.quizonline.model")
public class QuizOnlineApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuizOnlineApplication.class, args);
    }

}

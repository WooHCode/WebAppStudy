package com.example.WebAppStudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing //JPA 활성화
@SpringBootApplication
public class WebAppStudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebAppStudyApplication.class, args);
	}

}

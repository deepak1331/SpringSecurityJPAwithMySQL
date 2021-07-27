package com.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.learn.repo.UserRepository;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class SpringSecurityJpAwithMySqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityJpAwithMySqlApplication.class, args);
	}

}

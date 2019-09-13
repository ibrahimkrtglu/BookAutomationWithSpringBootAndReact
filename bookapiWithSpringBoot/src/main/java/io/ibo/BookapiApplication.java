package io.ibo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"io.ibo.controller","io.ibo.service"} )
@EntityScan(basePackages = {"io.ibo.model"})
@EnableJpaRepositories(basePackages= {"io.ibo.repository"})

public class BookapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookapiApplication.class, args);
	}

}

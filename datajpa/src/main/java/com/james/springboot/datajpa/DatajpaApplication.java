package com.james.springboot.datajpa;

import com.github.javafaker.Faker;
import com.james.springboot.datajpa.models.Author;
import com.james.springboot.datajpa.repository.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@RequiredArgsConstructor
public class DatajpaApplication implements CommandLineRunner {

	private final AuthorRepository authorRepository;

	public static void main(String[] args) {
		SpringApplication.run(DatajpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		for (int i = 0; i < 50; i++) {
			Faker faker = new Faker();
			Author author = Author.builder()
					.firstName(faker.name().firstName())
					.lastName(faker.name().lastName())
					.email(faker.internet().emailAddress())
					.age(faker.number().numberBetween(10,50))
					.build();

			authorRepository.save(author);
		}
	}


	/*@Bean
	public CommandLineRunner commandLineRunner (AuthorRepository authorRepository) {
		return args -> {
			Author author = Author.builder()
					.firstName("Biswajeet")
					.lastName("Rout")
					.email("biswajeetrout@gmail.com")
					.age(30)
					.build();

					authorRepository.save(author);
		};
	}*/
}

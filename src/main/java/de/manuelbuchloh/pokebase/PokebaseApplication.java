package de.manuelbuchloh.pokebase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class PokebaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(PokebaseApplication.class, args);
	}

}

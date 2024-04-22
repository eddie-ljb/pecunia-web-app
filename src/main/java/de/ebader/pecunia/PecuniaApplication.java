package de.ebader.pecunia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration;

@SpringBootApplication(exclude = {GsonAutoConfiguration.class})
public class PecuniaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PecuniaApplication.class, args);
	}

}

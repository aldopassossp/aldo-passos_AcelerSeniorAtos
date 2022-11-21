package br.atos.crud_zoologico;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class CrudZoologicoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudZoologicoApplication.class, args);
	
		System.out.println(new BCryptPasswordEncoder().encode("admin"));
	}
	
}

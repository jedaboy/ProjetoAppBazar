package com.IgrejaBatista.NovaVida;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={
"com.IgrejaBatista.NovaVida.domain", "com.IgrejaBatista.NovaVida.repositories"
,"com.IgrejaBatista.NovaVida.resources","com.IgrejaBatista.NovaVida.services"})
public class BazarOfertaCatalogoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BazarOfertaCatalogoApplication.class, args);
	}

}

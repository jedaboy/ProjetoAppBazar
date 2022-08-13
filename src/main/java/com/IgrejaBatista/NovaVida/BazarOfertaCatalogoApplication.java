package com.IgrejaBatista.NovaVida;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.IgrejaBatista.NovaVida.domain.Categoria;
import com.IgrejaBatista.NovaVida.domain.Produto;
import com.IgrejaBatista.NovaVida.repositories.CategoriaRepository;

@SpringBootApplication
public class BazarOfertaCatalogoApplication implements CommandLineRunner {

	@Autowired
	private CategoriaRepository categoriarepository;
	
	public static void main(String[] args) {
		SpringApplication.run(BazarOfertaCatalogoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(1,"Jaquetas");
		Categoria cat2 = new Categoria(2,"Camisetas");
		Categoria cat3 = new Categoria(3,"Calças");
		Categoria cat4 = new Categoria(4,"Tenis");
		
		Produto p1  = new Produto (null,"camisa azul", 20.00);	
		Produto p2  = new Produto (null,"calça jeans", 55.00);
		Produto p3  = new Produto (null,"jaqueta de couro", 120.00);
		Produto p4  = new Produto (null,"calça azul", 30.00);
		Produto p5  = new Produto (null,"tenis preto", 10.00);
		
		cat3.getProducts().addAll(Arrays.asList(p2,p4));
		cat4.getProducts().addAll(Arrays.asList(p5));
		cat1.getProducts().addAll(Arrays.asList(p3));
		cat2.getProducts().addAll(Arrays.asList(p1));
//		List<Categoria> list = new ArrayList<>();
//		list.add(cat1);
//		list.add(cat2);		
		
		categoriarepository.saveAll(Arrays.asList(cat1,cat2,cat3,cat4));
	}

}

package com.IgrejaBatista.NovaVida.resources;

//import java.util.ArrayList;
//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.IgrejaBatista.NovaVida.domain.Produto;
import com.IgrejaBatista.NovaVida.services.ProdutoService;

@RestController
public class ProdutoResource {
	
	@Autowired
	private ProdutoService service;
	
	@RequestMapping(value = "/produtos/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		
		Produto obj = service.find(id);
		
//		Categoria cat1 = new Categoria(1,"Jaquetas");
//		Categoria cat2 = new Categoria(2,"Camisetas");
//		List<Categoria> list = new ArrayList<>();
//		list.add(cat1);
//		list.add(cat2);
		
		return ResponseEntity.ok().body(obj);
	}
	
	
}

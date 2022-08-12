package com.IgrejaBatista.NovaVida.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.IgrejaBatista.NovaVida.domain.Categoria;
import com.IgrejaBatista.NovaVida.repositories.CategoriaRepository;

@Service
public class CategoriaService {
  
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria find(Integer id) {
		Categoria obj = repo.findById(id).orElse(null);
		return obj;
	}
}

package com.IgrejaBatista.NovaVida.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.IgrejaBatista.NovaVida.domain.Produto;
import com.IgrejaBatista.NovaVida.repositories.ProdutoRepository;
import com.IgrejaBatista.NovaVida.services.exceptions.ObjectNotFoundException;


@Service
public class ProdutoService {
  
	@Autowired
	private  ProdutoRepository repo;
	
	public  Produto find(Integer id) {
		 Produto obj = repo.findById(id).orElse(null);
		if(obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " +  Produto.class.getName());
		}
		return obj;
	}
}

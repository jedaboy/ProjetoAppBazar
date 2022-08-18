package com.IgrejaBatista.NovaVida.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.IgrejaBatista.NovaVida.domain.Cliente;
import com.IgrejaBatista.NovaVida.repositories.ClienteRepository;
import com.IgrejaBatista.NovaVida.services.exceptions.ObjectNotFoundException;


@Service
public class ClienteService {
  
	@Autowired
	private ClienteRepository repo;
	
	public Cliente find(Integer id) {
		Cliente obj = repo.findById(id).orElse(null);
		if(obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName());
		}
		return obj;
	}
}

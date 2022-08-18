package com.IgrejaBatista.NovaVida.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.IgrejaBatista.NovaVida.domain.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Integer> {

}

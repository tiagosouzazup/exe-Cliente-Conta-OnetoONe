package com.br.zup.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.br.zup.modells.Conta;

@Repository
public interface ContaRepository extends CrudRepository<Conta, Integer> {

}

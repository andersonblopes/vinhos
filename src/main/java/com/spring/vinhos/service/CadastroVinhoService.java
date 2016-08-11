package com.spring.vinhos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.vinhos.model.Vinho;
import com.spring.vinhos.repository.Vinhos;

@Service
public class CadastroVinhoService {

	@Autowired
	private Vinhos vinhos;

	public void salvar(Vinho vinho) {
		//Regras de negócio a serem implementadas
		this.vinhos.save(vinho);
	}
}
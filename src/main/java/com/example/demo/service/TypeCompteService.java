package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.beans.TypeCompte;
import com.example.demo.idao.idao;
import com.example.demo.repository.TypeCompteRepository;

public class TypeCompteService implements idao<TypeCompte>{

	@Autowired
	private TypeCompteRepository res;
	
	@Override
	public void create(TypeCompte o) {
		res.save(o);
		
	}

	@Override
	public void delete(TypeCompte o) {
		res.delete(o);
		
	}

	@Override
	public void update(TypeCompte o) {
		res.save(o);
		
	}

	@Override
	public List<TypeCompte> findAll() {
		return (List<TypeCompte>) res.findAll();
	}

	@Override
	public TypeCompte findById(int id) {
		return res.findById(id).get();
	}

}

package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.beans.Compte;
import com.example.demo.idao.idao;
import com.example.demo.repository.CompteRepository;

public class CompteService implements idao<Compte>{

	@Autowired
	private CompteRepository res;
	
	@Override
	public void create(Compte o) {
		res.save(o);
		
	}

	@Override
	public void delete(Compte o) {
		res.delete(o);
		
	}

	@Override
	public void update(Compte o) {
		res.save(o);
		
	}

	@Override
	public List<Compte> findAll() {
		return (List<Compte>) res.findAll();
	}

	@Override
	public Compte findById(int id) {
		return res.findById(id).get();
	}

}

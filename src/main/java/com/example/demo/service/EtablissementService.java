package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.beans.Etablissement;
import com.example.demo.idao.idao;
import com.example.demo.repository.EtablissementRepository;

public class EtablissementService implements idao<Etablissement> {

	@Autowired
	private EtablissementRepository res;
	
	@Override
	public void create(Etablissement o) {
		res.save(o);
		
	}

	@Override
	public void delete(Etablissement o) {
		res.delete(o);
		
	}

	@Override
	public void update(Etablissement o) {
		res.save(o);
		
	}

	@Override
	public List<Etablissement> findAll() {
		return (List<Etablissement>) res.findAll();
	}

	@Override
	public Etablissement findById(int id) {
		return res.findById(id).get();
	}

}

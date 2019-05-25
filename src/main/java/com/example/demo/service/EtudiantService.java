package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.beans.Etudiant;
import com.example.demo.idao.idao;
import com.example.demo.repository.EtudiantRepository;

public class EtudiantService implements idao<Etudiant> {

	@Autowired
	private EtudiantRepository res;
	
	@Override
	public void create(Etudiant o) {
		res.save(o);
		
	}

	@Override
	public void delete(Etudiant o) {
		res.delete(o);
		
	}

	@Override
	public void update(Etudiant o) {
		res.save(o);
		
	}

	@Override
	public List<Etudiant> findAll() {
		return (List<Etudiant>) res.findAll();
	}

	@Override
	public Etudiant findById(int id) {
		return res.findById(id).get();
	}

}

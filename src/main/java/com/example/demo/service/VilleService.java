package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.beans.Ville;
import com.example.demo.idao.idao;
import com.example.demo.repository.VilleRepository;

public class VilleService implements idao<Ville> {

	@Autowired
	private VilleRepository res;
	
	@Override
	public void create(Ville o) {
		res.save(o);
		
	}

	@Override
	public void delete(Ville o) {
		res.delete(o);
		
	}

	@Override
	public void update(Ville o) {
		res.save(o);
		
	}

	@Override
	public List<Ville> findAll() {
		return (List<Ville>) res.findAll();
 	}

	@Override
	public Ville findById(int id) {
		return res.findById(id).get();
	}

}

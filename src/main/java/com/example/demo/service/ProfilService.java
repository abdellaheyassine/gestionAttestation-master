package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.beans.Profil;
import com.example.demo.idao.idao;
import com.example.demo.repository.ProfilRepository;

public class ProfilService implements idao<Profil>{

	@Autowired
	private ProfilRepository res;
	
	@Override
	public void create(Profil o) {
		res.save(o);
		
	}

	@Override
	public void delete(Profil o) {
		res.delete(o);
		
	}

	@Override
	public void update(Profil o) {
		res.save(o);
		
	}

	@Override
	public List<Profil> findAll() {
		return (List<Profil>) res.findAll();
	}

	@Override
	public Profil findById(int id) {
		return res.findById(id).get();
	}

}

package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.beans.Attestation;
import com.example.demo.idao.idao;
import com.example.demo.repository.AttestationRepository;

public class AttestationService implements idao<Attestation>{

	@Autowired
	private AttestationRepository res;
	
	@Override
	public void create(Attestation o) {
		res.save(o);
		
	}

	@Override
	public void delete(Attestation o) {
		res.delete(o);
		
	}

	@Override
	public void update(Attestation o) {
		res.save(o);
		
	}

	@Override
	public List<Attestation> findAll() {
		return (List<Attestation>) res.findAll();
	}

	@Override
	public Attestation findById(int id) {
		return res.findById(id).get();
	}

}

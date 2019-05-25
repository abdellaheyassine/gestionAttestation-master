package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.beans.Employe;
import com.example.demo.idao.idao;
import com.example.demo.repository.EmployeRepository;

public class EmployeService implements idao<Employe>{

	@Autowired
	private EmployeRepository res;
	
	@Override
	public void create(Employe o) {
		res.save(o);
		
	}

	@Override
	public void delete(Employe o) {
		res.delete(o);
		
	}

	@Override
	public void update(Employe o) {
		res.save(o);
		
	}

	@Override
	public List<Employe> findAll() {
		return (List<Employe>) res.findAll();
	}

	@Override
	public Employe findById(int id) {
		return res.findById(id).get();
	}

}

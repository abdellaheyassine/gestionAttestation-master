package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.beans.Region;
import com.example.demo.idao.idao;
import com.example.demo.repository.RegionRepository;

public class RegionService implements idao<Region>{

	@Autowired
	private RegionRepository res;
	
	@Override
	public void create(Region o) {
		res.save(o);
	}

	@Override
	public void delete(Region o) {
		res.delete(o);
		
	}

	@Override
	public void update(Region o) {
		res.save(o);
		
	}

	@Override
	public List<Region> findAll() {
		return (List<Region>) res.findAll();
	}

	@Override
	public Region findById(int id) {
		return res.findById(id).get();
	}

}

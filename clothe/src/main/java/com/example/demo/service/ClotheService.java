package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Clothe;
import com.example.demo.repository.ClotheRepository;

@Service
public class ClotheService {
	
	@Autowired
    private ClotheRepository repo;

	public List<Clothe> listAll() {
		return repo.findAll();
	}
	
	public void save(Clothe clo) {
		repo.save(clo);
	}
	
	public Clothe get(long id) {
		return repo.findById(id).get();
	}
	
	public void delete(long id) {
		repo.deleteById(id);
	}

}

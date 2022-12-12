package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Produit;
import com.example.demo.repository.ProduitRepository;

@Service
public class ProduitService {
@Autowired
	private ProduitRepository repo;
	public List<Produit> listAll() {
	    return repo.findAll();
	}
	
	public void save(Produit std) {
	    repo.save(std);
	}
	
	public Produit get(long id) {
	    return repo.findById(id).get();
	}
	
	public void delete(long id) {
	    repo.deleteById(id);
	}
}

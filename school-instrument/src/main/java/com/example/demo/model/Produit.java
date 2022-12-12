package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produit {
@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
    private String nom;
    private String marque;
    private String fournisseur;
    
	
	public Produit() {
		
	}
	
	public Produit(Long id, String nom, String marque, String fournisseur) {
	
		this.id = id;
		this.nom = nom;
		this.marque = marque;
		this.fournisseur = fournisseur;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getFournisseur() {
		return fournisseur;
	}
	public void setFournisseur(String fournisseur) {
		this.fournisseur = fournisseur;
	}

	@Override
	public String toString() {
		return "Produit [id=" + id + ", nom=" + nom + ", marque=" + marque + ", fournisseur=" + fournisseur + "]";
	}
	


}

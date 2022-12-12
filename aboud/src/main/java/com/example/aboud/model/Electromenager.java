package com.example.aboud.model;


import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Electromenager implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idElectro;

    @Column
    String type;

    @Column
    String marque;

    @Column
    String quantite;

    @Column
    String prix;

    @Column
    String garantie;

	public Electromenager() {
		super();
	}

	public Electromenager(long idElectro, String type, String marque, String quantite, String prix, String garantie) {
		super();
		this.idElectro = idElectro;
		this.type = type;
		this.marque = marque;
		this.quantite = quantite;
		this.prix = prix;
		this.garantie = garantie;
	}

	public long getIdElectro() {
		return idElectro;
	}

	public void setIdElectro(long idElectro) {
		this.idElectro = idElectro;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getQuantite() {
		return quantite;
	}

	public void setQuantite(String quantite) {
		this.quantite = quantite;
	}

	public String getPrix() {
		return prix;
	}

	public void setPrix(String prix) {
		this.prix = prix;
	}

	public String getGarantie() {
		return garantie;
	}

	public void setGarantie(String garantie) {
		this.garantie = garantie;
	}

	@Override
	public String toString() {
		return "Electromenager [idElectro=" + idElectro + ", type=" + type + ", marque=" + marque + ", quantite="
				+ quantite + ", prix=" + prix + ", garantie=" + garantie + "]";
	}
    


}

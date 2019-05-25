package com.example.demo.beans;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Profil {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int code;
	private String libelle;
	@OneToMany(mappedBy="profil")
	private List<Employe> employes;
	
	
	public List<Employe> getEmployes() {
		return employes;
	}
	public void setEmployes(List<Employe> employes) {
		this.employes = employes;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public Profil(int code, String libelle) {
		super();
		this.code = code;
		this.libelle = libelle;
	}
	public Profil() {
		super();
	}
	public Profil(String libelle) {
		super();
		this.libelle = libelle;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + code;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Profil other = (Profil) obj;
		if (code != other.code)
			return false;
		return true;
	}
	
	
}

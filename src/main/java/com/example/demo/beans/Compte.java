package com.example.demo.beans;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;



@Entity
public class Compte {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String login;
	private String password;
	@OneToOne(mappedBy="compte")
	private Employe employe;
	@ManyToOne(fetch = FetchType.EAGER)
	private TypeCompte typeCompte;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Employe getEmploye() {
		return employe;
	}
	public void setEmploye(Employe employe) {
		this.employe = employe;
	}
	public TypeCompte getTypeCompte() {
		return typeCompte;
	}
	public void setTypeCompte(TypeCompte typeCompte) {
		this.typeCompte = typeCompte;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		Compte other = (Compte) obj;
		if (id != other.id)
			return false;
		return true;
	}
	public Compte(int id, String login, String password, Employe employe, TypeCompte typeCompte) {
		super();
		this.id = id;
		this.login = login;
		this.password = password;
		this.employe = employe;
		this.typeCompte = typeCompte;
	}
	public Compte() {
		super();
	}
	
	
	
}

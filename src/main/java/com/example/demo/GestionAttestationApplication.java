package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.beans.Profil;
import com.example.demo.service.ProfilService;


@SpringBootApplication
public class GestionAttestationApplication implements CommandLineRunner{

	
	@Autowired
	private ProfilService profil;
	
	public static void main(String[] args) {
		SpringApplication.run(GestionAttestationApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		profil.create(new Profil(1,"profil1"));
	}

}

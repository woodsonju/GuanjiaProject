package fr.dawan.guanjia.entities;

import javax.persistence.Entity;

@Entity
public class Admin extends Utilisateur{

	public Admin() {
		super();
	}

	public Admin(String nom, String prenom, String email, String pwd, boolean statut, TypeUtilisateur typeUtilisateur) {
		super(nom, prenom, email, pwd, statut, typeUtilisateur);
	}
	
}

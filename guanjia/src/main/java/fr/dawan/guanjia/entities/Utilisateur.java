package fr.dawan.guanjia.entities;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance (strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="utilisateur_discriminator", 
		discriminatorType = DiscriminatorType.STRING)
public abstract class Utilisateur extends DbObject{
	
	private String nom;
	private String prenom;
	private String email;
	private String pwd;
	private boolean statut;
	@Enumerated(EnumType.STRING)
	private TypeUtilisateur typeUtilisateur;

	
	public Utilisateur() {
		super();
	}

	public Utilisateur(String nom, String prenom, String email, String pwd, boolean statut,
			TypeUtilisateur typeUtilisateur) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.pwd = pwd;
		this.statut = statut;
		this.typeUtilisateur = typeUtilisateur;
	}
	
	
	
}

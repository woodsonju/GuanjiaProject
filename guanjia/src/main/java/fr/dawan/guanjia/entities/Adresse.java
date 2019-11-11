package fr.dawan.guanjia.entities;

import javax.persistence.Embeddable;

@Embeddable
public class Adresse{
	private String libelle;
	private String codePostale;
	private String Ville;
	private String pays;
}

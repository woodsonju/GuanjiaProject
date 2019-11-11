package fr.dawan.guanjia.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
@DiscriminatorValue("UTILISATEUR_PRESTATAIRE")
public class Prestataire extends Utilisateur {
	private String raisonSocial;
	private String numTelephone;
	
	@Embedded
	private Adresse adressePrestataire;
	
	@ManyToMany(mappedBy = "listPrestataire")
	private List<Prestation> listPrestation = new ArrayList<Prestation>();
	
	@ManyToOne
	private Enseigne enseigne;
}



package fr.dawan.guanjia.entities;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class LigneDeCommande extends DbObject{
	
	private int quantite;
	private double prixTotal;
	
	@OneToOne
	private ProduitPresta produitPresta;
	
	@ManyToOne
	private Panier panier;
	
	@ManyToOne
	private Prestation prestation;
	
}

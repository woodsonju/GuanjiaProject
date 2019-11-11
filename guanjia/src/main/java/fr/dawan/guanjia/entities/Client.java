package fr.dawan.guanjia.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

@Entity
@DiscriminatorValue("UTILISATEUR_CLIENT")
public class Client extends Utilisateur{
	
	private String numTelephone;
	
	@OneToMany(mappedBy = "client", cascade = CascadeType.PERSIST)
	private List<Panier> listPanier = new ArrayList<Panier>();
	
	@Transient
	private Map<String, String> preferences;
}

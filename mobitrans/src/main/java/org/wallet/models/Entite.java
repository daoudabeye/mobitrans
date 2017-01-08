package org.wallet.models;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the entite database table.
 * 
 */
@Entity
@NamedQuery(name="Entite.findAll", query="SELECT e FROM Entite e")
public class Entite implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String adresse;

	@Column(name="boite_postal")
	private String boitePostal;

	private double decouvert;

	private String fax;

	private String nom;
	
	private String designation;
	
	private String type;

	private String telephone;

	private String zone;
	
	private Integer niveau;

	//bi-directional many-to-one association to Entite
	@ManyToOne
	@JoinColumn(name="entite_superieur_id")
	private Entite entite;

	//bi-directional many-to-one association to Entite
	@OneToMany(mappedBy="entite")
	private List<Entite> entites;

	//bi-directional many-to-one association to Pay
	@ManyToOne
	@JoinColumn(name="pays_id")
	private Pays pays;

	//bi-directional many-to-one association to Utilisateur
	@OneToMany(mappedBy="entite")
	private List<Utilisateur> utilisateurs;

	public Entite() {
	}

	public Entite(String adresse, String boitePostal, double decouvert, String fax, String nom, String designation,
			String type, String telephone, String zone, Integer niveau, Pays pays) {
		super();
		this.adresse = adresse;
		this.boitePostal = boitePostal;
		this.decouvert = decouvert;
		this.fax = fax;
		this.nom = nom;
		this.designation = designation;
		this.type = type;
		this.telephone = telephone;
		this.zone = zone;
		this.niveau = niveau;
		this.pays = pays;
	}



	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdresse() {
		return this.adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getBoitePostal() {
		return this.boitePostal;
	}

	public void setBoitePostal(String boitePostal) {
		this.boitePostal = boitePostal;
	}

	public double getDecouvert() {
		return this.decouvert;
	}

	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getZone() {
		return this.zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public Entite getEntite() {
		return this.entite;
	}

	public void setEntite(Entite entite) {
		this.entite = entite;
	}

	public List<Entite> getEntites() {
		return this.entites;
	}

	public void setEntites(List<Entite> entites) {
		this.entites = entites;
	}

	public Entite addEntite(Entite entite) {
		getEntites().add(entite);
		entite.setEntite(this);

		return entite;
	}

	public Entite removeEntite(Entite entite) {
		getEntites().remove(entite);
		entite.setEntite(null);

		return entite;
	}

	public Pays getPays() {
		return this.pays;
	}

	public void setPays(Pays pays) {
		this.pays = pays;
	}

	public List<Utilisateur> getUtilisateurs() {
		return this.utilisateurs;
	}

	public void setUtilisateurs(List<Utilisateur> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}

	public Utilisateur addUtilisateur(Utilisateur utilisateur) {
		getUtilisateurs().add(utilisateur);
		utilisateur.setEntite(this);

		return utilisateur;
	}

	public Utilisateur removeUtilisateur(Utilisateur utilisateur) {
		getUtilisateurs().remove(utilisateur);
		utilisateur.setEntite(null);

		return utilisateur;
	}

	public Integer getNiveau() {
		return niveau;
	}

	public void setNiveau(Integer niveau) {
		this.niveau = niveau;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
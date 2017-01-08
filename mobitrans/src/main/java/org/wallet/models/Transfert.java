package org.wallet.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the transfert database table.
 * 
 */
@Entity
@NamedQuery(name="Transfert.findAll", query="SELECT t FROM Transfert t")
public class Transfert implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;
	
	private String mtn;
	
	@Column(name="folio" ,unique = true)
	private String folio;

	@Temporal(TemporalType.TIMESTAMP)
	private Date date;

	private String devise;

	private Double frais;

	@Column(name="methode_livraison")
	private String methodeLivraison;

	private Double montant;

	private String details;
	
	private String motif;

	@Column(name="agent_id_expediteur")
	private Long idAgentExpediteur;
	
	@Column(name="agent_id_beneficiaire")
	private Long idAgentBeneficiaire;

	@Column(name="numero_beneficiaire")
	private String numeroBeneficiaire;
	
	@Column(name="nom_beneficiaire")
	private String nomBeneficiaire;
	
	@Column(name="prenom_beneficiaire")
	private String prenomBeneficiaire;
	
	@Column(name="adresse_beneficiaire")
	private String adresseBeneficiaire;
	
	@Column(name="piece_id_beneficiaire")
	private String pieceIdBeneficiaire;
	
	@Column(name="ville_beneficiaire")
	private String villeBeneficiaire;
	
	@Column(name="pays_beneficiaire")
	private String paysBeneficiaire;

	@Column(name="numero_expediteur")
	private String numeroExpediteur;
	
	@Column(name="nom_expediteur")
	private String nomExpediteur;
	
	@Column(name="prenom_expediteur")
	private String prenomExpediteur;
	
	@Column(name="adresse_expediteur")
	private String adresseExpediteur;
	
	@Column(name="piece_id_expediteur")
	private String pieceIdExpediteur;

	@Column(name="pays_expediteur")
	private String paysExpediteur;
	
	@Column(name="ville_expediteur")
	private String villeExpediteur;

	@Column(name="date_envois")
	private Date dateEnvois;

	@Column(name="statut_code")
	private String statutCode;

	@Column(name="tcp_statut")
	private String tcpStatut;

	public Transfert() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMtn() {
		return mtn;
	}

	public void setMtn(String mtn) {
		this.mtn = mtn;
	}

	public String getFolio() {
		return folio;
	}

	public void setFolio(String folio) {
		this.folio = folio;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDevise() {
		return devise;
	}

	public void setDevise(String devise) {
		this.devise = devise;
	}

	public Double getFrais() {
		return frais;
	}

	public void setFrais(Double frais) {
		this.frais = frais;
	}

	public String getMethodeLivraison() {
		return methodeLivraison;
	}

	public void setMethodeLivraison(String methodeLivraison) {
		this.methodeLivraison = methodeLivraison;
	}

	public Double getMontant() {
		return montant;
	}

	public void setMontant(Double montant) {
		this.montant = montant;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getMotif() {
		return motif;
	}

	public void setMotif(String motif) {
		this.motif = motif;
	}

	public Long getIdAgentExpediteur() {
		return idAgentExpediteur;
	}

	public void setIdAgentExpediteur(Long idAgentExpediteur) {
		this.idAgentExpediteur = idAgentExpediteur;
	}

	public Long getIdAgentBeneficiaire() {
		return idAgentBeneficiaire;
	}

	public void setIdAgentBeneficiaire(Long idAgentBeneficiaire) {
		this.idAgentBeneficiaire = idAgentBeneficiaire;
	}

	public String getNumeroBeneficiaire() {
		return numeroBeneficiaire;
	}

	public void setNumeroBeneficiaire(String numeroBeneficiaire) {
		this.numeroBeneficiaire = numeroBeneficiaire;
	}

	public String getNomBeneficiaire() {
		return nomBeneficiaire;
	}

	public void setNomBeneficiaire(String nomBeneficiaire) {
		this.nomBeneficiaire = nomBeneficiaire;
	}

	public String getPrenomBeneficiaire() {
		return prenomBeneficiaire;
	}

	public void setPrenomBeneficiaire(String prenomBeneficiaire) {
		this.prenomBeneficiaire = prenomBeneficiaire;
	}

	public String getAdresseBeneficiaire() {
		return adresseBeneficiaire;
	}

	public void setAdresseBeneficiaire(String adresseBeneficiaire) {
		this.adresseBeneficiaire = adresseBeneficiaire;
	}

	public String getPieceIdBeneficiaire() {
		return pieceIdBeneficiaire;
	}

	public void setPieceIdBeneficiaire(String pieceIdBeneficiaire) {
		this.pieceIdBeneficiaire = pieceIdBeneficiaire;
	}

	public String getVilleBeneficiaire() {
		return villeBeneficiaire;
	}

	public void setVilleBeneficiaire(String villeBeneficiaire) {
		this.villeBeneficiaire = villeBeneficiaire;
	}

	public String getPaysBeneficiaire() {
		return paysBeneficiaire;
	}

	public void setPaysBeneficiaire(String paysBeneficiaire) {
		this.paysBeneficiaire = paysBeneficiaire;
	}

	public String getNumeroExpediteur() {
		return numeroExpediteur;
	}

	public void setNumeroExpediteur(String numeroExpediteur) {
		this.numeroExpediteur = numeroExpediteur;
	}

	public String getNomExpediteur() {
		return nomExpediteur;
	}

	public void setNomExpediteur(String nomExpediteur) {
		this.nomExpediteur = nomExpediteur;
	}

	public String getPrenomExpediteur() {
		return prenomExpediteur;
	}

	public void setPrenomExpediteur(String prenomExpediteur) {
		this.prenomExpediteur = prenomExpediteur;
	}

	public String getAdresseExpediteur() {
		return adresseExpediteur;
	}

	public void setAdresseExpediteur(String adresseExpediteur) {
		this.adresseExpediteur = adresseExpediteur;
	}

	public String getPieceIdExpediteur() {
		return pieceIdExpediteur;
	}

	public void setPieceIdExpediteur(String pieceIdExpediteur) {
		this.pieceIdExpediteur = pieceIdExpediteur;
	}

	public String getPaysExpediteur() {
		return paysExpediteur;
	}

	public void setPaysExpediteur(String paysExpediteur) {
		this.paysExpediteur = paysExpediteur;
	}

	public String getVilleExpediteur() {
		return villeExpediteur;
	}

	public void setVilleExpediteur(String villeExpediteur) {
		this.villeExpediteur = villeExpediteur;
	}

	public Date getDateEnvois() {
		return dateEnvois;
	}

	public void setDateEnvois(Date dateEnvois) {
		this.dateEnvois = dateEnvois;
	}

	public String getStatutCode() {
		return statutCode;
	}

	public void setStatutCode(String statutCode) {
		this.statutCode = statutCode;
	}

	public String getTcpStatut() {
		return tcpStatut;
	}

	public void setTcpStatut(String tcpStatut) {
		this.tcpStatut = tcpStatut;
	}

}
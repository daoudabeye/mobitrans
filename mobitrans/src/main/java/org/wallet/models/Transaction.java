package org.wallet.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the transaction database table.
 * 
 */
@Entity
@NamedQuery(name="Transaction.findAll", query="SELECT t FROM Transaction t")
public class Transaction implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	@Column(name="agent_id")
	private Long agentId;

	@Column(name="agent_numero")
	private String agentNumero;

	@Column(name="code_transaction", unique = true)
	private String codeTransaction;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_operation")
	private Date dateOperation;

	private String details;

	private double frais;

	private double montant;

	private String statut;

	@Column(name="statut_code")
	private String statutCode;

	private String type;

	@Column(name="validation_required")
	private Boolean validationRequired;

	@Column(name="valider_par")
	private String validerPar;

	//bi-directional many-to-one association to Compte
	@ManyToOne
	@JoinColumn(name="numero_compte")
	private Compte compte;

	public Transaction() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getAgentId() {
		return this.agentId;
	}

	public void setAgentId(Long agentId) {
		this.agentId = agentId;
	}

	public String getAgentNumero() {
		return this.agentNumero;
	}

	public void setAgentNumero(String agentNumero) {
		this.agentNumero = agentNumero;
	}

	public String getCodeTransaction() {
		return this.codeTransaction;
	}

	public void setCode(String code) {
		this.codeTransaction = code;
	}

	public Date getDateOperation() {
		return this.dateOperation;
	}

	public void setDateOperation(Date dateOperation) {
		this.dateOperation = dateOperation;
	}

	public String getDetails() {
		return this.details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public double getFrais() {
		return this.frais;
	}

	public void setFrais(double frais) {
		this.frais = frais;
	}

	public double getMontant() {
		return this.montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public String getStatut() {
		return this.statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

	public String getStatutCode() {
		return this.statutCode;
	}

	public void setStatutCode(String statutCode) {
		this.statutCode = statutCode;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Boolean getValidationRequired() {
		return this.validationRequired;
	}

	public void setValidationRequired(Boolean validationRequired) {
		this.validationRequired = validationRequired;
	}

	public String getValiderPar() {
		return this.validerPar;
	}

	public void setValiderPar(String validerPar) {
		this.validerPar = validerPar;
	}

	public Compte getCompte() {
		return this.compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}

}
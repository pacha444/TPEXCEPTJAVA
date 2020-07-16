package com.compte;

import com.membre.Client;

public abstract class Compte {
	protected String idcompte;
	private String nomagence;
	private long solde;
	private Client cli;
	
	
	
	public Compte(String idcompte, String nomagence, long solde, Client cli) {
		super();
		this.idcompte = idcompte;
		this.nomagence = nomagence;
		this.solde = solde;
		this.cli = cli;
	}
	public String getIdcompte() {
		return idcompte;
	}
	public void setIdcompte(String idcompte) {
		this.idcompte = idcompte;
	}
	public String getNomagence() {
		return nomagence;
	}
	public void setNomagence(String nomagence) {
		this.nomagence = nomagence;
	}
    
	
	public long getSolde() {
		return solde;
	}
	public void setSolde(long solde) {
		this.solde = solde;
	}
	public Client getCli() {
		return cli;
	}

	public void setCli(Client cli) {
		this.cli = cli;
	}

	public abstract void calculsolde();

}

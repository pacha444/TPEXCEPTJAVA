package com.compte;

import com.membre.Client;

public class cpteepargneprev extends Compte {
	private int fraisouverture;


	

	

	
	public cpteepargneprev(String idcompte, String nomagence, long solde, Client cli, int fraisouverture) {
		super(idcompte, nomagence, solde, cli);
		this.fraisouverture = fraisouverture;
	}

	public int getFraisouverture() {
		return fraisouverture;
	}

	public void setFraisouverture(int fraisouverture) {
		this.fraisouverture = fraisouverture;
	}


	@Override
	public void calculsolde() {
		// TODO Auto-generated method stub
		
	}

	}



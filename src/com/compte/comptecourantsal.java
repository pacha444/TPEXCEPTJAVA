package com.compte;

import com.membre.Client;

public class comptecourantsal extends Compte {
	
	
	private int sal;
	private int agios;
	
	
	
	
	
	public comptecourantsal(String idcompte, String nomagence, long solde, Client cli, int sal, int agios) {
		super(idcompte, nomagence, solde, cli);
		this.sal = sal;
		this.agios = agios;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getAgios() {
		return agios;
	}
	public void setAgios(int agios) {
		this.agios = agios;
	}
	@Override
	public void calculsolde() {
		// TODO Auto-generated method stub
		if(idcompte.length()<=0)
		{
			
		}
		
	}
	
	
	
}

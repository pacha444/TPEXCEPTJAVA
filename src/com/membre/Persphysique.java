package com.membre;

import java.util.Date;

public class Persphysique extends Client {
	
	
	private String matmembre;
	private String nom;
	private String prenom;
	private Date datenaiss;
	private String lieunaiss;
	private String numcin;
    private int nbreenfants;
    private String sitmatrimoniale;
    
    
	

	
     
	public Persphysique(int idclient, String tel, String email, String matmembre, String nom, String prenom,
			Date datenaiss, String lieunaiss, String numcin, int nbreenfants, String sitmatrimoniale) {
		super(idclient, tel, email);
		this.matmembre = matmembre;
		this.nom = nom;
		this.prenom = prenom;
		this.datenaiss = datenaiss;
		this.lieunaiss = lieunaiss;
		this.numcin = numcin;
		this.nbreenfants = nbreenfants;
		this.sitmatrimoniale = sitmatrimoniale;
	}





	@Override
	public String toString() {
		return "Persphysique [matmembre=" + matmembre + ", nom=" + nom + ", prenom=" + prenom + ", datenaiss="
				+ datenaiss + ", lieunaiss=" + lieunaiss + ", numcin=" + numcin + ", nbreenfants=" + nbreenfants
				+ ", sitmatrimoniale=" + sitmatrimoniale + "]";
	}





	public String getMatmembre() {
		return matmembre;
	}




	public void setMatmembre(String matmembre) {
		this.matmembre = matmembre;
	}




	public String getNom() {
		return nom;
	}




	public void setNom(String nom) {
		this.nom = nom;
	}




	public String getPrenom() {
		return prenom;
	}




	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}




	public Date getDatenaiss() {
		return datenaiss;
	}




	public void setDatenaiss(Date datenaiss) {
		this.datenaiss = datenaiss;
	}




	public String getLieunaiss() {
		return lieunaiss;
	}




	public void setLieunaiss(String lieunaiss) {
		this.lieunaiss = lieunaiss;
	}




	public String getNumcin() {
		return numcin;
	}




	public void setNumcin(String numcin) {
		this.numcin = numcin;
	}




	public int getNbreenfants() {
		return nbreenfants;
	}




	public void setNbreenfants(int nbreenfants) {
		this.nbreenfants = nbreenfants;
	}




	public String getSitmatrimoniale() {
		return sitmatrimoniale;
	}




	public void setSitmatrimoniale(String sitmatrimoniale) {
		this.sitmatrimoniale = sitmatrimoniale;
	}
	
	

}

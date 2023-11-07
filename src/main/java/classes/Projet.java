package classes;

import java.util.Date;

public class Projet {
	private int idProjet;
	private String nomMatiere;
	private String sujet;
	private Date dateRemisePrevue;
	public Projet(int idProjet, String nomMatiere, String sujet, Date dateRemisePrevue) {
		super();
		this.idProjet = idProjet;
		this.nomMatiere = nomMatiere;
		this.sujet = sujet;
		this.dateRemisePrevue = dateRemisePrevue;
	}
	public int getIdProjet() {
		return idProjet;
	}
	public void setIdProjet(int idProjet) {
		this.idProjet = idProjet;
	}
	public String getNomMatiere() {
		return nomMatiere;
	}
	public void setNomMatiere(String nomMatiere) {
		this.nomMatiere = nomMatiere;
	}
	public String getSujet() {
		return sujet;
	}
	public void setSujet(String sujet) {
		this.sujet = sujet;
	}
	public Date getDateRemisePrevue() {
		return dateRemisePrevue;
	}
	public void setDateRemisePrevue(Date dateRemisePrevue) {
		this.dateRemisePrevue = dateRemisePrevue;
	}
	@Override
	public String toString() {
		return "Projet [idProjet=" + idProjet + ", nomMatiere=" + nomMatiere + ", sujet=" + sujet
				+ ", dateRemisePrevue=" + dateRemisePrevue + "]";
	}
	
}

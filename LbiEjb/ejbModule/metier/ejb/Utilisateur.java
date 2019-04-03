package metier.ejb;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Utilisateur
 *
 */
@Entity

public class Utilisateur implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_utilisateur;
	private String nom_utilisateur;
	private String prenom_utilisateur;
	private String mdp_utilisateur;
	private int droit_acces;
	private String login;
	private static final long serialVersionUID = 1L;

	public Utilisateur() {
		super();
	}   
	public Utilisateur(String nom_utilisateur, String prenom_utilisateur, String mdp_utilisateur, int droit_acces, String login) {
		this.nom_utilisateur=nom_utilisateur;
		this.prenom_utilisateur=prenom_utilisateur;
		this.mdp_utilisateur=mdp_utilisateur;
		this.droit_acces=droit_acces;
		this.login=login;
	}
	
	public Utilisateur(String nom_utilisateur2, String mdp_utilisateur2, int droit_acces2, String login2) {
		this.nom_utilisateur=nom_utilisateur2;
		this.mdp_utilisateur=mdp_utilisateur2;
		this.droit_acces=droit_acces2;
		this.login=login2;
	}
	public int getId_utilisateur() {
		return this.id_utilisateur;
	}

	public void setId_utilisateur(int id_utilisateur) {
		this.id_utilisateur = id_utilisateur;
	}   
	public String getNom_utilisateur() {
		return this.nom_utilisateur;
	}

	public void setNom_utilisateur(String nom_utilisateur) {
		this.nom_utilisateur = nom_utilisateur;
	}   
	public String getPrenom_utilisateur() {
		return this.prenom_utilisateur;
	}

	
	public void setPrenom_utilisateur(String prenom_utilisateur) {
		this.prenom_utilisateur = prenom_utilisateur;
	}   
	public String getMdp_utilisateur() {
		return this.mdp_utilisateur;
	}

	public void setMdp_utilisateur(String mdp_utilisateur) {
		this.mdp_utilisateur = mdp_utilisateur;
	}   
	public int getDroit_acces() {
		return this.droit_acces;
	}

	public void setDroit_acces(int droit_acces) {
		this.droit_acces = droit_acces;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
   
}

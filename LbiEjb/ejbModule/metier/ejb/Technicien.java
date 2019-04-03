package metier.ejb;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Technicien
 *
 */
@Entity

public class Technicien implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_technicien;
	private String nom;
	private String fonction_tech;
	private int numero;
	private static final long serialVersionUID = 1L;

	public Technicien() {
		super();
	}   
	public Technicien(String nom2, String fonction, int numero2) {
		this.nom=nom2;
		this.fonction_tech=fonction;
		this.numero=numero2;
	}
	public int getId_technicien() {
		return this.id_technicien;
	}

	public void setId_technicien(int id_technicien) {
		this.id_technicien = id_technicien;
	}   
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}   
	public String getFonction_tech() {
		return this.fonction_tech;
	}

	public void setFonction_tech(String fonction_tech) {
		this.fonction_tech = fonction_tech;
	}   
	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
   
}

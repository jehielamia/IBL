package metier.ejb;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Materiel
 *
 */
@Entity

public class Materiel implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_materiel;
	private String marque;
	private String type;
	private String modele;
	private String matricule;
	private String fin_garantie;
	private static final long serialVersionUID = 1L;

	public Materiel() {
		super();
	}   
	public Materiel(String marque, String type, String modele, String matricule, String fin_garantie) {
		
	this.marque=marque;
	this.type=type;
	this.modele=modele;
	this.matricule=matricule;
	this.fin_garantie=fin_garantie;
	}
	
	
	
	public int getId_materiel() {
		return this.id_materiel;
	}

	public void setId_materiel(int id_materiel) {
		this.id_materiel = id_materiel;
	}   
	public String getMarque() {
		return this.marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}   
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}   
	public String getModele() {
		return this.modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}   
	public String getMatricule() {
		return this.matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public String getFin_garantie() {
		return fin_garantie;
	}
	public void setFin_garantie(String fin_garantie) {
		this.fin_garantie = fin_garantie;
	}
	
   
}

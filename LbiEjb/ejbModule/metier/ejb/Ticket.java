package metier.ejb;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Ticket
 *
 */
@Entity

public class Ticket implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_ticket;
	private String etat_ticket;
	private String type_ticket;
	private int priorite;
	private String description_panne;
	private String description_travaux;
	private Date date_appel;
	private Date date_intervention;
	private Time h_intervention;
	private Time h_arrivee;
	private Time h_depart;
	private String raison_cloture;
	private String nom_responsable;
	private int tel_fixe;
	private int tel_mobile;
	private String tech1;
	private String tech2;
	private String tech3;
	private String tech4;
	
	private static final long serialVersionUID = 1L;

	public Ticket() {
		super();
	}

	public Ticket(String etat_ticket2, String type_ticket2, String description_panne2,
			String description_travaux2, Date date_appel2, Date date_intervention2, Time h_intervention2,
			Time h_arrivee2, Time h_depart2, String raison_cloture2, String nom_responsable2, int tel_fixe2,
			int tel_mobile2, String tech1, String tech2, String tech3, String tech4) {
		this.etat_ticket=etat_ticket2;
		this.type_ticket=type_ticket2;
		this.description_panne=description_panne2;
		this.description_travaux=description_travaux2;
		this.date_appel=date_appel2;
		this.date_intervention=date_intervention2;
		this.h_intervention=h_intervention2;
		this.h_arrivee=h_arrivee2;
		this.h_depart=h_depart2;
		this.raison_cloture=raison_cloture2;
		this.nom_responsable=nom_responsable2;
		this.tel_fixe=tel_fixe2;
		this.tel_mobile=tel_mobile2;
		this.tech1=tech1;
		this.tech2=tech2;
		this.tech3=tech3;
		this.tech4=tech4;
		
		
		
	}

	public int getId_ticket() {
		return id_ticket;
	}

	public void setId_ticket(int id_ticket) {
		this.id_ticket = id_ticket;
	}

	public String getEtat_ticket() {
		return etat_ticket;
	}

	public void setEtat_ticket(String etat_ticket) {
		this.etat_ticket = etat_ticket;
	}

	public String getType_ticket() {
		return type_ticket;
	}

	public void setType_ticket(String type_ticket) {
		this.type_ticket = type_ticket;
	}

	

	public String getDescription_panne() {
		return description_panne;
	}

	public void setDescription_panne(String description_panne) {
		this.description_panne = description_panne;
	}

	public String getDescription_travaux() {
		return description_travaux;
	}

	public void setDescription_travaux(String description_travaux) {
		this.description_travaux = description_travaux;
	}

	public Date getDate_appel() {
		return date_appel;
	}

	public void setDate_appel(Date date_appel) {
		this.date_appel = date_appel;
	}

	public Date getDate_intervention() {
		return date_intervention;
	}

	public void setDate_intervention(Date date_intervention) {
		this.date_intervention = date_intervention;
	}

	public Time getH_intervention() {
		return h_intervention;
	}

	public void setH_intervention(Time h_intervention) {
		this.h_intervention = h_intervention;
	}

	public Time getH_arrivee() {
		return h_arrivee;
	}

	public void setH_arrivee(Time h_arrivee) {
		this.h_arrivee = h_arrivee;
	}

	public Time getH_depart() {
		return h_depart;
	}

	public void setH_depart(Time h_depart) {
		this.h_depart = h_depart;
	}

	public String getRaison_cloture() {
		return raison_cloture;
	}

	public void setRaison_cloture(String raison_cloture) {
		this.raison_cloture = raison_cloture;
	}

	public String getNom_responsable() {
		return nom_responsable;
	}

	public void setNom_responsable(String nom_responsable) {
		this.nom_responsable = nom_responsable;
	}

	public int getTel_fixe() {
		return tel_fixe;
	}

	public void setTel_fixe(int tel_fixe) {
		this.tel_fixe = tel_fixe;
	}

	public int getTel_mobile() {
		return tel_mobile;
	}

	public void setTel_mobile(int tel_mobile) {
		this.tel_mobile = tel_mobile;
	}

	public String getTech1() {
		return tech1;
	}

	public void setTech1(String tech1) {
		this.tech1 = tech1;
	}

	public String getTech2() {
		return tech2;
	}

	public void setTech2(String tech2) {
		this.tech2 = tech2;
	}

	public String getTech3() {
		return tech3;
	}

	public void setTech3(String tech3) {
		this.tech3 = tech3;
	}

	public String getTech4() {
		return tech4;
	}

	public void setTech4(String tech4) {
		this.tech4 = tech4;
	}
	
   
}

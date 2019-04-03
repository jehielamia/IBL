package metier.ejb;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: ClientLbi
 *
 */
@Entity

public class ClientLbi implements Serializable {

	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_client;
	private String etablissement;
	private String adr_client;
	private String ville_client;
	private int contrat_regie;
	
	private String nom_contact1;
	private String prenom_contact1;
	private String fonction_contact1;
	private int num_contact1;
	private String mail_contact1;
	
	private String nom_contact2;
	private String prenom_contact2;
	private String fonction_contact2;
	private int num_contact2;
	private String mail_contact2;
	
	private String nom_contact3;
	private String prenom_contact3;
	private String fonction_contact3;
	private int num_contact3;
	private String mail_contact3;
	
	
	private static final long serialVersionUID = 1L;

	public ClientLbi() {
		super();
	}

	public ClientLbi(String etablissement, String adr_client, String ville_client, int contrat_regie, String nom_contact1,
			String prenom_contact1, String fonction_contact1, int num_contact1, String mail_contact1,
			String nom_contact2, String prenom_contact2, String fonction_contact2, int num_contact2,
			String mail_contact2, String nom_contact3, String prenom_contact3, String fonction_contact3,
			int num_contact3, String mail_contact3) {
		super();
		this.etablissement = etablissement;
		this.adr_client = adr_client;
		this.ville_client = ville_client;
		this.contrat_regie = contrat_regie;
		this.nom_contact1 = nom_contact1;
		this.prenom_contact1 = prenom_contact1;
		this.fonction_contact1 = fonction_contact1;
		this.num_contact1 = num_contact1;
		this.mail_contact1 = mail_contact1;
		this.nom_contact2 = nom_contact2;
		this.prenom_contact2 = prenom_contact2;
		this.fonction_contact2 = fonction_contact2;
		this.num_contact2 = num_contact2;
		this.mail_contact2 = mail_contact2;
		this.nom_contact3 = nom_contact3;
		this.prenom_contact3 = prenom_contact3;
		this.fonction_contact3 = fonction_contact3;
		this.num_contact3 = num_contact3;
		this.mail_contact3 = mail_contact3;
		
	}

	public ClientLbi(String etab, String nom) {
	this.etablissement=etab;
	this.nom_contact1=nom;
	
	}

	public int getId_client() {
		return id_client;
	}

	public void setId_client(int id_client) {
		this.id_client = id_client;
	}

	public String getEtablissement() {
		return etablissement;
	}

	public void setEtablissement(String etablissement) {
		this.etablissement = etablissement;
	}

	public String getAdr_client() {
		return adr_client;
	}

	public void setAdr_client(String adr_client) {
		this.adr_client = adr_client;
	}

	public String getVille_client() {
		return ville_client;
	}

	public void setVille_client(String ville_client) {
		this.ville_client = ville_client;
	}

	public int getContrat_regie() {
		return contrat_regie;
	}

	public void setContrat_regie(int contrat_regie) {
		this.contrat_regie = contrat_regie;
	}

	public String getNom_contact1() {
		return nom_contact1;
	}

	public void setNom_contact1(String nom_contact1) {
		this.nom_contact1 = nom_contact1;
	}

	public String getPrenom_contact1() {
		return prenom_contact1;
	}

	public void setPrenom_contact1(String prenom_contact1) {
		this.prenom_contact1 = prenom_contact1;
	}

	public String getFonction_contact1() {
		return fonction_contact1;
	}

	public void setFonction_contact1(String fonction_contact1) {
		this.fonction_contact1 = fonction_contact1;
	}

	public int getNum_contact1() {
		return num_contact1;
	}

	public void setNum_contact1(int num_contact1) {
		this.num_contact1 = num_contact1;
	}

	public String getMail_contact1() {
		return mail_contact1;
	}

	public void setMail_contact1(String mail_contact1) {
		this.mail_contact1 = mail_contact1;
	}

	public String getNom_contact2() {
		return nom_contact2;
	}

	public void setNom_contact2(String nom_contact2) {
		this.nom_contact2 = nom_contact2;
	}

	public String getPrenom_contact2() {
		return prenom_contact2;
	}

	public void setPrenom_contact2(String prenom_contact2) {
		this.prenom_contact2 = prenom_contact2;
	}

	public String getFonction_contact2() {
		return fonction_contact2;
	}

	public void setFonction_contact2(String fonction_contact2) {
		this.fonction_contact2 = fonction_contact2;
	}

	public int getNum_contact2() {
		return num_contact2;
	}

	public void setNum_contact2(int num_contact2) {
		this.num_contact2 = num_contact2;
	}

	public String getMail_contact2() {
		return mail_contact2;
	}

	public void setMail_contact2(String mail_contact2) {
		this.mail_contact2 = mail_contact2;
	}

	public String getNom_contact3() {
		return nom_contact3;
	}

	public void setNom_contact3(String nom_contact3) {
		this.nom_contact3 = nom_contact3;
	}

	public String getPrenom_contact3() {
		return prenom_contact3;
	}

	public void setPrenom_contact3(String prenom_contact3) {
		this.prenom_contact3 = prenom_contact3;
	}

	public String getFonction_contact3() {
		return fonction_contact3;
	}

	public void setFonction_contact3(String fonction_contact3) {
		this.fonction_contact3 = fonction_contact3;
	}

	public int getNum_contact3() {
		return num_contact3;
	}

	public void setNum_contact3(int num_contact3) {
		this.num_contact3 = num_contact3;
	}

	public String getMail_contact3() {
		return mail_contact3;
	}

	public void setMail_contact3(String mail_contact3) {
		this.mail_contact3 = mail_contact3;
	}
	
   
}

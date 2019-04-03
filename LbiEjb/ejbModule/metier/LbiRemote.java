package metier;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

import javax.ejb.Remote;

import metier.ejb.ClientLbi;
import metier.ejb.DonneurOrdre;
import metier.ejb.Materiel;
import metier.ejb.Technicien;
import metier.ejb.Ticket;
import metier.ejb.TypeMateriel;
import metier.ejb.Utilisateur;

@Remote
public interface LbiRemote {
	public ClientLbi addClient(String etablissement, String adr_client, String ville_client, int contrat_régie, String nom_contact1, String prenom_contact1,String fonction_contact1, int num_contact1, String mail_contact1, String nom_contact2, String prenom_contact2,String fonction_contact2, int num_contact2, String mail_contact2, String nom_contact3, String prenom_contact3,String fonction_contact3, int num_contact3, String mail_contact3);
	public void updateClient(ClientLbi cl);
	public List <ClientLbi> getClient();
	public DonneurOrdre addDonneur(String intitule,String nomD1, String prenomD1, String fonctionD1, int numeroD1, String mailD1, 
			String nomD2, String prenomD2, String fonctionD2, int numeroD2, String mailD2,
			String nomD3, String prenomD3, String fonctionD3, int numeroD3, String mailD3);
	public void updateDonneur(DonneurOrdre d);
	public List<DonneurOrdre> getDonneur();

	public Ticket addTicket(String etat_ticket, String type_ticket, String description_panne, String description_travaux,
	Date date_appel,Date date_intervention, Time h_intervention, Time h_arrivee, Time h_depart, String raison_cloture,
	String nom_responsable, int tel_fixe, int tel_mobile, String tech1, String tech2, String tech3, String tech4);
	
	public void updateTicket(Ticket tick);
	public List <Ticket> getTicket();
	public Materiel addMateriel(String marque, String type, String modele, String matricule, String fin_garantie);
	public void updateMateriel(Materiel mat);
	public List<Materiel> getMateriel();
	public Utilisateur addUtilisateur(String nom_utilisateur,String prenom_utilisateur,String mdp_utilisateur,int droit_acces, String login);
	public void updateUtilisateur(Utilisateur u);
	public List<Utilisateur> getUtilisateur();
	public void removeUtilisateur(int id_utilisateur);
	public TypeMateriel addTypeMat(String nom_mat);
	public List<TypeMateriel> getTypeMateriel();
	public Technicien addTechnicien(String nom, String fonction, int numero);
	public void updateTechnicien(Technicien tech);
	public void removeTec(int id_tech);
	public List<Technicien> getTechnicien();
}

package web;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

import javax.ejb.EJB;
import javax.jws.WebParam;
import javax.jws.WebService;

import metier.LbiLocal;
import metier.ejb.ClientLbi;
import metier.ejb.DonneurOrdre;
import metier.ejb.Materiel;
import metier.ejb.Technicien;
import metier.ejb.Ticket;
import metier.ejb.TypeMateriel;
import metier.ejb.Utilisateur;

@WebService(targetNamespace="http://poly.fr")

public class WebServiceLBI {
	@EJB
	private LbiLocal lb;
	
	/*
	 * Client
	 */
	
	//ajouterClient
	
	public ClientLbi ajouterClient(
			@WebParam(name="etablissement")String etablissement, 
			@WebParam(name="adresse")String adr_client, @WebParam(name="ville")String ville_client, 
			@WebParam(name="regieINT") int contrat_régie, 
			@WebParam(name="nomC1")String nom_contact1,@WebParam(name="pc1") String prenom_contact1,
			@WebParam(name="fc1")String fonction_contact1, @WebParam(name="num1")int num_contact1, 
			@WebParam(name="mailc1")String mail_contact1, 
			@WebParam(name="nomC2")String nom_contact2, @WebParam(name="pc2")String prenom_contact2,
			@WebParam(name="fc2")String fonction_contact2, 
			@WebParam(name="num2")int num_contact2, @WebParam(name="mail2")String mail_contact2, 
			@WebParam(name="nomC3")String nom_contact3, 
			@WebParam(name="pc3")String prenom_contact3,@WebParam(name="fc3")String fonction_contact3, 
			@WebParam(name="num3")int num_contact3, @WebParam(name="mail3")String mail_contact3) {
		return lb.addClient(etablissement, adr_client, ville_client, contrat_régie, nom_contact1, prenom_contact1, fonction_contact1, num_contact1, mail_contact1, nom_contact2, prenom_contact2, fonction_contact2, num_contact2, mail_contact2, nom_contact3, prenom_contact3, fonction_contact3, num_contact3, mail_contact3);
	}
	
	//MAJ client
	
	public void majClient(ClientLbi cl) {
		lb.updateClient(cl);
	}
	
	//afficher Client
	
	public List<ClientLbi> afficherClient(){
		return lb.getClient();
	}
	
	/*
	 * Donneur d'ordre
	 */
	
	//ajouter donneur d'ordre
	
	public DonneurOrdre ajouterDonneur (@WebParam(name="intitule")String intitule,
			@WebParam(name="nD1")String nomD1, @WebParam(name="pD1")String prenomD1, @WebParam(name="fd1")String fonctionD1, @WebParam(name="numD1")int numeroD1, @WebParam(name="mailD1")String mailD1, 
			@WebParam(name="nD2")String nomD2, @WebParam(name="pd2")String prenomD2, @WebParam(name="fd2")String fonctionD2, @WebParam(name="numD2")int numeroD2, @WebParam(name="mailD2")String mailD2,
			@WebParam(name="nD3")String nomD3, @WebParam(name="pd3")String prenomD3, @WebParam(name="fd3")String fonctionD3, @WebParam(name="numD3")int numeroD3, @WebParam(name="mailD3")String mailD3) {
		return lb.addDonneur(intitule, nomD1, prenomD1, fonctionD1, numeroD1, mailD1, nomD2, prenomD2, fonctionD2, numeroD2, mailD2, nomD3, prenomD3, fonctionD3, numeroD3, mailD3);
	}
	
	//MAJ
	public void majDonneur(DonneurOrdre d) {
		lb.updateDonneur(d);
	}
	
	//afficher
	public List <DonneurOrdre> afficherDonneur(){
		return lb.getDonneur();
	}
	/*
	 * Ticket
	 */
	
	//ajouterTicket
	
	public Ticket ajouterTicket(@WebParam(name="etat_Ticket")String etat_ticket, @WebParam(name="type_Ticket")String type_ticket, @WebParam(name="description_panne")String description_panne, @WebParam(name="description_travaux")String description_travaux,
			@WebParam(name="date_appel")Date date_appel, @WebParam(name="date_intervention")Date date_intervention, @WebParam(name="heure_intervention")Time h_intervention, @WebParam(name="heure_arrivee")Time h_arrivee, @WebParam(name="heure_depart")Time h_depart, @WebParam(name="raison_cloture")String raison_cloture,
			@WebParam(name="nom_responsable")String nom_responsable, @WebParam(name="tel_fixe")int tel_fixe, @WebParam(name="tel_mobile")int tel_mobile, @WebParam(name="technicien1")String tech1, @WebParam(name="technicien2")String tech2, @WebParam(name="technicien3")String tech3, @WebParam(name="technicien4")String tech4) {
		return lb.addTicket(etat_ticket, type_ticket, description_panne, description_travaux, date_appel, date_intervention, h_intervention, h_arrivee, h_depart, raison_cloture, nom_responsable, tel_fixe, tel_mobile, tech1, tech2, tech3, tech4);
	}
	
	//maj
	public void majTicket(Ticket tick) {
		lb.updateTicket(tick);
	}
	
	//afficher Ticket
	public List <Ticket> afficherTicket(){
		return lb.getTicket();
	}
	
	/*
	 * Materiel
	 */
//ajouterMAteriel
	public Materiel ajouterMateriel(@WebParam(name="marque")String marque, @WebParam(name="type")String type, @WebParam(name="modele")String modele, @WebParam(name="matricule")String matricule, @WebParam(name="fin_garantie")String fin_garantie) {
		return lb.addMateriel(marque, type, modele, matricule, fin_garantie);
	}
	
	//mettre à jour
	public void majMateriel(Materiel mat) {
		lb.updateMateriel(mat);
	}
	
	//afficher MAtériel
	
	public List<Materiel> afficherMateriel(){
		return lb.getMateriel();
	}
	
	/*
	 * utilisateur
	 */
	
	//ajouter Utilisateur
	public Utilisateur ajouterUtilisateur (@WebParam(name="nom_utilisateur")String nom_utilisateur,@WebParam(name="prenom_utilisateur")String prenom_utilisateur,@WebParam(name="mdp_utilisateur")String mdp_utilisateur,@WebParam(name="droit_acces")int droit_acces, @WebParam(name="login")String login) {
		return lb.addUtilisateur(nom_utilisateur, prenom_utilisateur, mdp_utilisateur, droit_acces, login);
	}
	
	//mettre a jour utilisateur
	public void majUtilisateur(Utilisateur u) {
		lb.updateUtilisateur(u);
	}
	//afficher utilisateur
	
	public List<Utilisateur> afficherUtilisateur(){
		return lb.getUtilisateur();
	}
	
	//supprimer utilisateur
	
	public void supprimerUtilisateur(int id_utilisateur) {
		lb.removeUtilisateur(id_utilisateur);
	}
	
	/*
	 * Type MAtériel
	 */
	
	//ajouter Type matériel
	public TypeMateriel ajouterTypeMateriel(@WebParam(name="nomType")String nom) {
		return lb.addTypeMat(nom);
	}
	//afficher materiel
	public List <TypeMateriel> afficherTypeMateriel(){
		return lb.getTypeMateriel();
	}
	
	/*
	 * Technicien
	 */
	
	//ajouter Tech
	public Technicien addTechnicien(@WebParam(name="nomTech")String nom, @WebParam(name="fonctionTech")String fonction, @WebParam(name="numTech")int numero) {
		return lb.addTechnicien(nom, fonction, numero);
	}
	
	//mettre à jour Tech
	public void majTech(@WebParam(name="tech")Technicien tech) {
		lb.updateTechnicien(tech);
	}
	
	//supprimer Tech
	public void supprimerTech(int id_tech) {
		lb.removeTec(id_tech);
	}
	
	//afficher Tech
	public List<Technicien> afficherTech(){
		return lb.getTechnicien();
	}
}

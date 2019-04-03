package metier;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import metier.ejb.ClientLbi;
import metier.ejb.DonneurOrdre;
import metier.ejb.Materiel;
import metier.ejb.Technicien;
import metier.ejb.Ticket;
import metier.ejb.TypeMateriel;
import metier.ejb.Utilisateur;

@Stateless

public class LBIImpl implements LbiLocal,LbiRemote{
	
	@PersistenceContext(unitName="LbiEjb")
	private EntityManager em;
	
	/*
	 * Client
	 */
	
	//addClient
	
	public ClientLbi addClient(String etablissement, String adr_client, String ville_client, int contrat_régie, String nom_contact1, String prenom_contact1,String fonction_contact1, int num_contact1, String mail_contact1, String nom_contact2, String prenom_contact2,String fonction_contact2, int num_contact2, String mail_contact2, String nom_contact3, String prenom_contact3,String fonction_contact3, int num_contact3, String mail_contact3) {
		ClientLbi cl=new ClientLbi(etablissement, adr_client,ville_client,contrat_régie,
				nom_contact1,prenom_contact1,fonction_contact1,num_contact1,mail_contact1,
				nom_contact2,prenom_contact2,fonction_contact2,num_contact2,mail_contact2,
				nom_contact3,prenom_contact3,fonction_contact3,num_contact3,mail_contact3);
		em.persist(cl);
		return cl;
		
		}
	
	//mettre à jour les clients
		public void updateClient(ClientLbi cl) {
			ClientLbi cl1=em.find(ClientLbi.class, cl.getId_client());
			cl1.setEtablissement(cl.getEtablissement());
			cl1.setAdr_client(cl.getAdr_client());
			cl1.setVille_client(cl.getVille_client());
			cl1.setContrat_regie(cl.getContrat_regie());
			cl1.setNom_contact1(cl.getNom_contact1());
			cl1.setNom_contact2(cl.getNom_contact2());
			cl1.setNom_contact3(cl.getNom_contact3());
			cl1.setPrenom_contact1(cl.getPrenom_contact1());
			cl1.setPrenom_contact2(cl.getPrenom_contact2());
			cl1.setPrenom_contact3(cl.getPrenom_contact3());
			cl1.setFonction_contact1(cl.getFonction_contact1());
			cl1.setFonction_contact2(cl.getFonction_contact2());
			cl1.setFonction_contact3(cl.getFonction_contact3());
			cl1.setNum_contact1(cl.getNum_contact1());
			cl1.setNum_contact2(cl.getNum_contact2());
			cl1.setNum_contact3(cl.getNum_contact3());
			cl1.setMail_contact1(cl.getMail_contact1());
			cl1.setMail_contact2(cl.getMail_contact2());
			cl1.setMail_contact3(cl.getMail_contact3());
			
			
		}
		
		//liste Client
		public List <ClientLbi> getClient() {
			Query req=em.createQuery("Select c from ClientLbi c");
			return req.getResultList();
			
		}
		
		/*
		 * Donneur d'ordre
		 */
		
		//addDonneur
		
		public DonneurOrdre addDonneur(String intitule,String nomD1, String prenomD1, String fonctionD1, int numeroD1, String mailD1, 
				String nomD2, String prenomD2, String fonctionD2, int numeroD2, String mailD2,
				String nomD3, String prenomD3, String fonctionD3, int numeroD3, String mailD3) {
		DonneurOrdre d=new DonneurOrdre(intitule, nomD1, prenomD1, fonctionD1, numeroD1, mailD1, 
				nomD2, prenomD2, fonctionD2, numeroD2, mailD2,
				nomD3, prenomD3, fonctionD3, numeroD3, mailD3);
		em.persist(d);
		return d;
		}
		
		//update
		
		public void updateDonneur(DonneurOrdre d) {
			DonneurOrdre d1=em.find(DonneurOrdre.class, d.getIntitule_donneur());
			d1.setIntitule_donneur(d.getIntitule_donneur());
			d1.setNomD1(d.getNomD1());
			d1.setPrenomD1(d.getPrenomD1());
			d1.setFonctionD1(d.getFonctionD1());
			d1.setNumeroD1(d.getNumeroD1());
			d1.setMailD1(d.getMailD1());
			d1.setNomD2(d.getNomD2());
			d1.setPrenomD2(d.getPrenomD2());
			d1.setFonctionD2(d.getFonctionD2());
			d1.setNumeroD2(d.getNumeroD2());
			d1.setMailD2(d.getMailD2());
			d1.setNomD3(d.getNomD3());
			d1.setPrenomD3(d.getPrenomD3());
			d1.setFonctionD3(d.getFonctionD3());
			d1.setNumeroD3(d.getNumeroD3());
			d1.setMailD3(d.getMailD3());
			
		}
		
		//liste des donneur
		public List<DonneurOrdre> getDonneur(){
			Query req=em.createQuery("select d from DonneurOrdre d");
			return req.getResultList();		
			}
		
		/*
		 * Tickets
		 */
		
		//addTicket
		
		public Ticket addTicket(String etat_ticket, String type_ticket, String description_panne, String description_travaux,
		Date date_appel,Date date_intervention, Time h_intervention, Time h_arrivee, Time h_depart, String raison_cloture,
		String nom_responsable, int tel_fixe, int tel_mobile, String tech1, String tech2, String tech3, String tech4) {
			Ticket tick=new Ticket(etat_ticket, type_ticket, description_panne,description_travaux,date_appel, date_intervention, h_intervention, h_arrivee,h_depart,raison_cloture, nom_responsable, tel_fixe, tel_mobile, tech1, tech2, tech3, tech4);
			em.persist(tick);
			return tick;
		}
		
		//update Ticket
		public void updateTicket(Ticket tick) {
			Ticket tick1=em.find(Ticket.class, tick.getId_ticket());
			tick1.setEtat_ticket(tick.getEtat_ticket());
			tick1.setType_ticket(tick.getType_ticket());
			tick1.setDescription_panne(tick.getDescription_panne());
			tick1.setDescription_travaux(tick.getDescription_travaux());
			tick1.setDate_appel(tick.getDate_appel());
			tick1.setDate_intervention(tick.getDate_intervention());
			tick1.setH_intervention(tick.getH_intervention());
			tick1.setH_arrivee(tick.getH_arrivee());
			tick1.setH_depart(tick.getH_depart());
			tick1.setRaison_cloture(tick.getRaison_cloture());
			tick1.setNom_responsable(tick.getNom_responsable());
			tick1.setTel_fixe(tick.getTel_fixe());
			tick1.setTel_mobile(tick.getTel_mobile());
			tick1.setTech1(tick.getTech1());
			tick1.setTech2(tick.getTech2());
			tick1.setTech3(tick.getTech3());
			tick1.setTech4(tick.getTech4());
		}
		
		//liste
		public List <Ticket> getTicket(){
			Query req=em.createQuery("select tick from Ticket tick");
			return req.getResultList();
		}
		
		/*
		 * Matériels
		 */
		
		//addMateriel
		
		public Materiel addMateriel(String marque, String type, String modele, String matricule, String fin_garantie) {
			Materiel mat=new Materiel(marque,type,modele,matricule,fin_garantie);
			em.persist(mat);
			return mat;
		}
		
		//update MAtériel
		
		public void updateMateriel(Materiel mat) {
			Materiel mat1=em.find(Materiel.class, mat.getId_materiel());
			mat1.setMarque(mat.getMarque());
			mat1.setType(mat.getType());
			mat1.setModele(mat.getModele());
			mat1.setMatricule(mat.getMatricule());
			mat1.setFin_garantie(mat.getFin_garantie());
		}
		
		//get Materiel
		
		public List<Materiel> getMateriel(){
			Query req=em.createQuery("Select mat from Materiel mat");
			return req.getResultList();
		}
		
		/*
		 * Utilisateur
		 */
		
		//add Utilisateur
		public Utilisateur addUtilisateur(String nom_utilisateur,String prenom_utilisateur,String mdp_utilisateur,int droit_acces, String login) {
			Utilisateur u=new Utilisateur(nom_utilisateur,mdp_utilisateur,droit_acces,login);
			em.persist(u);
			return u;
		}
		//update utilisateur
		
		public void updateUtilisateur(Utilisateur u) {
			Utilisateur u1=em.find(Utilisateur.class, u.getId_utilisateur());
			u1.setNom_utilisateur(u.getNom_utilisateur());
			u1.setPrenom_utilisateur(u.getPrenom_utilisateur());
			u1.setMdp_utilisateur(u.getMdp_utilisateur());
			u1.setLogin(u.getLogin());
			u1.setDroit_acces(u.getDroit_acces());
		}
		
		//get utilisateur
		public List<Utilisateur> getUtilisateur(){
			Query req=em.createQuery("select u from Utilisateur u");
			return req.getResultList();
		}
		//delete utilisateur
		public void removeUtilisateur(int id_utilisateur) {
			Utilisateur u=em.find(Utilisateur.class, id_utilisateur);
			em.remove(u);
		}
		
		/*
		 * Type Materiel
		 */
		
		//addTypeMat
		public TypeMateriel addTypeMat(String nom_typemat) {
			TypeMateriel typ=new TypeMateriel(nom_typemat);
			em.persist(typ);
			return typ;
		}
		
		// afficher liste
		public List<TypeMateriel> getTypeMateriel(){
			Query req=em.createQuery("select type from TypeMateriel type");
			return req.getResultList();
		}
		
		/*
		 * Technicien
		 */
		
		public Technicien addTechnicien(String nom, String fonction, int numero) {
			Technicien tech=new Technicien(nom,fonction,numero);
			em.persist(tech);
			return tech;
		}
		
		//update Technicien
		public void updateTechnicien(Technicien tech) {
			Technicien tech1=em.find(Technicien.class, tech.getId_technicien());
			tech1.setNom(tech.getNom());
			tech1.setFonction_tech(tech.getFonction_tech());
			tech1.setNumero(tech.getNumero());
		}
		
		//supprimer tech
		public void removeTec(int id_tech) {
			Technicien tech=em.find(Technicien.class, id_tech);
			em.remove(tech);
		}
		
		//liste tech
		public List<Technicien> getTechnicien(){
			Query req=em.createQuery("select tech from Technicien tech");
			return req.getResultList();
		}
}

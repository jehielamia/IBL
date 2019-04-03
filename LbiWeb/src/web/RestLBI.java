package web;

import javax.ejb.EJB;
import javax.ejb.Stateful;
import javax.jws.WebParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import metier.LbiLocal;
import metier.ejb.Materiel;
import metier.ejb.Technicien;

@Path("/HelloWorld")

@Stateful
public class RestLBI {
	
	@EJB 
	private LbiLocal lb;
	
	@GET
	@Path("/sayHello")
	public String sayHello() {
		return "Hello World";
	}
	/*
	 * Materiel
	 */
	
	public Materiel ajouterMateriel(@QueryParam("marque")String marque,@QueryParam("type")String type,@QueryParam("modele")String modele, @QueryParam("matricule")String matricule, @WebParam(name="fin_garantie")String fin_garantie) {
		return lb.addMateriel(marque, type, modele, matricule, fin_garantie);
	}
	
	/*
	 * Technicien
	 */
	@POST
	@Path("/ajouter")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Technicien addTechnicien(@FormParam("nomTech")String nom, @FormParam("fonctionTech")String fonction, @FormParam("numTech")int numero) {
		return lb.addTechnicien(nom, fonction, numero);
	}

}

package metier.ejb;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: TypeMateriel
 *
 */
@Entity

public class TypeMateriel implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_type;
	private String nom_type;
	private static final long serialVersionUID = 1L;

	public TypeMateriel() {
		super();
	}   
	public TypeMateriel(String nom_mat) {
		this.nom_type=nom_mat;
	}
	public int getId_type() {
		return this.id_type;
	}

	public void setId_type(int id_type) {
		this.id_type = id_type;
	}   
	public String getNom_type() {
		return this.nom_type;
	}

	public void setNom_type(String nom_type) {
		this.nom_type = nom_type;
	}
   
}

package metier.ejb;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: DonneurOrdre
 *
 */
@Entity

public class DonneurOrdre implements Serializable {

	@Id
	private String intitule_donneur;
	private String nomD1;
	private String prenomD1;
	private String fonctionD1;
	private int numeroD1;
	private String mailD1;
	private String nomD2;
	private String prenomD2;
	private String fonctionD2;
	private int numeroD2;
	private String mailD2;
	private String nomD3;
	private String prenomD3;
	private String fonctionD3;
	private int numeroD3;
	private String mailD3;
	private static final long serialVersionUID = 1L;

	public DonneurOrdre() {
		super();
	}   
	public DonneurOrdre(String intitule) {
		this.intitule_donneur=intitule;
	}
	public DonneurOrdre(String intitule, String nomD12, String prenomD12, String fonctionD12, int numeroD12,
			String mailD12, String nomD22, String prenomD22, String fonctionD22, int numeroD22, String mailD22,
			String nomD32, String prenomD32, String fonctionD32, int numeroD32, String mailD32) {
		this.intitule_donneur=intitule;
		this.nomD1=nomD12;
		this.prenomD1=prenomD12;
		this.fonctionD1=fonctionD12;
		this.numeroD1=numeroD12;
		this.mailD1=mailD12;
		this.nomD2=nomD22;
		this.prenomD2=prenomD22;
		this.fonctionD2=fonctionD22;
		this.numeroD2=numeroD22;
		this.mailD2=mailD22;
		this.nomD3=nomD32;
		this.prenomD3=prenomD32;
		this.fonctionD3=fonctionD32;
		this.numeroD3=numeroD32;
		this.mailD3=mailD32;
	}
	public String getIntitule_donneur() {
		return this.intitule_donneur;
	}

	public void setIntitule_donneur(String intitule_donneur) {
		this.intitule_donneur = intitule_donneur;
	}
	public String getNomD1() {
		return nomD1;
	}
	public void setNomD1(String nomD1) {
		this.nomD1 = nomD1;
	}
	public String getPrenomD1() {
		return prenomD1;
	}
	public void setPrenomD1(String prenomD1) {
		this.prenomD1 = prenomD1;
	}
	public String getFonctionD1() {
		return fonctionD1;
	}
	public void setFonctionD1(String fonctionD1) {
		this.fonctionD1 = fonctionD1;
	}
	public int getNumeroD1() {
		return numeroD1;
	}
	public void setNumeroD1(int numeroD1) {
		this.numeroD1 = numeroD1;
	}
	public String getMailD1() {
		return mailD1;
	}
	public void setMailD1(String mailD1) {
		this.mailD1 = mailD1;
	}
	public String getNomD2() {
		return nomD2;
	}
	public void setNomD2(String nomD2) {
		this.nomD2 = nomD2;
	}
	public String getPrenomD2() {
		return prenomD2;
	}
	public void setPrenomD2(String prenomD2) {
		this.prenomD2 = prenomD2;
	}
	public String getFonctionD2() {
		return fonctionD2;
	}
	public void setFonctionD2(String fonctionD2) {
		this.fonctionD2 = fonctionD2;
	}
	public int getNumeroD2() {
		return numeroD2;
	}
	public void setNumeroD2(int numeroD2) {
		this.numeroD2 = numeroD2;
	}
	public String getMailD2() {
		return mailD2;
	}
	public void setMailD2(String mailD2) {
		this.mailD2 = mailD2;
	}
	public String getNomD3() {
		return nomD3;
	}
	public void setNomD3(String nomD3) {
		this.nomD3 = nomD3;
	}
	public String getPrenomD3() {
		return prenomD3;
	}
	public void setPrenomD3(String prenomD3) {
		this.prenomD3 = prenomD3;
	}
	public String getFonctionD3() {
		return fonctionD3;
	}
	public void setFonctionD3(String fonctionD3) {
		this.fonctionD3 = fonctionD3;
	}
	public int getNumeroD3() {
		return numeroD3;
	}
	public void setNumeroD3(int numeroD3) {
		this.numeroD3 = numeroD3;
	}
	public String getMailD3() {
		return mailD3;
	}
	public void setMailD3(String mailD3) {
		this.mailD3 = mailD3;
	}
   
   
}

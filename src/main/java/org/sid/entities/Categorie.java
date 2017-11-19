package org.sid.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Categorie {
	@Id @GeneratedValue
	private Long codeCat;
	private String categorie;
	@ManyToOne
	@JoinColumn(name="CODE_PJ")
	private ParcJardin parcJardin;
	
	
	public Categorie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Categorie(String categorie, ParcJardin parcJardin) {
		super();
		
		this.categorie = categorie;
		this.parcJardin = parcJardin;
	}
	public Long getCodeCat() {
		return codeCat;
	}
	public void setCodeCat(Long codeCat) {
		this.codeCat = codeCat;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public ParcJardin getParcJardin() {
		return parcJardin;
	}
	public void setParcJardin(ParcJardin parcJardin) {
		this.parcJardin = parcJardin;
	}
	

}

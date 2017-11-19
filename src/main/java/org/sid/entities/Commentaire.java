package org.sid.entities;

import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Commentaire implements Serializable {
	@Id @GeneratedValue
	private Long codeC;
	private String nomUtil;
	private String contenue;
	@ManyToOne
	@JoinColumn(name="CODE_PJ")
	private ParcJardin parkJardin;
	
	public Commentaire() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Commentaire(String nomUtil, String contenue, ParcJardin parkJardin) {
		super();
		this.nomUtil = nomUtil;
		this.contenue = contenue;
		this.parkJardin = parkJardin;
	}

	public Long getCodeC() {
		return codeC;
	}

	public void setCodeC(Long codeC) {
		this.codeC = codeC;
	}

	public String getNomUtil() {
		return nomUtil;
	}

	public void setNomUtil(String nomUtil) {
		this.nomUtil = nomUtil;
	}

	public String getContenue() {
		return contenue;
	}

	public void setContenue(String contenue) {
		this.contenue = contenue;
	}

	public ParcJardin getParkJardin() {
		return parkJardin;
	}

	public void setParkJardin(ParcJardin parkJardin) {
		this.parkJardin = parkJardin;
	}

	
	
	

}

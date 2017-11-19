package org.sid.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Horaire implements Serializable{
	@Id
	private Long codeH;
	private Date lundiOuverture;
	private Date mardiOuverture;
	private Date mercrediOuverture;
	private Date jeudiOuverture;
	private Date vendrediOuverture;
	private Date samediOuverture;
	private Date dimancheOuverture;
	private Date lundiFermeture;
	private Date mardiFermeture;
	private Date mercredoFermeture;
	private Date jeudiFermeture;
	private Date vendrediFermeture;
	private Date samediFermeture;
	private Date dimancheFermeture;
	@ManyToOne
	@JoinColumn(name="CODE_PJ")
	private ParcJardin parcJardin;


	public Horaire(Date lundiOuverture, Date mardiOuverture, Date mercrediOuverture, Date jeudiOuverture,
			Date vendrediOuverture, Date samediOuverture, Date dimancheOuverture, Date lundiFermeture,
			Date mardiFermeture, Date mercredoFermeture, Date jeudiFermeture, Date vendrediFermeture,
			Date samediFermeture, Date dimancheFermeture, ParcJardin parcJardin) {
		super();
		
		this.lundiOuverture = lundiOuverture;
		this.mardiOuverture = mardiOuverture;
		this.mercrediOuverture = mercrediOuverture;
		this.jeudiOuverture = jeudiOuverture;
		this.vendrediOuverture = vendrediOuverture;
		this.samediOuverture = samediOuverture;
		this.dimancheOuverture = dimancheOuverture;
		this.lundiFermeture = lundiFermeture;
		this.mardiFermeture = mardiFermeture;
		this.mercredoFermeture = mercredoFermeture;
		this.jeudiFermeture = jeudiFermeture;
		this.vendrediFermeture = vendrediFermeture;
		this.samediFermeture = samediFermeture;
		this.dimancheFermeture = dimancheFermeture;
		this.parcJardin = parcJardin;
	}

	public Horaire() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getCodeH() {
		return codeH;
	}

	public void setCodeH(Long codeH) {
		this.codeH = codeH;
	}

	public Date getLundiOuverture() {
		return lundiOuverture;
	}

	public void setLundiOuverture(Date lundiOuverture) {
		this.lundiOuverture = lundiOuverture;
	}

	public Date getMardiOuverture() {
		return mardiOuverture;
	}

	public void setMardiOuverture(Date mardiOuverture) {
		this.mardiOuverture = mardiOuverture;
	}

	public Date getMercrediOuverture() {
		return mercrediOuverture;
	}

	public void setMercrediOuverture(Date mercrediOuverture) {
		this.mercrediOuverture = mercrediOuverture;
	}

	public Date getJeudiOuverture() {
		return jeudiOuverture;
	}

	public void setJeudiOuverture(Date jeudiOuverture) {
		this.jeudiOuverture = jeudiOuverture;
	}

	public Date getVendrediOuverture() {
		return vendrediOuverture;
	}

	public void setVendrediOuverture(Date vendrediOuverture) {
		this.vendrediOuverture = vendrediOuverture;
	}

	public Date getSamediOuverture() {
		return samediOuverture;
	}

	public void setSamediOuverture(Date samediOuverture) {
		this.samediOuverture = samediOuverture;
	}

	public Date getDimancheOuverture() {
		return dimancheOuverture;
	}

	public void setDimancheOuverture(Date dimancheOuverture) {
		this.dimancheOuverture = dimancheOuverture;
	}

	public Date getLundiFermeture() {
		return lundiFermeture;
	}

	public void setLundiFermeture(Date lundiFermeture) {
		this.lundiFermeture = lundiFermeture;
	}

	public Date getMardiFermeture() {
		return mardiFermeture;
	}

	public void setMardiFermeture(Date mardiFermeture) {
		this.mardiFermeture = mardiFermeture;
	}

	public Date getMercredoFermeture() {
		return mercredoFermeture;
	}

	public void setMercredoFermeture(Date mercredoFermeture) {
		this.mercredoFermeture = mercredoFermeture;
	}

	public Date getJeudiFermeture() {
		return jeudiFermeture;
	}

	public void setJeudiFermeture(Date jeudiFermeture) {
		this.jeudiFermeture = jeudiFermeture;
	}

	public Date getVendrediFermeture() {
		return vendrediFermeture;
	}

	public void setVendrediFermeture(Date vendrediFermeture) {
		this.vendrediFermeture = vendrediFermeture;
	}

	public Date getSamediFermeture() {
		return samediFermeture;
	}

	public void setSamediFermeture(Date samediFermeture) {
		this.samediFermeture = samediFermeture;
	}

	public Date getDimancheFermeture() {
		return dimancheFermeture;
	}

	public void setDimancheFermeture(Date dimancheFermeture) {
		this.dimancheFermeture = dimancheFermeture;
	}

	public ParcJardin getParcJardin() {
		return parcJardin;
	}

	public void setParcJardin(ParcJardin parcJardin) {
		this.parcJardin = parcJardin;
	}
	
	
	
}

package org.sid.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class ParcJardin implements Serializable {
	@Id @GeneratedValue
	private Long codePJ;
	private String type;
	
	private String nom;
	private String description;
	private Position position;
	@OneToOne(mappedBy="parkJardin",fetch=FetchType.LAZY)
	private Horaire horaire;
	@OneToMany(mappedBy="parkJardin",fetch=FetchType.LAZY)
	private Collection<Commentaire> commentaires;
	@OneToMany(mappedBy="parkJardin",fetch=FetchType.LAZY)
	private Collection<Categorie> categories;
	private Collection<String> photos;
	public ParcJardin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ParcJardin( String type,String nom) {
		super();
		this.type=type;
		this.nom = nom;
		
	}
	public Long getCodePJ() {
		return codePJ;
	}
	public void setCodePJ(Long codePJ) {
		this.codePJ = codePJ;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Collection<Commentaire> getCommentaires() {
		return commentaires;
	}
	public void setCommentaires(Collection<Commentaire> commentaires) {
		this.commentaires = commentaires;
	}
	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}
	public Horaire getHoraire() {
		return horaire;
	}
	public void setHoraire(Horaire horaire) {
		this.horaire = horaire;
	}
	public Collection<Categorie> getCategories() {
		return categories;
	}
	public void setCategories(Collection<Categorie> categories) {
		this.categories = categories;
	}
	public Collection<String> getPhotos() {
		return photos;
	}
	public void setPhotos(Collection<String> photos) {
		this.photos = photos;
	}
	
	
	
	

}

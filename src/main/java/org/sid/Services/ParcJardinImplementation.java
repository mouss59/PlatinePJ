package org.sid.Services;

import org.sid.dao.CategorieRepository;
import org.sid.dao.CommentaireRepository;
import org.sid.dao.ParcJardinRepository;
import org.sid.entities.Categorie;
import org.sid.entities.Commentaire;
import org.sid.entities.ParcJardin;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
@Service
public class ParcJardinImplementation implements ParcJardinService  {
	@Autowired
private ParcJardinRepository parcJardinRepository;
	@Autowired
private CommentaireRepository commentaireRepository;
	@Autowired
	private CategorieRepository categorieRepository;
	
	
	@Override
	public ParcJardin ConsulterPJ(Long codePJ) {
		// TODO Auto-generated method stub
		ParcJardin pj=parcJardinRepository.findOne(codePJ);
		if(pj==null) throw new RuntimeException("Parc ou jardin existe pas");
		return pj;
	}

	@Override
	public ParcJardin modifierPJ(Long id,ParcJardin pj) {
		pj.setCodePJ(id);
		return parcJardinRepository.save(pj);
		
	}

	@Override
	public void supprimerPJ(Long id) {
		parcJardinRepository.delete(id);
	}

	@Override
	public ParcJardin ajouterPJ(ParcJardin pj) {
		return parcJardinRepository.save(pj);
		
	}
	
	@Override
	public Page<Commentaire> consulterCommentaire(Long codePJ,int page, int size){
		
		return commentaireRepository.listeCommentaire(codePJ,new PageRequest(page, size));
	}
	
	

	@Override
	public Page<Categorie> consulterCategorie(Long codePJ, int page, int size) {
		return categorieRepository.listeCategorie(codePJ, new PageRequest(page,size));
	}



}

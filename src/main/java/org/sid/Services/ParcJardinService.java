package org.sid.Services;

import java.util.List;

import org.sid.entities.Categorie;
import org.sid.entities.Commentaire;
import org.sid.entities.ParcJardin;
import org.springframework.data.domain.Page;

public interface ParcJardinService {
public ParcJardin ConsulterPJ(Long codePJ);
public ParcJardin modifierPJ(Long id ,ParcJardin pj);
public void supprimerPJ(Long id);
public ParcJardin ajouterPJ(ParcJardin pj);
public Page<Commentaire> consulterCommentaire(Long codePJ,int page, int size);
public Page<Categorie> consulterCategorie(Long codePJ, int page,int size);




}

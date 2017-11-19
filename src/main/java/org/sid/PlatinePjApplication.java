package org.sid;

import org.sid.dao.CategorieRepository;
import org.sid.dao.CommentaireRepository;
import org.sid.dao.ParcJardinRepository;
import org.sid.dao.PositionRepository;
import org.sid.entities.Categorie;
import org.sid.entities.Commentaire;
import org.sid.entities.ParcJardin;
import org.sid.entities.Position;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PlatinePjApplication implements CommandLineRunner{
@Autowired
private ParcJardinRepository parcJardinRepository;
@Autowired
private CommentaireRepository commentaireRepository;
@Autowired
private CategorieRepository categorieRepository;
@Autowired
private PositionRepository positionRepository;
	public static void main(String[] args) {
		SpringApplication.run(PlatinePjApplication.class, args);
		
	}

	@Override
	public void run(String... arg0) throws Exception {
		ParcJardin PJ1= parcJardinRepository.save(new ParcJardin("parc","Herons"));
		ParcJardin PJ2=parcJardinRepository.save(new ParcJardin("jardin","haloe"));
		ParcJardin PJ3=parcJardinRepository.save(new ParcJardin("parc","lille"));
		
		commentaireRepository.save(new Commentaire("anonyme","j aime le parc",PJ1));
		commentaireRepository.save(new Commentaire("med","parfait",PJ2));
		commentaireRepository.save(new Commentaire("mouss","j aime leee parc",PJ1));
		
		categorieRepository.save(new Categorie("sport",PJ1));
		categorieRepository.save(new Categorie("Etude",PJ1));
		categorieRepository.save(new Categorie("machin",PJ1));
		
		positionRepository.save(new Position(154L, 125L, PJ1));
		positionRepository.save(new Position(15L, 15L, PJ2));
		
		
		
		
		
	}
}

package org.sid.dao;

import org.sid.entities.Categorie;
import org.sid.entities.Commentaire;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CategorieRepository extends JpaRepository<Categorie, Long>{
	@Query("select c from Categorie c where c.ParcJardin.codePJ=:x")
	public Page<Categorie> listeCategorie(@Param("x")Long id, Pageable pageable);
}

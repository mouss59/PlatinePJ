package org.sid.dao;

import org.sid.entities.Commentaire;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CommentaireRepository extends JpaRepository<Commentaire, Long>{
	@Query("select c from Commentaire c where c.ParcJardin.codePJ=:x")
	public Page<Commentaire> listeCommentaire(@Param("x")Long id, Pageable pageable);
}

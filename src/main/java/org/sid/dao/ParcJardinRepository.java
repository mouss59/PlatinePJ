package org.sid.dao;

import org.sid.entities.Commentaire;
import org.sid.entities.ParcJardin;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParcJardinRepository extends JpaRepository<ParcJardin, Long>{



}

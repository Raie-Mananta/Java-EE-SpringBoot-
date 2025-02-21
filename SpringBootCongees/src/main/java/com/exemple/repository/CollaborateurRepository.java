package com.exemple.repository;

import com.exemple.model.Collaborateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollaborateurRepository extends JpaRepository<Collaborateur, Long> {
}

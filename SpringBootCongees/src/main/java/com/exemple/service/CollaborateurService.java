package com.exemple.service;

import com.exemple.model.Collaborateur;
import com.exemple.repository.CollaborateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollaborateurService {

    @Autowired
    private CollaborateurRepository collaborateurRepository;

    public List<Collaborateur> getAllCollaborateurs() {
        return collaborateurRepository.findAll();
    }

    public Collaborateur addCollaborateur(Collaborateur collaborateur) {
        return collaborateurRepository.save(collaborateur);
    }
}

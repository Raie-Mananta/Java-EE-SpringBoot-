package com.exemple.controller;

import com.exemple.model.Collaborateur;
import com.exemple.service.CollaborateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/collaborateurs")
public class CollaborateurController {

    @Autowired
    private CollaborateurService collaborateurService;

    @GetMapping
    public List<Collaborateur> getAllCollaborateurs() {
        return collaborateurService.getAllCollaborateurs();
    }

    @PostMapping
    public Collaborateur addCollaborateur(@RequestBody Collaborateur collaborateur) {
        return collaborateurService.addCollaborateur(collaborateur);
    }
}

package com.exemple.model;

import jakarta.persistence.*;

@Entity
@Table(name = "collaborateurs")
public class Collaborateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String prenom;
    private String nom;

    public Collaborateur() {}

    public Collaborateur(String prenom, String nom, String email) {
        this.prenom = prenom;
        this.nom = nom;
    }

    public Long getId() { return id; }
    public String getPrenom() { return prenom; }
    public String getNom() { return nom; }

    public void setId(Long id) { this.id = id; }
    public void setPrenom(String prenom) { this.prenom = prenom; }
    public void setNom(String nom) { this.nom = nom; }
}

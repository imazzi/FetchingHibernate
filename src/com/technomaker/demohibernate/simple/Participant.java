package com.technomaker.demohibernate.simple;

public class Participant {
    private Long idParticipant;
    private String nom;
    private String prenom;
    private Formation formation;


    public Participant() {
    }

    public Participant(String nom, String prenom, Formation formation) {
        this.nom = nom;
        this.prenom = prenom;
        this.formation = formation;
    }

    public Participant(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public Long getIdParticipant() {
        return idParticipant;
    }

    public void setIdParticipant(Long idParticipant) {
        this.idParticipant = idParticipant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Formation getFormation() {
        return formation;
    }

    public void setFormation(Formation formation) {
        this.formation = formation;
    }
}

package tn.esprit.autoloc.domain;

import jakarta.persistence.*;


@Entity
public class Employe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmploye;

    private String nom;

    private String prenom;

    @ManyToOne
    @JoinColumn(name = "agence_id")
    private Agence agence;

    @Enumerated(EnumType.STRING)
    private RoleEmploye role;

    public Employe() {
    }

    public Long getIdEmploye() {
        return idEmploye;
    }

    public void setIdEmploye(Long idEmploye) {
        this.idEmploye = idEmploye;
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

    public RoleEmploye getRole() {
        return role;
    }

    public void setRole(RoleEmploye role) {
        this.role = role;
    }

    public Agence getAgence() {
        return agence;
    }

    public void setAgence(Agence agence) {
        this.agence = agence;
    }
}

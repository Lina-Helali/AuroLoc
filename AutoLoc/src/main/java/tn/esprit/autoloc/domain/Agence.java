package tn.esprit.autoloc.domain;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Agence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAgence;

    private String nom;

    private String ville;

    private String adresse;

    private String telephone;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "agence")
    private Set<Employe> employes = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "agence")
    private Set<Vehicule> vehicules = new HashSet<>();

    public Agence() {
    }

    public Long getIdAgence() {
        return idAgence;
    }

    public void setIdAgence(Long idAgence) {
        this.idAgence = idAgence;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Set<Employe> getEmployes() {
        return employes;
    }

    public void setEmployes(Set<Employe> employes) {
        this.employes = employes;
    }

    public Set<Vehicule> getVehicules() {
        return vehicules;
    }

    public void setVehicules(Set<Vehicule> vehicules) {
        this.vehicules = vehicules;
    }
}

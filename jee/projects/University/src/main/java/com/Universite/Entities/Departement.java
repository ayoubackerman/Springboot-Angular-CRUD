package com.Universite.Entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Departement implements Serializable {
    @Id
    @GeneratedValue
    private Long codeDEP;
    private String nomDEP;

    @ManyToOne
    private Universite university;


    @OneToMany(mappedBy = "departementEns")
    private List<Enseignant> enseignants;

    public Long getCodeDEP() {
        return codeDEP;
    }

    public void setCodeDEP(Long codeDEP) {
        this.codeDEP = codeDEP;
    }

    public String getNomDEP() {
        return nomDEP;
    }

    public void setNomDEP(String nomDEP) {
        this.nomDEP = nomDEP;
    }

    public Universite getUniversity() {
        return university;
    }

    public void setUniversity(Universite university) {
        this.university = university;
    }

    public Collection<Enseignant> getEnseignants() {
        return enseignants;
    }

    public void setEnseignants(List<Enseignant> enseignants) {
        this.enseignants = enseignants;
    }

    public Departement(Long codeDEP, String nomDEP, Universite universite) {
        super();
        this.codeDEP = codeDEP;
        this.nomDEP = nomDEP;
        this.university = universite;
    }

    public Departement() {
        super();
        // TODO Auto-generated constructor stub
    }
}

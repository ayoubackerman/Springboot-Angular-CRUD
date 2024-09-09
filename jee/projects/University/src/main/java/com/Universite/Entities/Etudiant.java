package com.Universite.Entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "etudiant")
public class Etudiant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long numInscription;

    private String nameETU;
    private String prenomETU;
    private String adresseETU;

    private Date dateEntrée;

    @ManyToMany(mappedBy = "Courses")
    private List<Cours> listCours;

    public List<Cours> getListCours() {
        return listCours;
    }

    public void setListCours(List<Cours> listCours) {
        this.listCours = listCours;
    }

    @ManyToMany(mappedBy = "ListEtudiant")
    private List<Enseignant> listEnseignant;

    public List<Enseignant> getListEnseignant() {
        return listEnseignant;
    }

    public void setListEnseignant(List<Enseignant> listEnseignant) {
        this.listEnseignant = listEnseignant;
    }

    public Long getNumInscription() {
        return numInscription;
    }

    public void setNumInscription(Long numInscription) {
        this.numInscription = numInscription;
    }

    public String getNameETU() {
        return nameETU;
    }

    public void setNameETU(String nameETU) {
        this.nameETU = nameETU;
    }

    public String getPrenomETU() {
        return prenomETU;
    }

    public void setPrenomETU(String prenomETU) {
        this.prenomETU = prenomETU;
    }

    public String getAdresseETU() {
        return adresseETU;
    }

    public void setAdresseETU(String adresseETU) {
        this.adresseETU = adresseETU;
    }

    public Date getDateEntrée() {
        return dateEntrée;
    }

    public void setDateEntrée(Date dateEntrée) {
        this.dateEntrée = dateEntrée;
    }

}

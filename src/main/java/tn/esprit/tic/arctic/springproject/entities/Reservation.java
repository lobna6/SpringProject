package tn.esprit.tic.arctic.springproject.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;


@Entity
    @Table( name = "Reservation")
    public class Reservation implements Serializable {
        @Id
        @Column(name="idReservation")
        private String idReservation; // Clé primaire
        private Boolean estValide;
        @Temporal(TemporalType.DATE)
        private Date anneeUniversitaire;

        @ManyToMany()
        private Set<Etudiant> etudiants;


    }



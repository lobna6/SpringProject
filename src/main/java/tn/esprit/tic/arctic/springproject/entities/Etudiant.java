package tn.esprit.tic.arctic.springproject.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;


@Entity
    @Table( name = "Etudiant")
    public class Etudiant implements Serializable {
        @Id
        @GeneratedValue (strategy = GenerationType.IDENTITY)//cle primaire de type nombre (n'est pas chaine de caractere)
        @Column(name="idEtudiant")
        private Long idEtudiant; // Clé primaire
        private String nomEt;
        private String prenomEt;
        private Long cin;
        private String ecole;
        @Temporal(TemporalType.DATE)
        private Date dateNaissance;
        //localDate dateNaissance; 2eme methode


    @ManyToMany(mappedBy="etudiants")
    private Set<Reservation> reservations;


    }


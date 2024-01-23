package tn.esprit.tic.arctic.springproject.services;

import tn.esprit.tic.arctic.springproject.entities.Etudiant;

import java.util.List;
import java.util.Optional;

public interface IEtudiantService {

    List<Etudiant> retrieveAllEtudiants();
    Etudiant addEtudiant(Etudiant e);
    Etudiant updateEtudiant(Etudiant e);
    Etudiant retrieveEtudiant(Long idEtudiant);
    void removeEtudiant(Long idEtudiant);
    List<Etudiant> addEtudiants (List<Etudiant> etudiants);
}

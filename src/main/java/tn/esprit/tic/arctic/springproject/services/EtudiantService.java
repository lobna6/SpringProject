package tn.esprit.tic.arctic.springproject.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tic.arctic.springproject.entities.Etudiant;
import tn.esprit.tic.arctic.springproject.repository.EtudiantRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class EtudiantService implements IEtudiantService {
    EtudiantRepository er;
    @Override
    public List<Etudiant> retrieveAllEtudiants() {
        return (List<Etudiant>) er.findAll();
    }

    @Override
    public Etudiant addEtudiant(Etudiant e) {
        return er.save(e);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        return er.save(e);
    }

    @Override
    public Etudiant retrieveEtudiant(Long idEtudiant) {
        return er.findById(idEtudiant).orElse(null);
    }

    @Override
    public void removeEtudiant(Long idEtudiant) {
     er.deleteById(idEtudiant);
    }

    @Override
    public List<Etudiant> addEtudiants(List<Etudiant> etudiants) {
        return (List<Etudiant>) er.saveAll(etudiants);
    }
}

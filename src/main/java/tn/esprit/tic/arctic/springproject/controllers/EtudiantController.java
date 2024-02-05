package tn.esprit.tic.arctic.springproject.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tic.arctic.springproject.entities.Etudiant;
import tn.esprit.tic.arctic.springproject.services.IEtudiantService;

import java.util.List;
@RestController
@AllArgsConstructor
@RequestMapping("/etudiant")
public class EtudiantController {

    IEtudiantService etudiantService ;
    @GetMapping("/retrieve-all-etudiants")
    public List<Etudiant> retrieveAllEtudiants (){
        List<Etudiant> listEtudiants = etudiantService.retrieveAllEtudiants();
        return listEtudiants;
    }
    // http://localhost:8089/foyer/etudiant/retrieve-etudiant/8
    @GetMapping("/retrieve-etudiant/{etudiant-id}")
    public Etudiant retrieveEtudiant (@PathVariable("etudiant-id") Long etudiantId ){
        return etudiantService.retrieveEtudiant (etudiantId);
    }
    // http://localhost:8089/foyer/et/add-etudiant
    @PostMapping("/add-etudiant")
    public Etudiant addEtudiant (@RequestBody Etudiant e){
        Etudiant etudiant = etudiantService.addEtudiant (e);
        return etudiant;
    }
    // http://localhost:8089/foyer/etudiant/remove-etudiant/1
    @DeleteMapping("/remove-etudiant/{etudiant_id}")
    public void removeEtudiant (@PathVariable ("etudiant_id") Long etudiantId ){
        etudiantService.removeEtudiant(etudiantId);
    }
    // http://localhost:8089/foyer/etudiant/update-etudiant
    @PutMapping("/update-etudiant")
    public Etudiant updateEtudiant(@RequestBody Etudiant e) {
        Etudiant etudiant = etudiantService .updateEtudiant(e);
        return etudiant;
    }
}


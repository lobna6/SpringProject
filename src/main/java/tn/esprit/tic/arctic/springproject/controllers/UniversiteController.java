package tn.esprit.tic.arctic.springproject.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.tic.arctic.springproject.entities.Universite;
import tn.esprit.tic.arctic.springproject.services.IUniversiteService;

@RestController
@AllArgsConstructor
@RequestMapping("/universite")
public class UniversiteController {
    IUniversiteService Un;
    @PutMapping("/affecterFoyerAUniversite/{idFoyer}/{nomUniversite}")
    public Universite affecterFoyerAUniversite(@PathVariable("idFoyer") Long idFoyer,
                                               @PathVariable("nomUniversite") String nomUniversite) {
        return Un.affecterFoyerAUniversite(idFoyer, nomUniversite);
    }
}

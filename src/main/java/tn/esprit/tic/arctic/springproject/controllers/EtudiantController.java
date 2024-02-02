package tn.esprit.tic.arctic.springproject.controllers;

import org.springframework.web.bind.annotation.RestController;
import tn.esprit.tic.arctic.springproject.services.EtudiantService;
import tn.esprit.tic.arctic.springproject.services.IEtudiantService;

@RestController
public class EtudiantController {
    IEtudiantService etudiantService;
}

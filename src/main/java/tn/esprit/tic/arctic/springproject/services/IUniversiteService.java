package tn.esprit.tic.arctic.springproject.services;

import tn.esprit.tic.arctic.springproject.entities.Universite;

public interface IUniversiteService {
    public Universite affecterFoyerAUniversite(long idFoyer, String nomUniversite);
}

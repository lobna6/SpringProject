package tn.esprit.tic.arctic.springproject.services;

import tn.esprit.tic.arctic.springproject.entities.Chambre;

import java.util.List;

public interface IChambreService {
    void listeChambresParBloc();
    public List<Chambre> getChambresParNomBloc (String nomBloc);
}

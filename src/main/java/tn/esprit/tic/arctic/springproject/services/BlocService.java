package tn.esprit.tic.arctic.springproject.services;

import tn.esprit.tic.arctic.springproject.entities.Bloc;
import tn.esprit.tic.arctic.springproject.entities.Chambre;
import tn.esprit.tic.arctic.springproject.repository.BlocRepository;
import tn.esprit.tic.arctic.springproject.repository.ChambreRepository;

import java.util.List;

public class BlocService implements IBlocService {
    ChambreRepository cr;
    BlocRepository br;
    public Bloc affecterChambresABloc (List<Long> numChambre , String nomBloc ){

        Bloc bloc = br.findByNomBloc(nomBloc);

        for (int i = 0; i < numChambre.size(); i++) {
            Chambre chambre = cr.findByNumeroChambre(numChambre.get(i));
            chambre.setBloc(bloc);
            cr.save(chambre);
        }

        return  bloc;
    }
}

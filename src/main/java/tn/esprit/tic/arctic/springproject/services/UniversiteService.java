package tn.esprit.tic.arctic.springproject.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tic.arctic.springproject.entities.Foyer;
import tn.esprit.tic.arctic.springproject.entities.Universite;
import tn.esprit.tic.arctic.springproject.repository.FoyerRepository;
import tn.esprit.tic.arctic.springproject.repository.UniversiteRepository;

@AllArgsConstructor
@Service
public class UniversiteService implements IUniversiteService{

    FoyerRepository fr ;
    UniversiteRepository ur ;
    @Override
    public Universite affecterFoyerAUniversite(long idFoyer, String nomUniversite)

    {

        Foyer f= fr.findById(idFoyer).get();
        Universite U = ur.findByNomUniversite(nomUniversite);

        f.setUniversite(U);
        fr.save(f);


        return U;
    }
}

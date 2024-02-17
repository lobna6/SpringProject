package tn.esprit.tic.arctic.springproject.services;

import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.tic.arctic.springproject.entities.Bloc;
import tn.esprit.tic.arctic.springproject.entities.Chambre;
import tn.esprit.tic.arctic.springproject.repository.BlocRepository;
import tn.esprit.tic.arctic.springproject.repository.ChambreRepository;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class ChambreService implements IChambreService{
    ChambreRepository cr;
    BlocRepository br;
    @Scheduled(fixedDelay = 60000)
    @Override
    public void listeChambresParBloc() {
        System.out.println("OK");

        List<Bloc> blocs =(List<Bloc>) br.findAll();
        blocs.stream().forEach(bloc -> {
            log.info("Bloc :"+bloc.getNomBloc()+"ayant une capacite de :"+bloc.getCapaciteBloc());
            log.info("Liste des chambres du bloc"+bloc.getNomBloc());
            bloc.getChambres().stream().forEach(chambre -> {
              log.info("chambre numéro "+chambre.getNumeroChambre()+" de type"+chambre.getTypeC());
            });

        });

    }
}

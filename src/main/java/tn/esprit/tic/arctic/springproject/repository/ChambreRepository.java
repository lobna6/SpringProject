package tn.esprit.tic.arctic.springproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tic.arctic.springproject.entities.Chambre;
import tn.esprit.tic.arctic.springproject.entities.TypeChambre;

import java.util.List;

public interface ChambreRepository extends JpaRepository <Chambre,Long> {
    List<Chambre> findByBlocIdBlocAndTypeC(Long idBloc , TypeChambre t);
    List<Chambre> findByReservationsEstValide (Boolean estValide);
    List<Chambre> findByBlocIdBlocAndCapaciteBlocGreaterThan (Long idBloc, Long capaciteBloc);
}

package tn.esprit.tic.arctic.springproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tic.arctic.springproject.entities.Bloc;

import java.util.List;
@Repository
public interface BlocRepository extends JpaRepository <Bloc,Long> {
    List<Bloc> findByFoyerUniversiteIdUniversite (Long idUniversite);

    Bloc findByNomBloc(String nomBloc);
}

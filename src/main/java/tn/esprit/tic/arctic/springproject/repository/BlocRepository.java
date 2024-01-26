package tn.esprit.tic.arctic.springproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tic.arctic.springproject.entities.Bloc;

import java.util.List;

public interface BlocRepository extends JpaRepository <Bloc,Long> {
    List<Bloc> findByFoyerUniversiteIdUniversite (Long idUniversite);
}

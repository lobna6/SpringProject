package tn.esprit.tic.arctic.springproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tic.arctic.springproject.entities.Universite;
@Repository
public interface UniversiteRepository extends JpaRepository<Universite,Long> {
}

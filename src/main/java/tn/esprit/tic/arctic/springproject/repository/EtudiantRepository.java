package tn.esprit.tic.arctic.springproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tic.arctic.springproject.entities.Etudiant;

@Repository
public interface EtudiantRepository extends CrudRepository<Etudiant,Long> {


    
}

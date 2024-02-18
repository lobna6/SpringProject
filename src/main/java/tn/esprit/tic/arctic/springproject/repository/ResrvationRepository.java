package tn.esprit.tic.arctic.springproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tic.arctic.springproject.entities.Reservation;

import java.util.Date;
import java.util.List;

@Repository
public interface ResrvationRepository extends JpaRepository<Reservation,Long> {
    List<Reservation> findByByAnneeUniversitaireBetween(Date dateDebut, Date dateFin);
}

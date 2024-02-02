package tn.esprit.tic.arctic.springproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tic.arctic.springproject.entities.Reservation;
@Repository
public interface ResrvationRepository extends JpaRepository<Reservation,Long> {
}

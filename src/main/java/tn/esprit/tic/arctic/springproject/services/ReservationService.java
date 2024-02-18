package tn.esprit.tic.arctic.springproject.services;

import tn.esprit.tic.arctic.springproject.entities.Reservation;
import tn.esprit.tic.arctic.springproject.repository.ResrvationRepository;

import java.util.Date;
import java.util.List;

public class ReservationService implements IReservationService{
    ResrvationRepository resrvationRepository;
    @Override
    public List<Reservation > getReservationParAnneeUniversitaire (Date dateDebut , Date dateFin ){
        return resrvationRepository.findByByAnneeUniversitaireBetween(dateDebut ,dateFin);
    }

}

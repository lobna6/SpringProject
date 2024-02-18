package tn.esprit.tic.arctic.springproject.services;

import tn.esprit.tic.arctic.springproject.entities.Reservation;

import java.util.Date;
import java.util.List;

public interface IReservationService {
    public List<Reservation> getReservationParAnneeUniversitaire (Date dateDebut , Date dateFin );
}

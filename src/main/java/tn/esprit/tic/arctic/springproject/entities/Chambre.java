package tn.esprit.tic.arctic.springproject.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table( name = "Chambre")
public class Chambre implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idChambre")
    private Long idChambre; // Clé primaire
    private Long numeroChambre;
    private Long capaciteBloc;
    @Enumerated(EnumType.STRING)
    private  TypeChambre typeC;

    @ManyToOne
    Bloc bloc;

    @OneToMany()
    private Set<Reservation> reservations;


}

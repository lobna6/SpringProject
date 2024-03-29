package tn.esprit.tic.arctic.springproject.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table( name = "Bloc")
public class Bloc implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idBloc")
    private Long idBloc; // Clé primaire
    private String nomBloc;
    private Long capaciteBloc;

    @ManyToOne
    Foyer foyer;

    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL,mappedBy="bloc")
    private Set<Chambre> chambres;

// Constructeur et accesseurs (getters) et mutateurs (setters)
}

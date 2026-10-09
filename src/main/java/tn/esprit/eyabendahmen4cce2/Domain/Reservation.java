package tn.esprit.eyabendahmen4cce2.Domain;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idReservation;

    LocalDate dateDebut;

    LocalDate dateFin;

    @Enumerated(value = EnumType.STRING)
    StatutReservation statut;
    @ManyToOne
    @JoinColumn(name = "vehicule_id")
    Vehicule vehicule;


}
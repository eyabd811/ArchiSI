package tn.esprit.eyabendahmen4cce2.Domain;
import java.util.List;
import java.util.ArrayList;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Vehicule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
     long idVehicule;
     String immatriculation;
     String marque;
     String modele;
     @Enumerated(value = EnumType.STRING)
     CategorieVehicule categorie;
    @Enumerated(value = EnumType.STRING)
     StatutVehicule statut;
     BigDecimal tarifJournalier;

    @ManyToOne
    Agence agence;
    @ManyToMany
    Set<Equipement> equipements;

    @OneToMany(mappedBy = "vehicule")
    Set<Reservation> reservation;


}

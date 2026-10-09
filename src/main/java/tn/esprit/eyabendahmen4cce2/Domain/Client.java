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
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idClient;

    String nom;

    String prenom;

    String email;

    String telephone;

    String numPermis;

    LocalDate dateInscription;
}
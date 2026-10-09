package tn.esprit.eyabendahmen4cce2.Domain;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Paiement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idPaiement;

    BigDecimal montant;

    LocalDate datePaiement;

    @Enumerated(value = EnumType.STRING)
    ModePaiement modePaiement;

}
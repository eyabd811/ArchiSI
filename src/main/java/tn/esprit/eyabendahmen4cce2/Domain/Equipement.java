package tn.esprit.eyabendahmen4cce2.Domain;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Equipement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idEquipement;

    String libelle;
}
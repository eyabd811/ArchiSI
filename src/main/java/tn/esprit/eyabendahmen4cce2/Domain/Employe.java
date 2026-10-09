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
public class Employe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idEmploye;

    String nom;

    String prenom;

    @Enumerated(value = EnumType.STRING)
    RoleEmploye role;

}
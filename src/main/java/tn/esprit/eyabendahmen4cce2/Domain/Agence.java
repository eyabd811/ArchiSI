package tn.esprit.eyabendahmen4cce2.Domain;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Agence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idAgence;
    String nom;
    String ville;
    String adresse;
    String telephone;
    @OneToMany(mappedBy = "agence")
    Set<Vehicule> vehicules;
    @OneToMany(mappedBy = "agence")
    Set<Employe> employe;


}
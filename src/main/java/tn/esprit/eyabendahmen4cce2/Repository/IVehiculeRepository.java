package tn.esprit.eyabendahmen4cce2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import tn.esprit.eyabendahmen4cce2.Domain.Vehicule;

public interface IVehiculeRepository extends JpaRepository<Vehicule,Long> {

}

package tn.esprit.eyabendahmen4cce2.Services;

import org.springframework.beans.factory.annotation.Autowired;
import tn.esprit.eyabendahmen4cce2.Domain.Vehicule;

import java.util.List;

public interface IVehiculeServices {
    Vehicule addVehicule(Vehicule vehicule);

    Vehicule getVehicule(Long id);

    Vehicule updateVehicule(Vehicule vehicule);

    void deleteVehicule(Long id);

    List<Vehicule> getAll();




}

package tn.esprit.eyabendahmen4cce2.Services.Impls;

import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.eyabendahmen4cce2.Domain.Vehicule;
import tn.esprit.eyabendahmen4cce2.Repository.IVehiculeRepository;
import tn.esprit.eyabendahmen4cce2.Services.IVehiculeServices;

import java.util.List;
@Service
@RequiredArgsConstructor
public class VehiculeServices implements IVehiculeServices {

    private final IVehiculeRepository iVehiculeRepository;

    @Override
    public Vehicule addVehicule(Vehicule vehicule) {
        return iVehiculeRepository.save(vehicule);
    }

    @Override
    public Vehicule getVehicule(Long id) {
        return iVehiculeRepository.findById(id).orElseThrow(()-> new EntityNotFoundException("vehicule not found"));
    }

    @Override
    public Vehicule updateVehicule(Vehicule vehicule) {
        return iVehiculeRepository.save(vehicule);
    }

    @Override
    public void deleteVehicule(Long id) {
        iVehiculeRepository.deleteById(id);
    }

    @Override
    public List<Vehicule> getAll() {
        return iVehiculeRepository.findAll();
    }
}

package tn.esprit.eyabendahmen4cce2.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.eyabendahmen4cce2.Domain.Vehicule;
import tn.esprit.eyabendahmen4cce2.Services.IVehiculeServices;

@RestController
@RequiredArgsConstructor
@RequestMapping("vehicules")
public class VehiculeController {
    private final IVehiculeServices iVehiculeServices;
    @PostMapping("add")
    Vehicule createVehicule(@RequestBody Vehicule vehicule){
        return iVehiculeServices.addVehicule(vehicule);
    }
    @GetMapping("{id}")
    Vehicule getVehicule(@PathVariable Long id){
        return iVehiculeServices.getVehicule(id);
    }

}

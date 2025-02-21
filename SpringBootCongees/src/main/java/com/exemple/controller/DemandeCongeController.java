package com.exemple.controller;

import com.exemple.model.DemandeConge;
import com.exemple.service.DemandeCongeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/demande-conges")
@RequiredArgsConstructor
public class DemandeCongeController {

    private final DemandeCongeService demandeCongeService;

    @GetMapping
    public List<DemandeConge> getAllDemandes() {
        return demandeCongeService.getAllDemandes();
    }

    @PostMapping
    public DemandeConge createDemande(@RequestBody DemandeConge demandeConge) {
        return demandeCongeService.saveDemande(demandeConge);
    }
}

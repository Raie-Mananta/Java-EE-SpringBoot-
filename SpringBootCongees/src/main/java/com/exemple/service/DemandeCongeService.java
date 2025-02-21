package com.exemple.service;

import com.exemple.model.DemandeConge;
import com.exemple.repository.DemandeCongeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DemandeCongeService {

    private final DemandeCongeRepository demandeCongeRepository;

    public List<DemandeConge> getAllDemandes() {
        return demandeCongeRepository.findAll();
    }

    public DemandeConge saveDemande(DemandeConge demandeConge) {
        return demandeCongeRepository.save(demandeConge);
    }
}

package com.exemple.service;

import com.exemple.model.Periode;
import com.exemple.repository.PeriodeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PeriodeService {

    private final PeriodeRepository periodeRepository;

    public List<Periode> getAllPeriodes() {
        return periodeRepository.findAll();
    }

    public Periode savePeriode(Periode periode) {
        return periodeRepository.save(periode);
    }
}

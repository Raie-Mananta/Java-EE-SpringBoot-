package com.exemple.controller;

import com.exemple.model.Periode;
import com.exemple.service.PeriodeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/periodes")
@RequiredArgsConstructor
public class PeriodeController {

    private final PeriodeService periodeService;

    @GetMapping
    public List<Periode> getAllPeriodes() {
        return periodeService.getAllPeriodes();
    }

    @PostMapping
    public Periode createPeriode(@RequestBody Periode periode) {
        return periodeService.savePeriode(periode);
    }
}

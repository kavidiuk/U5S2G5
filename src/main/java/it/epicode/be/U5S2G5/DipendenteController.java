package it.epicode.be.U5S2G5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// DipendenteController.java
@RestController
@RequestMapping("/api/dipendenti")
public class DipendenteController {
    @Autowired
    private DipendenteService dipendenteService;

    // Implementa gli endpoint CRUD e altri necessari
}

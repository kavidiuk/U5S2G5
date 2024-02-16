package it.epicode.be.U5S2G5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// DispositivoController.java
@RestController
@RequestMapping("/api/dispositivi")
public class DispositivoController {
    @Autowired
    private DispositivoService dispositivoService;

    // Implementa gli endpoint CRUD e altri necessari
}


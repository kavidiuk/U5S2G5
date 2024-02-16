package it.epicode.be.U5S2G5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import it.epicode.be.U5S2G5.repository.DispositivoRepository;
// DispositivoService.java
@Service
public class DispositivoService {
    @Autowired
    private DispositivoRepository dispositivoRepository;

}

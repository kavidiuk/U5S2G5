package it.epicode.be.U5S2G5;

// DispositivoRepository.java
public interface DispositivoRepository extends JpaRepository<Dispositivo, Long> {
    List<Dispositivo> findByStato(StatoDispositivo stato);
}

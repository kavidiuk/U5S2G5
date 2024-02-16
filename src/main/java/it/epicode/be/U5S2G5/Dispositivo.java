import jakarta.persistence.*;
import lombok.Data;

// Dispositivo.java
@Entity
@Data
public class Dispositivo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String tipo;

    @Enumerated(EnumType.STRING)
    private StatoDispositivo stato;

    // Altre proprietà e relazioni
}

public enum StatoDispositivo {
    DISPONIBILE,
    ASSEGNATO,
    IN_MANUTENZIONE,
    DISMESSO
}

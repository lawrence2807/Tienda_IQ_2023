package comTienda_IQ2023.domain;

import jakarta.persistence.*;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "carrito")
public class Carrito implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCarrito;
    private Long idCliente;

    public Carrito() {
    }

    public Carrito(Long idCarrito, Long idCliente) {
        this.idCliente = idCliente;
    }
}

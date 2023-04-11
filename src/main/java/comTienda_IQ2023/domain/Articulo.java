package comTienda_IQ2023.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "articulo")
public class Articulo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idArticulo;
    private Long idCategoria;
    private String descripcion;
    private String detalle;
    private boolean precio;
    private int existencias;
    private boolean activo;
    private String rutaImagen;

    public Articulo() {
    }

    public Articulo(Long idCategoria, String descripcion, String detalle, boolean precio, int existencias, boolean activo, String rutaImagen) {
        this.idCategoria = idCategoria;
        this.descripcion = descripcion;
        this.detalle = detalle;
        this.precio = precio;
        this.existencias = existencias;
        this.activo = activo;
        this.rutaImagen = rutaImagen;
    }

 

}

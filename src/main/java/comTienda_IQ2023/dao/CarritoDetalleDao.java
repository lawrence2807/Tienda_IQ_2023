
package comTienda_IQ2023.dao;

import comTienda_IQ2023.domain.Articulo;
import comTienda_IQ2023.domain.CarritoDetalle;
import java.util.List;
import org.springframework.data.repository.CrudRepository;


public interface CarritoDetalleDao extends CrudRepository<CarritoDetalle, Long>{
    
    List<CarritoDetalle> findByidCarrito(Long idCarrito);
    
    CarritoDetalle findByidCarritoandArticulo(Long idCarrito, Articulo articulo);
    
    void deleteByidCarrito(Long idCarrito);
    
}

package comTienda_IQ2023.dao;

import comTienda_IQ2023.domain.Carrito;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;


public interface CarritoDao extends CrudRepository<Carrito, Long>{
    
    Optional <Carrito> findByIdCliente(Long idCliente);
    
}

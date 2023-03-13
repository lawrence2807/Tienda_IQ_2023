package comTienda_IQ2023.dao;

import comTienda_IQ2023.domain.Articulo;
import org.springframework.data.repository.CrudRepository;

public interface ArticuloDao extends CrudRepository<Articulo, Long> {
    
}

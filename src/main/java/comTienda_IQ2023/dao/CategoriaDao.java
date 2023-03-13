package comTienda_IQ2023.dao;

import comTienda_IQ2023.domain.Categoria;
import org.springframework.data.repository.CrudRepository;

public interface CategoriaDao extends CrudRepository<Categoria, Long> {
    
}

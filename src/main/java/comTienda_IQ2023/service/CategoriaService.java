package comTienda_IQ2023.service;

import comTienda_IQ2023.domain.Categoria;
import java.util.List;

public interface CategoriaService {
    
    public List<Categoria> getCategorias(boolean activos);
    
    public Categoria getCategoria(Categoria categoria);
    
    public void save(Categoria categoria);// Tanto para insetar como modificar un registro
    
    public void delete(Categoria categoria);
}

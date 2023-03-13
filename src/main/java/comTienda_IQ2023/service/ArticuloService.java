package comTienda_IQ2023.service;

import comTienda_IQ2023.domain.Articulo;
import java.util.List;

public interface ArticuloService {
    
    public List<Articulo> getArticulos(boolean activos);
    
    public Articulo getArticulo(Articulo articulo);
    
    public void save(Articulo articulo);// Tanto para insetar como modificar un registro
    
    public void delete(Articulo articulo);
}

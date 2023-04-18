package comTienda_IQ2023.service;

import comTienda_IQ2023.domain.CarritoDetalle;
import java.util.List;




public interface CarritoDetalleService {
    
    public CarritoDetalle getCarritoDetalle(CarritoDetalle carritodetalle);
    
    public List<CarritoDetalle> getCarritoDetalles(Long idCarrito);
    
    public void save (CarritoDetalle carritoDetalle);
    
    public void delete (CarritoDetalle carritoDetalle);
    
    public void deleteAll(Long idCarrito);
    
    
}

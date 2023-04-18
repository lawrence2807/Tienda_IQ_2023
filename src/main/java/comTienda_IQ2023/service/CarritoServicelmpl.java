
package comTienda_IQ2023.service;

import comTienda_IQ2023.dao.CarritoDao;
import comTienda_IQ2023.domain.Carrito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarritoServicelmpl implements CarritoService{

    @Autowired
    CarritoDao carritoDao;
    
    @Override
    public Carrito getCarrito(Carrito carrito) {
        return carritoDao.findById(carrito.getIdCarrito()).orElse(null);
    }

    @Override
    public Carrito getCliente(Long idCliente) {
      Carrito carritoCliente = carritoDao.findByIdCliente(idCliente).orElse(null);
      
      if(carritoCliente == null){
          Carrito carritoNuevo = new Carrito(idCliente, idCliente);
          carritoCliente = carritoDao.save(carritoNuevo);
      }
      
      return carritoCliente;
    }
    
}

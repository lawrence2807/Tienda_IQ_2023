package comTienda_IQ2023.service;

import comTienda_IQ2023.dao.CarritoDetalleDao;
import comTienda_IQ2023.domain.CarritoDetalle;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarritoDetalleServicelmpl implements CarritoDetalleService {

    @Autowired
    CarritoDetalleDao carritoDetalleDao;

    @Override
    public CarritoDetalle getCarritoDetalle(CarritoDetalle carritodetalle) {
        return carritoDetalleDao.findById(carritodetalle.getIdCarrito()).orElse(null);
    }

    @Override
    public List<CarritoDetalle> getCarritoDetalles(Long idCarrito) {
        return carritoDetalleDao.findByidCarrito(idCarrito);
    }

    @Override
    public void save(CarritoDetalle carritoDetalle) {
        carritoDetalleDao.save(carritoDetalle);
    }

    @Override
    public void delete(CarritoDetalle carritoDetalle) {
        carritoDetalleDao.deleteById(carritoDetalle.getIdCarrito());
    }

    @Override
    public void deleteAll(Long idCarrito) {
       carritoDetalleDao.deleteByidCarrito(idCarrito);
    }

}

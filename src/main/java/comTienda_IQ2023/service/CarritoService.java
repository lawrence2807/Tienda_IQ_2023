package comTienda_IQ2023.service;

import comTienda_IQ2023.domain.Carrito;


public interface CarritoService {
    
    public Carrito getCarrito(Carrito carrito);
    
    public Carrito getCliente(Long idCliente);

    public Carrito getCarritoCliente(Long idCliente);
}

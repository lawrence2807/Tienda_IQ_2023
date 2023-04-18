
package comTienda_IQ2023.controller;

import comTienda_IQ2023.service.ArticuloService;
import comTienda_IQ2023.service.CarritoDetalleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CarritoController {
    
    @Autowired
    CarritoDetalleService carrictoDetalleService;
    
    @Autowired
    ArticuloService articuloService;
    
    @RequestMapping("/carrito/agregar/idArticulo}")
    public String agregar(Articulo articulo, HttpSession session) {
      
    }
    
}

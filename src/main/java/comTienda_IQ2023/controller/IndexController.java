package comTienda_IQ2023.controller;

import comTienda_IQ2023.dao.UsuarioDao;
import comTienda_IQ2023.domain.Carrito;
import comTienda_IQ2023.domain.CarritoDetalle;
import comTienda_IQ2023.domain.Cliente;
import comTienda_IQ2023.domain.Usuario;
import comTienda_IQ2023.service.CarritoService;
import comTienda_IQ2023.service.ClienteService;
import jakarta.servlet.http.HttpServletRequest;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class IndexController {

    @Autowired
    ClienteService clienteService;
    
    @Autowired
    UsuarioDao usuarioDao;
    
    @Autowired
    CarritoService carritoService;

    @GetMapping("/")
    public String inicio(Model model, HttpServletRequest request) {
        
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        UserDetails user = null;
        
        if(principal instanceof UserDetails){
        user = (UserDetails) principal;
        }
        
        boolean esCliente=false;
        
        Usuario usuario = usuarioDao.findByUsername(user.getUsername());
        
        if(usuario.getIdCliente() != null && usuario.getIdCliente() != 0){
            Carrito carrito = carritoService.getCarritoCliente(usuario.getIdCliente());
            
            request.getSession().setAttribute("idCliente", usuario.getIdCliente());
            request.getSession().setAttribute("idCarrito", carrito.getIdCarrito());
            request.getSession().setAttribute("esCliente", carrito.esCliente());
            
            List<CarritoDetalle> carritoDetalle = carritoDetalleService.getCarritoDetalles(carrito.getIdCarrito());
            
        }
        
        var articulos = articuloService.getArticuloS(true);
        model.addAttribute("articulo", articulo);
        model.addAttribute("esCliente", esCliente);

        return "index";
    }
}

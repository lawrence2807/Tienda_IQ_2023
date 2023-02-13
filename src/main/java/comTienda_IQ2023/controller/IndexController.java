package comTienda_IQ2023.controller;

import comTienda_IQ2023.dao.ClienteDao;
import comTienda_IQ2023.domain.Cliente;
import java.util.Arrays;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author ADMIN
 */
@Slf4j
@Controller
public class IndexController {

    @Autowired
    ClienteDao clienteDao;

    @GetMapping("/")
    public String inicio(Model model) {
        log.info("Ahora utilizando MVC");
//        String mensaje = "Estamos en semana 4, saludos!";
//        model.addAttribute("MensajeSaludo", mensaje);
//
//        Cliente cliente = new Cliente("Lawrence", "Calvo", "lawrencect28@gmail.com", "77889944");
//        Cliente cliente2 = new Cliente("Joshua", "Calvo", "tuky2807@gmail.com", "88994402");
//        Cliente cliente3 = new Cliente("Jairo", "Calvo", "tuky2807@gmail.com", "77894596");
 //        model.addAttribute("cliente", cliente);

//      List<Cliente> clientes = Arrays.asList(cliente, cliente2, cliente3);

        var clientes = clienteDao.findAll();
        model.addAttribute("clientes", clientes);

        return "index";
    }

}

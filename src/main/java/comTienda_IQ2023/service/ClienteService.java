package comTienda_IQ2023.service;

import comTienda_IQ2023.domain.Cliente;
import java.util.List;

public interface ClienteService {
    
    public List<Cliente> getClientes();
    
    public Cliente getCliente(Cliente cliente);
    
    public void save(Cliente cliente);// Tanto para insetar como modificar un registro
    
    public void delete(Cliente cliente);
}

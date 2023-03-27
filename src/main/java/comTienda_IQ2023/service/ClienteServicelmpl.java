package comTienda_IQ2023.service;

import comTienda_IQ2023.dao.ArticuloDao;
import comTienda_IQ2023.dao.ClienteDao;
import comTienda_IQ2023.domain.Cliente;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClienteServicelmpl implements ClienteService {

    @Autowired
    ClienteDao clienteDao;
    @Autowired
    ArticuloDao articuloDao;

    @Override
    @Transactional(readOnly = true) //Para manejo transacciones de solo lectura
    public List<Cliente> getClientes() {
        return (List<Cliente>) clienteDao.findAll();
    }

    @Override
    @Transactional(readOnly = true) //Para manejo transacciones de solo lectura
    public Cliente getCliente(Cliente cliente) {
        return clienteDao.findById(cliente.getIdCliente()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Cliente cliente) {
        clienteDao.save(cliente);
    }

    @Override
    @Transactional
    public void delete(Cliente cliente) {
        clienteDao.deleteById(cliente.getIdCliente());
    }

}

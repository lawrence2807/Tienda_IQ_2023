package comTienda_IQ2023.dao;


import comTienda_IQ2023.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UsuarioDao extends JpaRepository<Usuario, Long>{
    Usuario findByUsername(String usuername);    
}

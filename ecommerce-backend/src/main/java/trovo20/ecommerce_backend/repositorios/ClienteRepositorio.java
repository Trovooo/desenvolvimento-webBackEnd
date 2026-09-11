package trovo20.ecommerce_backend.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import trovo20.ecommerce_backend.entidades.Cliente;

public interface ClienteRepositorio extends JpaRepository<Cliente, Integer> {

}
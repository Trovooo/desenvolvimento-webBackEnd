package trovo20.ecommerce_backend.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import trovo20.ecommerce_backend.entidades.Pedido;


public interface PedidoRepositorio extends JpaRepository<Pedido, Integer> {

}

package trovo20.ecommerce_backend.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import trovo20.ecommerce_backend.entidades.Produto;

public interface ProdutoRepositorio extends JpaRepository<Produto, Integer> {

}

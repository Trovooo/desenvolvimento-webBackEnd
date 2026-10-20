package trovo20.ecommerce_backend.recursos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import trovo20.ecommerce_backend.entidades.Produto;
import trovo20.ecommerce_backend.repositorios.ProdutoRepositorio;


/*Recurso -- Como chamar ela na nuvem? */
@RestController 
@RequestMapping ("produtos")

public class ProdutoRecurso {
    @Autowired 
    private ProdutoRepositorio produtoRepositorio;

    @GetMapping 
    public List<Produto> listar () {
        return produtoRepositorio.findAll(Sort.by("nome"));
    }
}

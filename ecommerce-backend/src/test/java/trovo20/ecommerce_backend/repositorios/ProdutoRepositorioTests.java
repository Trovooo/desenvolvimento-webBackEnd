package trovo20.ecommerce_backend.repositorios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import trovo20.ecommerce_backend.entidades.Categoria;
import trovo20.ecommerce_backend.entidades.Produto;

@SpringBootTest


public class ProdutoRepositorioTests {
    @Autowired
    private CategoriaRepositorio categoriaRepositorio;

    @Autowired
    private ProdutoRepositorio produtoRepositorio;

    @Test

    public void deveSalvarUmProdutoNovo(){
        var produto = new Produto();
        produto.setNome("Notebook Lenovo");
        produto.setDescricao("SSD DE 2TB, 2 GB DE RAM");
        produto.setPreco(new BigDecimal(12500.30));
        produto.setEstoque(Short.parseShort("10"));

        var Categoria  = categoriaRepositorio.findById(Short.parseShort("1")).orElseThrow();
        produto.setCategoria(Categoria);

        System.out.println("ID Antes :" + produto.getId());

        produtoRepositorio.save(produto);

        System.out.println("ID Depois :" + produto.getId());

        assertNotNull(produto.getId());
    }
}

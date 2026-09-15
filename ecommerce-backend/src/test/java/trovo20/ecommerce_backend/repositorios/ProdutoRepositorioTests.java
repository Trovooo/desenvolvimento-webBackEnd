package trovo20.ecommerce_backend.repositorios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.math.BigDecimal;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;

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
        assertEquals(6, produto.getId());
    }

    @Test 
    public void deveBuscarUmProdutoPorId(){
        Produto produto = produtoRepositorio.findById(Integer.parseInt("3")).orElseThrow();
        assertNotNull(produto);
        assertEquals("Monitor 24 Pol", produto.getNome());
    }

    @Test 
    public void deveBuscarTodosOsProdutos() {
        List<Produto> produtos =  produtoRepositorio.findAll(Sort.by("nome"));

        assertEquals(7, produtos.size());
        assertEquals("Fone Bluetooth", produtos.get(0).getNome());
        assertEquals("Monitor 24 Pol", produtos.get(1).getNome());
    }

    @Test 
    public void deveExcluirUmProdutoPorId () {
        var produto = new Produto();
        produto.setNome("Teste");
        produto.setDescricao("Teste de Desc");
        produto.setPreco(new BigDecimal(1.00));
        produto.setEstoque(Short.parseShort("1"));

        Categoria Categoria  = categoriaRepositorio.findById(Short.parseShort("1")).orElseThrow();
        produto.setCategoria(Categoria);


        produtoRepositorio.save(produto);

        assertTrue(produtoRepositorio.existsById(produto.getId()));

        produtoRepositorio.deleteById(produto.getId());

        produtoRepositorio.existsById(produto.getId());
    }

    @Test 
    public void deveAtualizarONomeDeUmProduto () {
        var produto = new Produto();
        produto.setNome("Notebook Lenovo");
        produto.setDescricao("SSD DE 2TB, 2 GB DE RAM");
        produto.setPreco(new BigDecimal(12500.30));
        produto.setEstoque(Short.parseShort("10"));

        var Categoria  = categoriaRepositorio.findById(Short.parseShort("1")).orElseThrow();
        produto.setCategoria(Categoria);

        produtoRepositorio.save(produto);

        produto.setNome("Nome Teste 2 Super");

        produtoRepositorio.save(produto);

        assertEquals("Nome Teste 2 Super", produtoRepositorio.findById(produto.getId()).orElseThrow().getNome());

    }
}

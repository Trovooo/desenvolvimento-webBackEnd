package trovo20.ecommerce_backend.repositorios;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import trovo20.ecommerce_backend.entidades.ItemPedido;

@SpringBootTest
public class ItemPedidoRepositorioTests {

    @Autowired
    private ItemPedidoRepositorio itemPedidoRepositorio;

    @Autowired
    private PedidoRepositorio pedidoRepositorio;

    @Autowired
    private ProdutoRepositorio produtoRepositorio;

    @Test 
    public void deveSalvarUmItemPedidoNovo() {

        var pedido = pedidoRepositorio.findById(1).orElseThrow();
        var produto = produtoRepositorio.findById(1).orElseThrow();

        var itemPedido = new ItemPedido();
        itemPedido.setQuantity(2);
        itemPedido.setValorUnitario(new BigDecimal("350.00"));
        itemPedido.setPedido(pedido);
        itemPedido.setProduto(produto);

    

        assertNotNull(itemPedido);
    }
}
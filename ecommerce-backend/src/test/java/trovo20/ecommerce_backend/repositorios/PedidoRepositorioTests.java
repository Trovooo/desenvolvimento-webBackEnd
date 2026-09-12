package trovo20.ecommerce_backend.repositorios;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import trovo20.ecommerce_backend.entidades.Pedido;

@SpringBootTest
public class PedidoRepositorioTests {

    @Autowired
    private PedidoRepositorio pedidoRepositorio;

    @Autowired
    private ClienteRepositorio clienteRepositorio;

    @Test 
    public void deveSalvarUmPedidoNovo() {
        var pedido = new Pedido();
        pedido.setData(LocalDateTime.now());
        pedido.setStatus("PENDENTE");
        pedido.setValorTotal(new BigDecimal("150.00"));

        var cliente = clienteRepositorio.findById(1).orElseThrow();
        pedido.setCliente(cliente);

        System.out.println("ID Antes: " + pedido.getId());

        pedidoRepositorio.save(pedido);

        System.out.println("ID Depois: " + pedido.getId());

        assertNotNull(pedido);
    }
}
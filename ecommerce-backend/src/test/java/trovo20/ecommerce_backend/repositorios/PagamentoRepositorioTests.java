package trovo20.ecommerce_backend.repositorios;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import trovo20.ecommerce_backend.entidades.Pagamento;

@SpringBootTest
public class PagamentoRepositorioTests {

    @Autowired
    private PagamentoRepositorio pagamentoRepositorio;

    @Autowired
    private PedidoRepositorio pedidoRepositorio;

    @Test 
    public void deveSalvarUmPagamentoNovo() {

        var pedido = pedidoRepositorio.findById(1).orElseThrow();

        var pagamento = new Pagamento();
        pagamento.setValue(new BigDecimal("150.00"));
        pagamento.setData(LocalDateTime.now());
        pagamento.setStatus("PAGO");
        pagamento.setType("CARTAO_CREDITO");
        pagamento.setPedido(pedido);


        assertNotNull(pagamento);
    }
}
package trovo20.ecommerce_backend.repositorios;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import trovo20.ecommerce_backend.entidades.Cliente;

@SpringBootTest 
public class ClienteRepositorioTests {

    @Autowired 
    private ClienteRepositorio clienteRepositorio;

    @Test 
    public void deveSalvarUmClienteNovo() {
        var cliente = new Cliente();
        cliente.setName("Roberto");
        cliente.setEmail("roberto@email.com");
        cliente.setTelephone("14999999999");

        System.out.println("ID Antes: " + cliente.getId());

        clienteRepositorio.save(cliente);

        System.out.println("ID Depois: " + cliente.getId());

        assertNotNull(cliente.getId());
    }
}
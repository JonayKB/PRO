package parteUno;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import ies.puerto.parteUno.Cliente;
import ies.puerto.parteUno.RegistroClientes;

public class RegistroClientesTest {
    static RegistroClientes resgistro;
    static Cliente cliente1;
    static Cliente cliente2;

    @BeforeAll
    public static void BeforeAll(){
        ArrayList<Cliente> clientes = new ArrayList<>();
        cliente1 = new Cliente(0001, "Roberto", 1090);
        cliente2 = new Cliente(0002, "Ruben", 100000000);

        clientes.add(cliente1);
        resgistro = new RegistroClientes(clientes);
    }
    @Test
    public void cambiarSaldoCliente(){
        resgistro.cambiarSaldoCliente(0, 1000000);
        String resultado = resgistro.toString();
        String resultadoOK = "Soy el registro de clientes y estos son mis clientes: [Soy un cliente con numero 1 nombre: Roberto y un saldo de 1000000.0]";
        Assertions.assertEquals(resultadoOK, resultado);
    }
    @Test
    public void añadirClienteTestOK(){
        resgistro.añadirCliente(cliente2);
        String resultado = resgistro.toString();
        String resultadoOK = "Soy el registro de clientes y estos son mis clientes: [Soy un cliente con numero 1 nombre: Roberto y un saldo de 1090.0, Soy un cliente con numero 2 nombre: Ruben y un saldo de 1.0E8]";
        Assertions.assertEquals(resultadoOK, resultado);
    }

    @Test
    public void eliminarClienteTestOK(){
        resgistro.eliminarCliente(0);
        String resultado = resgistro.toString();
        String resultadoOK = "Soy el registro de clientes y estos son mis clientes: []";
        Assertions.assertEquals(resultadoOK, resultado);
    }
}

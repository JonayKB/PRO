import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ies.puerto.CuentaBancaria;

public class CuentaBancariaTest {
    
    CuentaBancaria cuenta0 = new CuentaBancaria();
    CuentaBancaria cuenta1 = new CuentaBancaria(1);
    CuentaBancaria cuenta2 = new CuentaBancaria(2, "Federico");
    CuentaBancaria cuenta3 = new CuentaBancaria(3, "Pablo", 1000);

    @Test
    public void mostrarDetallesTestOK(){
        String resultado = cuenta0.mostrarDetalles();
        String resultadoOK = "\nNúmero Cuenta: 0\nNombre: null\nSaldo: 0.0";

        Assertions.assertEquals(resultadoOK, resultado);
    }

    @Test
    public void getNumeroCuentaTestOK(){
        int resultado = cuenta1.getNumeroCuenta();
        int resultadoOK = 1;

        Assertions.assertEquals(resultadoOK, resultado);
    }

    @Test
    public void getNombreTitularTestOK(){
        String resultado = cuenta2.getNombreTitular();
        String resultadoOK = "Federico";

        Assertions.assertEquals(resultadoOK, resultado);
    }

    @Test
    public void mostrarSaldoTestOK(){
        double resultado = cuenta3.mostrarSaldo();
        double resultadoOK = 1000.0;
    
        Assertions.assertEquals(resultadoOK, resultado);
    }

    @Test
    public void depositarSaldoTestOK(){

        cuenta3.depositarSaldo(1000);

        double resultado = cuenta3.getSaldo();
        double resultadoOK = 2000.0;
    
        Assertions.assertEquals(resultadoOK, resultado);
    }

    @Test
    public void retirarSaldoTestOK(){

        cuenta3.retirarSaldo(30);
        double resultado = cuenta3.getSaldo();
        double resultadoOK = 970.0;
    
        Assertions.assertEquals(resultadoOK, resultado);
    }
}

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ies.puerto.CuentaBancaria;

public class CuentaBancariaTest {
    
    CuentaBancaria cuenta0 = new CuentaBancaria();
    CuentaBancaria cuenta1 = new CuentaBancaria(3, "Pablo", 1000);

    @Test
    public void mostrarDetallesTestOK(){
        String resultado = cuenta0.mostrarDetalles();
        String resultadoOK = "\nNúmero Cuenta: 0\nNombre: null\nSaldo: 0.0";

        Assertions.assertEquals(resultadoOK, resultado, "Mostar detalles esta mal");
    }

    @Test
    public void getNumeroCuentaTestOK(){
        int resultado = cuenta1.getNumeroCuenta();
        int resultadoOK = 3;

        Assertions.assertEquals(resultadoOK, resultado, "El numero cuenta esta mal");
    }

    @Test
    public void getNombreTitularTestOK(){
        String resultado = cuenta1.getNombreTitular();
        String resultadoOK = "Pablo";

        Assertions.assertEquals(resultadoOK, resultado, "El nombre esta mal");
    }


    @Test
    public void depositarSaldoTestOK(){

        cuenta1.depositarSaldo(1000);

        double resultado = cuenta1.getSaldo();
        double resultadoOK = 2000.0;
    
        Assertions.assertEquals(resultadoOK, resultado, "Depositar saldo esta mal");
    }

    @Test
    public void retirarSaldoTestOK(){

        cuenta1.retirarSaldo(30);
        double resultado = cuenta1.getSaldo();
        double resultadoOK = 970.0;
    
        Assertions.assertEquals(resultadoOK, resultado, "Retirar saldo esta mal");
    }
}

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ies.puerto.CuentaBanco;

public class CuentaBancoTest {
    
    CuentaBanco cuentaBanco;
    @BeforeEach
    public void beforeEach(){
        cuentaBanco = new CuentaBanco("Federico", 1000);
    }

    @Test
    public void verificarSetGetTitularTestOK(){
        String resultadoOK = "Pablo";
        cuentaBanco.setTitular(resultadoOK);
        String resultado = cuentaBanco.getTitular();

        Assertions.assertEquals(resultadoOK, resultado);
    }

    @Test
    public void verificarInformacionTestOK(){
        String resultado = cuentaBanco.toString();
        String resultadoOK = "\nTitular: Federico\nSaldo: 1000.0";

        Assertions.assertEquals(resultadoOK, resultado);
    }

    public void verificarRetirar(double aRetirar,double resultadoOK){
        cuentaBanco.retirarDinero(aRetirar);
        double resultado = cuentaBanco.getSaldo();

        Assertions.assertEquals(resultadoOK, resultado);
        
    }


    @Test
    public void verificarRetirarTestOK(){
        verificarRetirar(900f, 100);
    }

    @Test
    public void verificarRetirarNoPosibleTestOK(){
        verificarRetirar(1200f, 1000f);
    }

    @Test
    public void verificarDepositarTestOK(){
        double resultadoOK = cuentaBanco.getSaldo()+1000f;
        cuentaBanco.depositarDinero(1000f);
        double resultado = cuentaBanco.getSaldo();

        Assertions.assertEquals(resultadoOK, resultado);
    }

    @Test
    public void constructorDefaultTestOK(){
        CuentaBanco cuentaBancoVacio = new CuentaBanco();

        Assertions.assertNotNull(cuentaBancoVacio);
    }

    @Test
    public void constructorSinSaldoTestOK(){
        CuentaBanco cuentaBancoVacio = new CuentaBanco("Maria");
        double resultado = cuentaBancoVacio.getSaldo();
        double resultadoOK = 0;

        Assertions.assertEquals(resultadoOK, resultado);
    }
}

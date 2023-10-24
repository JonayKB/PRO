package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio2Test {
    Ejercicio2 ejercicio2 = new Ejercicio2();

    @Test
    public void verificarPositivoTestOK(){
        verificarPositivo(32,true);
    }

    @Test
    public void verificarParTestOK(){
        verificarPar(10,true);
    }




    @Test
    public void verificarPositivoTestError(){
        verificarPositivo(-5, false);
    }

    @Test
    public void verificarParTeErrorOK(){
        verificarPar(-11, false);
        
    }




    public void verificarPositivo(int numero, boolean valorBoolean){
        boolean resultado = ejercicio2.calcularPositivo(numero);

        Assertions.assertEquals(valorBoolean, resultado);
    }

    public void verificarPar(int numero, boolean valorBoolean){
        boolean resultado = ejercicio2.calcularPar(numero);

        Assertions.assertEquals(valorBoolean, resultado);
    }






}

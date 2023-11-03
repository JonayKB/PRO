package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio10Test {
    Ejercicio10 ejercicio10 = new Ejercicio10();


    public void verificarCombinacion(int[][] matriz, boolean resultadoOK){
        
        boolean resultado = ejercicio10.comprobarDiagonal(matriz);
        

        Assertions.assertEquals(resultadoOK, resultado);
    }


    @Test
    public void verificarDiagonalTestOK(){
        int[][] matriz= {{1,0,0},{0,1,0},{0,0,1}};
        boolean resultadoOK = true;
        verificarCombinacion(matriz, resultadoOK);
    }

    @Test
    public void verificarDiagonalTestError(){
        int[][] matriz= {{1,0,0},{1,1,0},{0,0,1}};
        boolean resultadoOK = false;
        verificarCombinacion(matriz, resultadoOK);
    }

    @Test
    public void verificarDiagonalTest4OK(){
        int[][] matriz= {{1,0,0,0},{0,1,0,0},{0,0,1,0},{0,0,0,1}};
        boolean resultadoOK = true;
        verificarCombinacion(matriz, resultadoOK);
    }
}

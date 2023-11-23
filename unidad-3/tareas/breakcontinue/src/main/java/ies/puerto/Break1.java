package ies.puerto;
/**
 * Escribe un programa que encuentre el primer número divisible por 7 y 5 entre 1 y 100 (inclusive), utilizando break.
 */
public class Break1 {
    public int divisibleEntre5y7() {
        int resultado = 0;

        for (int i = 1; i <= 100; i++) {
            if ((i%5 == 0) && (i%7 == 0)) {
                resultado = i;
                break;
            }
        }
        return resultado;
    }
}
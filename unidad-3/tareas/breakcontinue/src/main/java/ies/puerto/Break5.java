package ies.puerto;
/**
 * Escribe un programa que encuentre el primer número divisible por 5 y mayor que 30, utilizando break.
 */
public class Break5 {
    public int divisible5Mayor30(){
        int numero = 30;
        while (true) {
            numero++;
            if (numero%5 == 0) {
                break;
            }
            
        }
        return numero;
    }
}

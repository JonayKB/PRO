package ies.puerto;
/**
 * Escribe un programa que encuentre el primer número primo mayor que 100 , utilizando break.
 */
public class Break2 {
    
    public int primoMayor100(){
        int numero = 100;

        while(true) {
            numero++;
            for (int i = 2; i <= numero/2 ; i++) {

                if(numero%i == 0){
                    return numero;
                }
            }
        }
        
        
        
    }
}

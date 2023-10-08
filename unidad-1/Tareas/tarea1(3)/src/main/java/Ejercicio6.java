

/**
 * @author JonayKB
 * Ejercicio numero seis
 */
public class Ejercicio6 {
    /**
     * Descripcion del algoritmo
     * 6. Escribe un programa en Java que encuentre todos los números Armstrong entre 1 y 1000.
     * @param args
     */ 
    
    public static void main(String[] args) {

        int resultado=0,digitos=1,inicial,contador,numExponentado=1;
        for(int i=1; i<=1000;i++){
            //Reinicio de variables y creación
            inicial = i;
            contador = i;
            resultado=0;
            digitos=1;

            //Contar digitos
            while(contador>0){
                contador= contador/10;
                digitos++;
            }
            digitos= digitos-1;
            contador = digitos;

            while(contador>0){
                //Cacular exponente de cada digito
                for (int contadorExponente = digitos; contadorExponente>0; contadorExponente--){
                    numExponentado= numExponentado*(inicial%10);
                }
            
                resultado += numExponentado;

                inicial=inicial/10;
                contador--;
                numExponentado=1;
            }

            if(i==resultado){
            System.out.println("Es un número Armstrong "+resultado);
        
            }
        }
    }
}
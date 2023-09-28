
/**
 * @author JonayKB
 * Ejercicio numero tres
 */
public class Ejercicio3 {

    /**
     * Desarrolle un algoritmo que realice la sumatoria de los números enteros comprendidos entre el 1 y el 10, es decir, 1 + 2 + 3 + …. + 10. 
     * Utilia un buble __for__ y un bucle __while__
     * @param args
     */
    public static void main(String[] args) {
        //Variables
        int suma=0;
        //Se suma hasta 10
        for (int i=0; i<=10; i++){

            suma+=i;

            //Enseñamos el resultado
            System.out.println(suma);
        }
        int i=0;
        suma=0;
        while (i <=10){
            suma+=i;
            i++;
            //Enseñamos el resultado
            System.out.println(suma);
        }
        


    }
}
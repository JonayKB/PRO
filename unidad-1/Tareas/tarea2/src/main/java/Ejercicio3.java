
/**
 * @author JonayKB
 * Ejercio numero tres
 */
public class Ejercicio3 {

    /**
     * Descripcion del algoritmo
     * Desarrolle un algoritmo que realice la sumatoria de los números enteros comprendidos entre el 1 y el 10, es decir, 1 + 2 + 3 + …. + 10. Utilia un buble __for__ y un bucle __while__
     * @param args
     */
    public static void main(String[] args) {
        //suma es la variable que recibe la suma constante de valores
        int suma=0;
        //Se suma hasta 10
        for (int i=0; i<=10; i++){
            //Sumamos i a suma cada vez
            suma+=i;
        }
        //Enseñamos el resultado
        System.out.println(suma);


    }
}
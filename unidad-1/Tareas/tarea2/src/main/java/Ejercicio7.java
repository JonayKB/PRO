import java.util.Scanner;

/**
 * @author JonayKB
 * Ejercicio numero siete
 */
public class Ejercicio7 {
    /**
     * Descripcion del algoritmo
     * Realice un algoritmo que a partir de proporcionarle la velocidad de un automóvil, expresada en kilómetros por hora, proporcione la velocidad en metros por segundo
     * @param args
     */

    //Abrimos scanner
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //Declaramos variables
        float valor,conversion=3.6f;

        //Pedimos el valor
        System.out.println("Introduzca el valor en km/h: ");
        valor=input.nextFloat();

        //Calculamos e enseñamos el resultado
        System.out.println(valor+" en m/s es "+ valor/conversion);


    }
}
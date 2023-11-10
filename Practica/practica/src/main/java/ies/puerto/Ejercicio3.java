package ies.puerto;
/**
 * Supongamos que tenemos que implementar un programa que clasifica a los estudiantes según sus calificaciones en un examen.

Las notas son:

    Entre 0-4.99. Suspenso.

    Entre 5-5.99. Aprobado.

    Entre 6-6.99. Bien.

    Entre 7-8.99. Notable.

    Entre 9-9.99. Sobresaliente.

    Entre 10. Matrícula.

    Implementa la solución realizando dos métodos/programas. El primero utilizando if/else y el segundo utilizando switch.
    @author JonayKB
 */
public class Ejercicio3 {

    public Ejercicio3(){};

    /**
     * Función que da la calificacion de un alumno mediante if else
     * @param nota del alumno
     * @return calificacion del alumno
     */
    public String calcularClasificacionIfElse(float nota){
        String clasificacion = "";

        if (nota<4.99f) {
            clasificacion = "Suspenso";
        }
        else if (nota<=6f) {
            clasificacion = "Aprobado";
        }
        else if (nota<=6.99f) {
            clasificacion = "Bien";
        }
        else if (nota<=8.99f) {
            clasificacion = "Notable";
        }
        else if (nota<=9.99f) {
            clasificacion = "Sobresaliente";
        }
        else{
            clasificacion = "Matrícula";
        }


        return clasificacion;
    }
    /**
     * Función para calcular la calificacion de un alumno mediante switch
     * @param nota del alumno (int porque float no se puede, podria usarse String pero seria aun menos preciso)
     * @return string con la calificacion
     */
    public String calcularClasificacionSwitch(int nota){ // No se pueden usar ni doubles ni floats
        String clasificacion = "";
        switch (nota) {
            case 0:
            case 1: 
            case 2:
            case 3:
            case 4:
            clasificacion = "Suspenso";
            break;

            case 5:
            case 6:
                clasificacion = "Aprobado";
                break;

            case 7:
                clasificacion = "Bien";
                break;

            case 8:
                clasificacion = "Notable";
                break;

            case 9:
                clasificacion = "Sobresaliente";
                break;
            case 10:
                clasificacion = "Matrícula";
                break;
            default:
                clasificacion = "No es una nota valida";
                break;
        }
    
        return clasificacion;

    }
}

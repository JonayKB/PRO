import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ies.puerto.Ejercicio3;

public class Ejercicio3Test {
    Ejercicio3 ejercicio3 = new Ejercicio3();


    public void verificarCalificaicionIfElse(String resultadoOK, float nota, String mensaje){
        String resultado = ejercicio3.calcularClasificacionIfElse(nota);
        Assertions.assertEquals(resultadoOK, resultado, mensaje);
    }

    public void verificarCalificaicionSwitch(String resultadoOK, int nota, String mensaje){
        String resultado = ejercicio3.calcularClasificacionSwitch(nota);
        Assertions.assertEquals(resultadoOK, resultado, mensaje);
    }


    @Test
    public void verificarCalificaicionIfElseTestOK(){
        verificarCalificaicionIfElse("Suspenso", 0, "El test de suspenso esta mal");
        verificarCalificaicionIfElse("Aprobado", 5, "El test de aprobado esta mal");
        verificarCalificaicionIfElse("Bien", 6.5f, "El test de bien esta mal");
        verificarCalificaicionIfElse("Notable", 8.99f, "El test de notable esta mal");
        verificarCalificaicionIfElse("Sobresaliente", 9.99f, "El test de sobresaliente esta mal");
        verificarCalificaicionIfElse("Matrícula", 10, "El test de matricula esta mal");
    }

    @Test
    public void verificarCalificaicionSwitchTestOK(){
        verificarCalificaicionSwitch("Suspenso", 0, "El test de suspenso esta mal");
        verificarCalificaicionSwitch("Aprobado", 5, "El test de aprobado esta mal");
        verificarCalificaicionSwitch("Bien", 7, "El test de bien esta mal");
        verificarCalificaicionSwitch("Notable", 8, "El test de notable esta mal");
        verificarCalificaicionSwitch("Sobresaliente", 9, "El test de sobresaliente esta mal");
        verificarCalificaicionSwitch("Matrícula", 10, "El test de matricula esta mal");
        verificarCalificaicionSwitch("No es una nota valida", 30, "El test de nota no valida esta mal");
    }
}

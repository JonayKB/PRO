import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ies.puerto.Persona;

public class PersonaTest {
    Persona persona0 = new Persona();
    Persona persona1 = new Persona("Federico", 15, "federico@gmail.com", "648742361");


    @Test
    public void persona1TestOK() {
        String resultadoOK = "Nombre: Federico\nEdad: 15\nEmail: federico@gmail.com\nTeléfono: 648742361";
        String resultado = persona1.imprimir();
        Assertions.assertEquals(resultadoOK, resultado);

    }

    @Test
    public void persona0TestOK() {
        String resultadoOK = "Nombre: null\nEdad: 0\nEmail: null\nTeléfono: null";
        String resultado = persona0.imprimir();
        Assertions.assertEquals(resultadoOK, resultado);

    }

    @Test
    public void getNombreTestOK() {
        String resultado = persona1.getNombre();
        String resultadoOK = "Federico";
        Assertions.assertEquals(resultadoOK, resultado);

    }

    @Test
    public void getEdadTestOK() {
        int resultado = persona1.getEdad();
        int resultadoOK = 15;
        Assertions.assertEquals(resultadoOK, resultado);

    }

    @Test
    public void getEmailTestOK() {
        String resultado = persona1.getEmail();
        String resultadoOK = "federico@gmail.com";
        Assertions.assertEquals(resultadoOK, resultado);

    }

    @Test
    public void getTelefonoTestOK() {
        String resultado = persona1.getTelefono();
        String resultadoOK = "648742361";
        Assertions.assertEquals(resultadoOK, resultado);

    }

    @Test
    public void setTelefonoTestOK() {
        String resultadoOK = "100000";
        persona1.setTelefono(resultadoOK);
        String resultado = persona1.getTelefono();
        Assertions.assertEquals(resultadoOK, resultado);
    }

    @Test
    public void setEdadTestOK() {
        int resultadoOK = 10;
        persona1.setEdad(resultadoOK);
        int resultado = persona1.getEdad();
        Assertions.assertEquals(resultadoOK, resultado);
    }

    @Test
    public void setNombreTestOK() {
        String resultadoOK = "Pedro";
        persona1.setNombre(resultadoOK);
        String resultado = persona1.getNombre();
        Assertions.assertEquals(resultadoOK, resultado);
    }

}

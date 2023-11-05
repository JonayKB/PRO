import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ies.puerto.Persona;

public class PersonaTest {
    Persona persona0 = new Persona();
    Persona persona1 = new Persona("Federico", 15, "federico@gmail.com", "648742361");
    Persona persona2 = new Persona("Federico", 15, "federico@gmail.com");
    Persona persona3 = new Persona("Federico", 15);
    Persona persona4 = new Persona("Federico");

    @Test
    public void persona4TestOK() {
        String resultadoOK = "Nombre: Federico\nEdad: 0\nEmail: null\nTeléfono: null";
        String resultado = persona4.imprimir();
        Assertions.assertEquals(resultadoOK, resultado);

    }

    @Test
    public void persona3TestOK() {
        String resultadoOK = "Nombre: Federico\nEdad: 15\nEmail: null\nTeléfono: null";
        String resultado = persona3.imprimir();
        Assertions.assertEquals(resultadoOK, resultado);

    }

    @Test
    public void persona2TestOK() {
        String resultadoOK = "Nombre: Federico\nEdad: 15\nEmail: federico@gmail.com\nTeléfono: null";
        String resultado = persona2.imprimir();
        Assertions.assertEquals(resultadoOK, resultado);

    }

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
        String resultado = "123456789";
        persona1.setTelefono(resultado);
        String resultadoOK = "123456789";
        Assertions.assertEquals(resultadoOK, resultado);

    }

    @Test
    public void setEdadTestOK() {
        int resultado = 10;
        persona1.setEdad(resultado);
        int resultadoOK = 10;
        Assertions.assertEquals(resultadoOK, resultado);

    }

}

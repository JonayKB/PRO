import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ies.puerto.Persona;

public class PersonaTest {

    Persona persona1 = new Persona("Federico", 15, "federico@gmail.com", "648742361");

    
    

    @Test
    public void personaTestOK(){
        String resultadoOK = "Nombre: Federico\nEdad: 15\nEmail: federico@gmail.com\nTeléfono: 648742361";
        String resultado = persona1.imprimir();
        Assertions.assertEquals(resultadoOK, resultado);
        
    }
    @Test
    public void getNombre(){
        String resultado = persona1.getNombre();
        String resultadoOK = "Federico";
        Assertions.assertEquals(resultadoOK, resultado);

    }

    @Test
    public void getEdad(){
        int resultado = persona1.getEdad();
        int resultadoOK = 15;
        Assertions.assertEquals(resultadoOK, resultado);

    }

    @Test
    public void getEmail(){
        String resultado = persona1.getEmail();
        String resultadoOK = "federico@gmail.com";
        Assertions.assertEquals(resultadoOK, resultado);

    }

    @Test
    public void getTelefono(){
        String resultado = persona1.getTelefono();
        String resultadoOK = "648742361";
        Assertions.assertEquals(resultadoOK, resultado);

    }



}

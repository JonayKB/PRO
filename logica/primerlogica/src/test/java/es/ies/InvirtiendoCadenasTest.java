package es.ies;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.ies.puerto.InvirtiendoCadenas;

public class InvirtiendoCadenasTest {
    InvirtiendoCadenas invirtiendoCadenas;
    @BeforeEach
    public void beforeEach(){
        invirtiendoCadenas = new InvirtiendoCadenas();
    }
    @Test
    public  void invirtiendoCadenasTest(){
        String cadena="Hola Gente";
        String cadenaInvertida="etneG aloH";
        Assertions.assertEquals(cadenaInvertida, invirtiendoCadenas.invertirCadena(cadena));
    }
}

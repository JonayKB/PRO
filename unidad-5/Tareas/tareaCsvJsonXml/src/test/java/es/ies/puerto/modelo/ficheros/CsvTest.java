package es.ies.puerto.modelo.ficheros;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.ies.puerto.modelo.ficheros.abstrac.Ficheros;
import es.ies.puerto.modelo.ficheros.impl.Csv;
import es.ies.puerto.modelo.impl.Personaje;

public class CsvTest {
    private Csv csv;
    List<Personaje> personas;
    List<Personaje> personasEscribir;
    Personaje personajeEscribir;
    @BeforeEach
    public void beforeEach(){
        csv = new Csv();
        personas = csv.leer();
        personasEscribir = new ArrayList<>();
        List<String> poderes = Arrays.asList("poder1,poder2,poder3".split(Ficheros.SEPARADOR));
        personajeEscribir = new Personaje(null, null, null, poderes);
        personasEscribir.add(personajeEscribir);
    }
    @AfterEach
    public void afterEach(){
        csv.actualizar(personas);
    }

    @Test
    public void CsvNotNullTest(){
        Assertions.assertNotNull(csv);
    }

    @Test
    public void CsvLeerEscribirTest(){
        csv.escribir(personasEscribir);
        Assertions.assertEquals(csv.leer().toString(), personasEscribir.toString());;
    }
    @Test
    public void CsvEliminarTest(){
        csv.eliminar(Ficheros.RUTA_CSV);
        Assertions.assertEquals(Arrays.asList(), csv.leer());
    }
    @Test
    public void CsvModificarTest(){
        csv.modificar(personasEscribir);
        Assertions.assertEquals(csv.leer().toString(), personasEscribir.toString());;
    }
}

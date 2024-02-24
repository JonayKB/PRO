package modelo.ficheros.csv;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.ies.puerto.modelo.ficheros.csv.FileCsv;
import es.ies.puerto.modelo.impl.Alimento;
import es.ies.puerto.modelo.impl.Aparato;
import es.ies.puerto.modelo.impl.CuidadoPersonal;
import es.ies.puerto.modelo.impl.Souvenir;
import es.ies.puerto.negocio.TiendaNegocio;

public class FileCsvTest {
    FileCsv fileCsv;
    TiendaNegocio tiendaNegocio;
    @BeforeEach
    public void beforeEach()throws ParseException,IOException{
        tiendaNegocio = new TiendaNegocio();
        fileCsv = new FileCsv();

    }
    @Test
    public void listaToCsvAlimentosTest()throws ParseException,IOException{
        List<Alimento> alimentos = tiendaNegocio.obtenerAlimentos();
        Assertions.assertTrue(fileCsv.listaToCsv(alimentos).contains("Leche"));
    }
    @Test
    public void listaToCsvAparatosTest()throws ParseException,IOException{
        Map<String,Aparato> aparatos = tiendaNegocio.obtenerAparatos();
        Assertions.assertTrue(fileCsv.listaToCsv(aparatos).contains("Televisor LED"));
    }
    @Test
    public void listaToCsvSouvenirsTest()throws ParseException,IOException{
        Set<Souvenir> souvenirs = tiendaNegocio.obtenerSouvenirs();
        Assertions.assertTrue(fileCsv.listaToCsv(souvenirs).contains("Llavero"));
    }
    @Test
    public void listaToCsvCuidadoPersonalsTest()throws ParseException,IOException{
        Set<CuidadoPersonal> cuidadoPersonals = tiendaNegocio.obtenerCuidadoPersonal();
        Assertions.assertTrue(fileCsv.listaToCsv(cuidadoPersonals).contains("Champú"));
    }
    
}

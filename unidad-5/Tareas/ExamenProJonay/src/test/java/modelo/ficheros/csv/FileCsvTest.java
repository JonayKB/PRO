package modelo.ficheros.csv;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.ies.puerto.modelo.ficheros.abstrac.Ficheros;
import es.ies.puerto.modelo.ficheros.csv.FileCsv;
import es.ies.puerto.modelo.impl.Alimento;
import es.ies.puerto.modelo.impl.Aparato;
import es.ies.puerto.modelo.impl.CuidadoPersonal;
import es.ies.puerto.modelo.impl.Souvenir;
import es.ies.puerto.negocio.TiendaNegocio;

public class FileCsvTest {
    FileCsv fileCsv;
    TiendaNegocio tiendaNegocio;
    List<Alimento> alimentos;
    Map<String, Aparato> aparatos;
    Set<CuidadoPersonal> cuidadoPersonals;
    Set<Souvenir> souvenirs;

    @BeforeEach
    public  void BeforeEach() throws Exception{
        tiendaNegocio = new TiendaNegocio();
        fileCsv = new FileCsv();
        alimentos = tiendaNegocio.obtenerAlimentos();
        aparatos = tiendaNegocio.obtenerAparatos();
        cuidadoPersonals = tiendaNegocio.obtenerCuidadoPersonal();
        souvenirs = tiendaNegocio.obtenerSouvenirs();
        
    }
    @AfterEach
    public void afterEach()throws IOException,ParseException{
        fileCsv.borrar(Ficheros.RUTA_ALIMENTOS_CSV, fileCsv.listaToFile(alimentos));
        fileCsv.borrar(Ficheros.RUTA_APARATOS_CSV, fileCsv.listaToFile(aparatos));
        fileCsv.borrar(Ficheros.RUTA_CUIDADOSPERSONALES_CSV, fileCsv.listaToFile(cuidadoPersonals));
        fileCsv.borrar(Ficheros.RUTA_SOUVENIRS_CSV, fileCsv.listaToFile(souvenirs));
    }
    @Test
    public void listaToCsvAlimentosTest()throws ParseException,IOException{
        List<Alimento> alimentos = tiendaNegocio.obtenerAlimentos();
        Assertions.assertTrue(fileCsv.listaToFile(alimentos).contains("Leche"));
    }
    @Test
    public void listaToCsvAparatosTest()throws ParseException,IOException{
        Map<String,Aparato> aparatos = tiendaNegocio.obtenerAparatos();
        Assertions.assertTrue(fileCsv.listaToFile(aparatos).contains("APA001"));
    }
    @Test
    public void listaToCsvSouvenirsTest()throws ParseException,IOException{
        Set<Souvenir> souvenirs = tiendaNegocio.obtenerSouvenirs();
        Assertions.assertTrue(fileCsv.listaToFile(souvenirs).contains("Llavero"));
    }
    @Test
    public void listaToCsvCuidadoPersonalsTest()throws ParseException,IOException{
        Set<CuidadoPersonal> cuidadoPersonals = tiendaNegocio.obtenerCuidadoPersonal();
        Assertions.assertTrue(fileCsv.listaToFile(cuidadoPersonals).contains("Champú"));
    }
    
}

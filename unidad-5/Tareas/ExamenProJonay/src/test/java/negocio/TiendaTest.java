package negocio;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import es.ies.puerto.modelo.ficheros.abstrac.Ficheros;
import es.ies.puerto.modelo.ficheros.csv.FileCsv;
import es.ies.puerto.modelo.impl.Alimento;
import es.ies.puerto.modelo.impl.Aparato;
import es.ies.puerto.modelo.impl.CuidadoPersonal;
import es.ies.puerto.modelo.impl.Souvenir;
import es.ies.puerto.negocio.TiendaNegocio;

class TiendaTest {

    private static final int POPULARIDAD = 8;
    private static final float PRECIO = 0f;
    private static final String FCaducidad = "2024-02-14";
    private static final String FEntrada = "2024-02-09";
    private static final String TESTUDI = "TESTUDI";
    private static final String TEST = "TEST";
    TiendaNegocio tienda;
    FileCsv fileCsv;
    List<Alimento> alimentos;
    Map<String, Aparato> aparatos;
    Set<CuidadoPersonal> cuidadoPersonals;
    Set<Souvenir> souvenirs;

    @BeforeEach
    public  void BeforeEach() throws Exception{
        tienda = new TiendaNegocio();
        fileCsv = new FileCsv();
        alimentos = tienda.obtenerAlimentos();
        aparatos = tienda.obtenerAparatos();
        cuidadoPersonals = tienda.obtenerCuidadoPersonal();
        souvenirs = tienda.obtenerSouvenirs();
        
    }
    @AfterEach
    public void afterEach()throws IOException,ParseException{
        fileCsv.borrar(Ficheros.RUTA_ALIMENTOS_CSV, fileCsv.listaToFile(alimentos));
        fileCsv.borrar(Ficheros.RUTA_APARATOS_CSV, fileCsv.listaToFile(aparatos));
        fileCsv.borrar(Ficheros.RUTA_CUIDADOSPERSONALES_CSV, fileCsv.listaToFile(cuidadoPersonals));
        fileCsv.borrar(Ficheros.RUTA_SOUVENIRS_CSV, fileCsv.listaToFile(souvenirs));
    }
    @Test
    void comprobarConstructorCompletoTest(){
        Assertions.assertTrue(tienda.toString().contains("Leche"));
    }
    @Test
    void agregarAlimentoTest() throws ParseException{
        Alimento alimentoTest = new Alimento(TEST,PRECIO,FEntrada,TESTUDI,FCaducidad);
        tienda.agregarAlimento(alimentoTest);
        Assertions.assertEquals(tienda.obtenerAlimento(TESTUDI), alimentoTest);
    }
    @Test
    void agregarAparatoTest(){
        Aparato aparatoTest = new Aparato(TEST,PRECIO,FEntrada,TESTUDI);
        tienda.agregarAparato(aparatoTest);
        Assertions.assertEquals(tienda.obtenerAparato(TESTUDI), aparatoTest);
    }
    @Test
    void agregarCuidadoPersonalTest(){
        CuidadoPersonal cuidadoPersonalTest = new CuidadoPersonal(TEST,PRECIO,FEntrada,TESTUDI,POPULARIDAD);
        tienda.agregarCuidadosPersonal(cuidadoPersonalTest);
        Assertions.assertEquals(tienda.obtenerCuidadoPersonal(TESTUDI), cuidadoPersonalTest);
    }
    @Test
    void agregarSouvenirTest(){
        Souvenir souvenirTest = new Souvenir(TEST,PRECIO,FEntrada,TESTUDI);
        tienda.agregarSouvenir(souvenirTest);
        Assertions.assertEquals(tienda.obtenerSouvenir(TESTUDI), souvenirTest);
    }
    @Test
    void cantidadAlimentosTest(){
        Assertions.assertEquals(0,tienda.cantidadAlimentos());
    }
    @Test
    void cantidadAparatosTest(){
        Assertions.assertEquals(0,tienda.cantidadAparatos());
    }
    @Test
    void cantidadCuidadoPersonalesTest(){
        Assertions.assertEquals(0,tienda.cantidadCuidadoPersonales());
    }
    @Test
    void cantidadSouvenirsTest(){
        Assertions.assertEquals(0,tienda.cantidadSouvenirs());
    }
    @Test
    void cantidadProductosTest(){
        Assertions.assertEquals(0,tienda.cantidadProductos());
    }
    @Test
    void eliminarAlimentoTest()throws Exception{
        Assertions.assertTrue(tienda.eliminarAlimento("ALM001"));
    }
    @Test
    void eliminarAparatoTest(){
        Assertions.assertTrue(tienda.eliminarAparato("APA001"));
    }
    @Test
    void eliminarCuidadoPersonalTest(){
        Assertions.assertTrue(tienda.eliminarCuidadoPersonal("CUI003"));
    }
    @Test
    void eliminarSouvenirsTest(){
        Assertions.assertTrue(tienda.eliminarSouvenir("SOU001"));
    }
    @Test
    void gananciaAlimentosTest(){
        Assertions.assertEquals(0, tienda.ganaciaAlimentos());
    }
    @Test
    void gananciaCuidadosPersonalesTest(){
        Assertions.assertEquals(9.415998f ,tienda.gananciaCuidadoPersonales());
    }
    @Test
    void ganaciaSouvenirsTest(){
        Assertions.assertEquals(1.9409995079040527,tienda.ganaciaSouvenirs());
    }
    @Test
    void ganaciaAparatosTest(){
        Assertions.assertEquals(562.78735f, tienda.gananciaAparatos() ); 
    }
    @Test
    void ganaciaProductosTest(){
        Assertions.assertEquals(577.0283f, tienda.ganaciaProductos()); 
    }
    @Test
    void precioAlimentosTest(){
        Assertions.assertEquals(0f, tienda.precioAlimentos());
    }
    @Test
    void precioAparatosTest(){
        Assertions.assertEquals(1339.97f, tienda.precioAparatos());
    }
    @Test
    void precioCuidadosPersonalesTest(){
        Assertions.assertEquals(11.7699995f ,tienda.precioCuidadoPersonales());
    }
    @Test
    void precioSouvenirsTest(){
        Assertions.assertEquals(11.7699995f ,tienda.precioCuidadoPersonales());
    }
    @Test
    void precioProductosTest(){
        Assertions.assertEquals(1366.45f, tienda.precioProductos());
    }
    @Test
    void productosRecomendadosTest(){
        Assertions.assertTrue( tienda.productosRecomendados().toString().contains("Champú")&& tienda.productosRecomendados().toString().contains("Crema"));
    }
    @Test
    void venderAlimentoTestTrue()throws Exception{
        Assertions.assertTrue(tienda.venderAlimento("ALM003"));
    }
    @Test
    void modificarAlimentoTest()throws ParseException{
        String nombreUpdate="PRUEBA";
        String udi="ALM003";
        Alimento alimento = tienda.obtenerAlimento(udi);
        tienda.modificarAlimento(nombreUpdate, alimento.getPrecio(), alimento.getFechaEntrada(), alimento.getUdi(), alimento.getFechaCaducidad());
        Assertions.assertEquals(nombreUpdate, tienda.obtenerAlimento(udi).getNombre());
    }
    @Test
    void modificarAparatoTest(){
        String nombreUpdate="PRUEBA";
        String udi="APA003";
        Aparato aparato = tienda.obtenerAparato(udi);
        tienda.modificarAparato(nombreUpdate, aparato.getPrecio(), aparato.getFechaEntrada(), aparato.getUdi());
        Assertions.assertEquals(nombreUpdate, tienda.obtenerAparato(udi).getNombre());
    }
    @Test
    void modificarCuidadoPersonalTest(){
        String nombreUpdate="PRUEBA";
        String udi="CUI003";
        CuidadoPersonal cuidadoPersonal = tienda.obtenerCuidadoPersonal(udi);
        tienda.modificarCuidadoPersonal(nombreUpdate, cuidadoPersonal.getPrecio(), cuidadoPersonal.getFechaEntrada(), cuidadoPersonal.getUdi(),cuidadoPersonal.calcularPopularidad());
        Assertions.assertEquals(nombreUpdate, tienda.obtenerCuidadoPersonal(udi).getNombre());
    }
    @Test
    void modificarSouvenirTest(){
        String nombreUpdate="PRUEBA";
        String udi="SOU003";
        Souvenir souvenir = tienda.obtenerSouvenir(udi);
        tienda.modificarSouvenir(nombreUpdate, souvenir.getPrecio(), souvenir.getFechaEntrada(), souvenir.getUdi());
        Assertions.assertEquals(nombreUpdate, tienda.obtenerSouvenir(udi).getNombre());
    }
    


    
}

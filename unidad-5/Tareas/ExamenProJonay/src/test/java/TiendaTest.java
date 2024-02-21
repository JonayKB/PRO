
import java.text.ParseException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import es.ies.puerto.modelo.productos.Alimento;
import es.ies.puerto.modelo.productos.Aparato;
import es.ies.puerto.modelo.productos.CuidadoPersonal;
import es.ies.puerto.modelo.productos.Souvenir;
import es.ies.puerto.negocio.Tienda;

class TiendaTest {

    static String alimentosCsvBackUp;
    static String cuidadoPersonalCsvBackUp;
    static String aparatosCsvBackUp;
    static String souvenirsCsvBackUp;
    static Tienda tienda;
    static Tienda tiendaVacia;
    @org.junit.jupiter.api.BeforeEach
    public  void BeforeEach() throws Exception{
        tienda = new Tienda();
        tiendaVacia = new Tienda();

    }
    @AfterEach
    public void afterEach(){
        
    }
    @Test
    void comprobarConstructorCompletoTest(){
        Assertions.assertEquals(tienda.toString(),tienda.toString());
    }
    @Test
    void agregarAlimentoTest() throws ParseException{
        Alimento alimentoTest = new Alimento("Leche",1.99f,"2024-02-09","ALM002","2024-02-14");
        tienda.agregarAlimento(alimentoTest);
        Assertions.assertEquals(tienda.obtenerAlimento("ALM002"), alimentoTest);
    }
    @Test
    void agregarAparatoTest(){
        Aparato aparatoTest = new Aparato("Smartphone",799.99f,"2024-02-09","APA002");
        tienda.agregarAparato(aparatoTest);
        Assertions.assertEquals(tienda.obtenerAparato("APA002"), aparatoTest);
    }
    @Test
    void agregarCuidadoPersonalTest(){
        CuidadoPersonal cuidadoPersonalTest = new CuidadoPersonal("Crema hidratante",5.49f,"2024-02-09","CUI002",8);
        tienda.agregarCuidadosPersonal(cuidadoPersonalTest);
        Assertions.assertEquals(tienda.obtenerCuidadoPersonal("CUI002"), cuidadoPersonalTest);
    }
    @Test
    void agregarSouvenirTest(){
        Souvenir souvenirTest = new Souvenir("Llavero",0.99f,"2024-02-09","SOU002");
        tienda.agregarSouvenir(souvenirTest);
        Assertions.assertEquals(tienda.obtenerSouvenir("SOU002"), souvenirTest);
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
    void eliminarAlimentoTest(){
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
    void ganaciaSouvenirsTest(){
        Assertions.assertEquals(1.9409995079040527,tienda.ganaciaSouvenirs());
    }
    @Test
    void ganaciaAparatosTest(){
        Assertions.assertEquals(16.795799255371094, tienda.gananciaAparatos() ); 
    }
    @Test
    void ganaciaProductosTest(){
        Assertions.assertEquals(24.676799774169922, tienda.ganaciaProductos()); 
    }
    @Test
    void precioAlimentosTest(){
        Assertions.assertEquals(3.75, tienda.precioAlimentos());
    }
    @Test
    void precioAparatosTest(){
        Assertions.assertEquals(1339.969970703125, tienda.precioAparatos());
    }
    @Test
    void precioCuidadosPersonalesTest(){
        Assertions.assertEquals(11.769999504089355 ,tienda.precioCuidadoPersonales());
    }
    @Test
    void precioProductosTest(){
        Assertions.assertEquals(1358.2099609375, tienda.precioProductos());
    }
    @Test
    void productosRecomendadosTest(){
        Assertions.assertTrue( tienda.productosRecomendados().toString().contains("Champú")&& tienda.productosRecomendados().toString().contains("Crema"));
    }
    @Test
    void venderAlimentoTestTrue(){
        Assertions.assertTrue(tienda.venderAlimento("ALM003"));
    }


    
}

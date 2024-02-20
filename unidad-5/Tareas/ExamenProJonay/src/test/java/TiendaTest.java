import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import es.ies.puerto.modelo.productos.Alimento;
import es.ies.puerto.modelo.productos.Aparato;
import es.ies.puerto.modelo.productos.CuidadoPersonal;
import es.ies.puerto.modelo.productos.Souvenir;
import es.ies.puerto.negocio.Tienda;

public class TiendaTest {
    static Alimento alimento;
    static Alimento alimento2;
    static Aparato aparato;
    static Aparato aparato2;
    static CuidadoPersonal cuidadoPersonal;
    static CuidadoPersonal cuidadoPersonal2;
    static Souvenir souvenir;

    static ArrayList<Alimento> alimentos;
    static HashMap<String, Aparato> aparatos;
    static HashSet<CuidadoPersonal> cuidadoPersonales;
    static HashSet<Souvenir> souvenirs;

    static Tienda tienda;
    static Tienda tiendaVacia;
    @BeforeAll
    public static void BeforeAll() throws ParseException{
        alimento = new Alimento("Manzanas", 2.50f, "2024-01-09","ALM001","2024-01-15");
        alimento2 = new Alimento("Arroz",3.75f,	"2024-01-15","ALM003","2024-02-30");
        aparato2 = new Aparato("Cafetera",39.99f,"2024-02-09","APA003");
        aparato = new Aparato("Televisor LED",499.99f,"2024-02-09","APA001");
        cuidadoPersonal = new CuidadoPersonal("Cepillo de dientes",2.29f,"2024-02-09","CUI003",6);
        cuidadoPersonal2 = new CuidadoPersonal("Champú",3.99f,"2024-02-09","CUI001"	,7);
        souvenir = new Souvenir("Imán de nevera",1.99f,"2024-02-09","SOU001");

        alimentos = new ArrayList<>();
        alimentos.add(alimento);
        alimentos.add(alimento2);

        aparatos = new HashMap<>();
        aparatos.put(aparato.getUdi(),aparato);
        aparatos.put(aparato2.getUdi(), aparato2);

        cuidadoPersonales = new HashSet<>();
        cuidadoPersonales.add(cuidadoPersonal);
        cuidadoPersonales.add(cuidadoPersonal2);
        
        souvenirs = new HashSet<>();
        souvenirs.add(souvenir);

        tienda = new Tienda(alimentos, aparatos, cuidadoPersonales, souvenirs);
        tiendaVacia = new Tienda();
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
        Assertions.assertEquals(1.3125, tienda.ganaciaAlimentos());
    }
    @Test
    void ganaciaSouvenirsTest(){
        Assertions.assertEquals(0.5969998836517334,tienda.ganaciaSouvenirs());
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
        Assertions.assertEquals(839.97998046875, tienda.precioAparatos());
    }
    @Test
    void precioCuidadosPersonalesTest(){
        Assertions.assertEquals(3.990000009536743 ,tienda.precioCuidadoPersonales());
    }
    @Test
    void precioProductosTest(){
        Assertions.assertEquals(55.21000289916992, tienda.precioProductos());
    }
    @Test
    void productosRecomendadosTest(){
        Assertions.assertEquals("[{ nombre='Champú', precio='3.99', fechaEntrada='2024-02-09', udi='CUI001'}]", tienda.productosRecomendados().toString());
    }
    @Test
    void venderAlimentoTestTrue(){
        Assertions.assertTrue(tienda.venderAlimento("ALM003"));
    }


    
}

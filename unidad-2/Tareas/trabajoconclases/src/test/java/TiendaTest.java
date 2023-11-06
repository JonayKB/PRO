

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ies.puerto.Producto;
import ies.puerto.Tienda;

public class TiendaTest {
    Tienda tienda = new Tienda();

    Producto producto0 = new Producto();
    Producto producto1 = new Producto("Desodorante", 3f,9);

    @Test
    public void comprobarProducto0TestOK(){
        String resultado =producto0.getNombre();
        String resultadoOK = null;
        Assertions.assertEquals(resultadoOK, resultado);
    }
    @Test
    public void comprobarProducto1TestOK(){
        String resultado =producto1.getNombre();
        String resultadoOK = "Desodorante";
        Assertions.assertEquals(resultadoOK, resultado);
    }
    @Test
    public void comprobarProducto2TestOK(){
        float resultado =producto1.getPrecio();
        float resultadoOK = 3f;
        Assertions.assertEquals(resultadoOK, resultado);
    }
    @Test
    public void comprobarProducto3TestOK(){
        float resultado =producto1.getStock();
        float resultadoOK = 9;
        Assertions.assertEquals(resultadoOK, resultado);
    }






    @Test
    public void TiendaProductosImprimirTestOK(){
        String resultado =tienda.mostrarInventario();
        String resultadoOK = 
                "\nNombre: Jabon\n"+
                "Precio: 3.0\n"+
                "Stock: 100\n"+
                "Nombre: Tenedor\n"+
                "Precio: 1.0\n"+
                "Stock: 1000\n"+
                "Nombre: Filete de ternera\n"+
                "Precio: 5.0\n"+
                "Stock: 10";
        Assertions.assertEquals(resultadoOK, resultado);
    }

    @Test
    public void agregarStockTestOK(){
        tienda.arrayProductos[0].agregarStock( 10);
        int resultado = tienda.arrayProductos[0].getStock();
        int resultadoOK = 110;
        Assertions.assertEquals(resultadoOK, resultado);
    }

    @Test
    public void venderTestOK(){
        tienda.arrayProductos[0].vender( 10);
        int resultado = tienda.arrayProductos[0].getStock();
        int resultadoOK = 90;
        Assertions.assertEquals(resultadoOK, resultado);
    }
     @Test
    public void cambiarPrecioTestOK(){
        tienda.arrayProductos[1].cambiarPrecio(100f);
        float resultado = tienda.arrayProductos[1].getPrecio();
        float resultadoOK = 100f;
        Assertions.assertEquals(resultadoOK, resultado);
    }
}

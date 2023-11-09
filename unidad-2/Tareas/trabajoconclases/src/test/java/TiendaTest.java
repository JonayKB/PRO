

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ies.puerto.Producto;
import ies.puerto.Tienda;

public class TiendaTest {
    public Producto[] arrayProductos = 
    {
        new Producto("Jabon", 3f, 100),
        new Producto("Tenedor", 1f, 1000),
        new Producto("Filete de ternera", 5f, 10)
    };

    Tienda tienda = new Tienda(arrayProductos);

    Producto producto0 = new Producto();
    Producto producto1 = new Producto("Desodorante", 3f,9);

    @Test
    public void constructorDefaultTestOK(){
        String resultado =producto0.getNombre();
        String resultadoOK = null;
        Assertions.assertEquals(resultadoOK, resultado, "El constructor deafult esta mal");
    }
    @Test
    public void getNombreTestOK(){
        String resultado =producto1.getNombre();
        String resultadoOK = "Desodorante";
        Assertions.assertEquals(resultadoOK, resultado, "El nombre esta mal");
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
        Assertions.assertEquals(resultadoOK, resultado, "Imprimir esta mal");
    }

    @Test
    public void agregarStockTestOK(){
        arrayProductos[0].agregarStock( 10);
        int resultado = arrayProductos[0].getStock();
        int resultadoOK = 110;
        Assertions.assertEquals(resultadoOK, resultado, "AgregarStock esta mal");
    }

    @Test
    public void venderTestOK(){
        arrayProductos[0].vender( 10);
        int resultado = arrayProductos[0].getStock();
        int resultadoOK = 90;
        Assertions.assertEquals(resultadoOK, resultado, "Vender esta mal");
    }
     @Test
    public void cambiarPrecioTestOK(){
        arrayProductos[1].setPrecio(100f);
        float resultado = arrayProductos[1].getPrecio();
        float resultadoOK = 100f;
        Assertions.assertEquals(resultadoOK, resultado, "Cambiar Precio esta mal");
    }
}

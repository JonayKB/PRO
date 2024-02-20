package es.ies.puerto.modelo.interfaces;

public interface IVendible {
    /**
     * Precio maximo de un producto
     * @return precio maximo del producto
     */
    float precioMaximo();
    /**
     * Cantidad disponible de un producto
     * @return la cantidad disponible de un producto
     */
    int cantidadDisponible();
}

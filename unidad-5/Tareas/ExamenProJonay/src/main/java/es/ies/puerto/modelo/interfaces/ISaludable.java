package es.ies.puerto.modelo.interfaces;

public interface ISaludable {
    /**
     * Dias que quedan para la caducidad de un producto
     * @return cantidad de dias
     */
    int diasCaducidad();
    /**
     * Verifica si el producto esta caducado o no
     * @return si esta caducado o no
     */
    boolean productoCaducado();
}

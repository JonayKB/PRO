package es.ies.puerto.modelo.interfaces;

public interface IRecomendable {
    /**
     * Si recomendar un producto o no
     * @return si es recomendado
     */
    boolean recomendarProducto();
    /**
     * La popularidad de un producto
     * @return
     */
    int calcularPopularidad();
}

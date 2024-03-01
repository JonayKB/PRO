package es.ies.puerto.modelo.ficheros.interfaces;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import java.util.Map;
import java.util.Set;

import es.ies.puerto.modelo.abstrac.Producto;
import es.ies.puerto.modelo.impl.Alimento;
import es.ies.puerto.modelo.impl.Aparato;


public interface IFicheros {
    public boolean existe(String path);
    /**
     * Le los productos de un lugar
     * @param path el lugar
     * @param tipo el tipo de producto a leer
     * @return los productos
     * @throws IOException
     * @throws ParseException
     */
    public Set<Producto> leer(String path,String tipo) throws IOException, ParseException;
    /**
     * Escribe en un documento
     * @param path documento
     * @param texto lo que escribe (completo)
     * @return
     */
    public boolean escribir(String path, String texto);
    /**
     * Borra el documento
     * @param path el lugar que esta
     * @return si lo borro o no
     */
    public boolean borrar(String path);
    /**
     * Borra t0do el contenido del archivo y escribe nuevo
     * @param path el lugar
     * @param texto que escribe
     * @return
     */
    public boolean borrarYEscribir(String path, String texto);
    /**
     * Modifca el documento
     * @param path donde modificar
     * @param texto el texto que pone
     * @return
     */
    public boolean modificar(String path, String texto);

    /**
     * Crea un alimento con la linea
     * @param array la linea
     * @return
     * @throws ParseException
     */
    public Producto crearAlimento(String[] array) throws ParseException;
    /**
     * Crea un aparato con la linea
     * @param array la linea
     * @return
     */
    public Producto crearAparato(String[] array);
    /**
     * Crea un cuidado personal con la linea
     * @param array la linea
     * @return
     */
    public Producto crearCuidadoPersonal(String[] array);
    /**
     * Crea un souvenir con la linea
     * @param array la linea
     * @return
     */
    public Producto crearSouvenir(String[] array);

    /**
     * Convierte una lista en un string modeado para el archivo requerrido
     * @param alimentos a convertir
     * @return
     */
    public String listaToFile(List<Alimento> alimentos);
    /**
     * Convierte una lista en un string modeado para el archivo requerrido
     * @param aparatos a convertir
     * @return
     */
    public String listaToFile(Map<String,Aparato> aparatos);
    /**
     * Convierte una lista en un string modeado para el archivo requerrido
     * @param lista a convertir
     * @return
     */
    public String listaToFile(Set<?> lista);
}

package es.ies.puerto.negocio;


import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import es.ies.puerto.modelo.abstrac.Producto;
import es.ies.puerto.modelo.ficheros.abstrac.Ficheros;
import es.ies.puerto.modelo.ficheros.csv.FileCsv;
import es.ies.puerto.modelo.impl.Alimento;
import es.ies.puerto.modelo.impl.Aparato;
import es.ies.puerto.modelo.impl.CuidadoPersonal;
import es.ies.puerto.modelo.impl.Souvenir;


public class TiendaNegocio {
    List<Alimento> alimentos;
    Map<String, Aparato> aparatos;
    Set<CuidadoPersonal> cuidadoPersonales;
    Set<Souvenir> souvenirs;
    Set<Producto> productos;
    FileCsv fileCsv;

    public TiendaNegocio() throws ParseException,IOException{
        fileCsv = new FileCsv();

        alimentos=obtenerAlimentos();
        cuidadoPersonales=obtenerCuidadoPersonal();
        souvenirs=obtenerSouvenirs();
        aparatos=obtenerAparatos();
        productos=obtenerProductos();
    }



    public List<Alimento> getAlimentos() {
        return this.alimentos;
    }

    public void setAlimentos(List<Alimento> alimentos) {
        this.alimentos = alimentos;
    }

    public Map<String,Aparato> getAparatos() {
        return this.aparatos;
    }

    public void setAparatos(Map<String,Aparato> aparatos) {
        this.aparatos = aparatos;
    }

    public Set<CuidadoPersonal> getCuidadoPersonales() {
        return this.cuidadoPersonales;
    }

    public void setCuidadoPersonales(Set<CuidadoPersonal> cuidadoPersonales) {
        this.cuidadoPersonales = cuidadoPersonales;
    }

    public Set<Souvenir> getSouvenirs() {
        return this.souvenirs;
    }

    public void setSouvenirs(Set<Souvenir> souvenirs) {
        this.souvenirs = souvenirs;
    }

    /**
     * Obtiene un alimento
     * @param udi por lo que se obtiene
     * @return el alimento
     */
    public Alimento obtenerAlimento(String udi){
        if (!alimentos.isEmpty()) {
            for (Alimento alimento : alimentos) {
                if (alimento.getUdi().equals(udi)) {
                    return alimento;
                }
            }
        }
        return null;
    }
    /**
     * Obtiene un aparato
     * @param udi por lo que se obtiene
     * @return el aparato
     */
    public Aparato obtenerAparato(String udi){
        if (!aparatos.isEmpty() && aparatos.containsKey(udi)) {
            return aparatos.get(udi);
        }
        return null;
    }

    /**
     * Obtener CuidadoPersonal
     * @param udi por el cual obtener
     * @return el cuidadoPersonal
     */
    public CuidadoPersonal obtenerCuidadoPersonal(String udi){
        if (!cuidadoPersonales.isEmpty()) {
            for (CuidadoPersonal cuidadoPersonal : cuidadoPersonales) {
                if (cuidadoPersonal.getUdi().equals(udi)) {
                    return cuidadoPersonal;
                }
            }
        }
        return null;
    }

    /**
     * Obtener Souvenir
     * @param udi por el cual obtener
     * @return el souvenir
     */
    public Souvenir obtenerSouvenir(String udi){
        if (!souvenirs.isEmpty()) {
            for (Souvenir souvenir : souvenirs) {
                if (souvenir.getUdi().equals(udi)) {
                    return souvenir;
                }
            }
        }
        return null;
    }




    /**
     * Añade un alimento
     * @param alimento a añadir
     * @return añadido o no
     */
    public boolean agregarAlimento(Alimento alimento){
        if (!alimentos.contains(alimento)) {
            fileCsv.almacenar(Ficheros.RUTA_ALIMENTOS_CSV, alimento.toCsv());
            return alimentos.add(alimento);
        }
        return true;
    }
    /**
     * Añade un aparato
     * @param aparato a añadir
     * @return añadido o no
     */
    public boolean agregarAparato(Aparato aparato){
        if (!aparatos.containsKey(aparato.getUdi())) {
            aparatos.put(aparato.getUdi(), aparato);
            return fileCsv.almacenar(Ficheros.RUTA_APARATOS_CSV, aparato.toCsv());
        }
        return true;
    }
    /**
     * Añade un cuidado personal
     * @param cuidadoPersonal a añadir
     * @return añadido o no
     */
    public boolean agregarCuidadosPersonal(CuidadoPersonal cuidadoPersonal){
        if (!cuidadoPersonales.contains(cuidadoPersonal)) {
            fileCsv.almacenar(Ficheros.RUTA_CUIDADOSPERSONALES_CSV, cuidadoPersonal.toCsv());
            return cuidadoPersonales.add(cuidadoPersonal);
        }
        return true;
    }
    /**
     * Añade un souvenir
     * @param souvenir a añadir
     * @return añadido o no
     */
    public boolean agregarSouvenir(Souvenir souvenir){
        if (!souvenirs.contains(souvenir)) {
            fileCsv.almacenar(Ficheros.RUTA_SOUVENIRS_CSV, souvenir.toCsv());
            return souvenirs.add(souvenir);
        }
        return true;
    }



    /**
     * Elimina un alimento
     * @param souvenir a eliminar
     * @return eliminado o no
     */
    public boolean eliminarAlimento(String udi){
            Alimento alimentoRemove = obtenerAlimento(udi);
            alimentos.remove(alimentoRemove);
            return fileCsv.borrar(Ficheros.RUTA_ALIMENTOS_CSV, fileCsv.listaToCsv(alimentos));
    }
    /**
     * Elimina un aparato
     * @param souvenir a eliminar
     * @return eliminado o no
     */
    public boolean eliminarAparato(String udi){
            aparatos.remove(udi);
            
            return fileCsv.borrar(Ficheros.RUTA_APARATOS_CSV,fileCsv.listaToCsv(aparatos));
    }
    /**
     * Elimina un cuidadoPersonal
     * @param cuidadoPersonal a eliminar
     * @return eliminado o no
     */
    public boolean eliminarCuidadoPersonal(String udi){
        CuidadoPersonal cuidadoPersonalRemove = obtenerCuidadoPersonal(udi);
        cuidadoPersonales.remove(cuidadoPersonalRemove);
        return fileCsv.borrar(Ficheros.RUTA_CUIDADOSPERSONALES_CSV, fileCsv.listaToCsv(cuidadoPersonales));
    }
    /**
     * Elimina un souvenir
     * @param souvenir a eliminar
     * @return eliminado o no
     */
    public boolean eliminarSouvenir(String udi){
        Souvenir souvenirRemove = obtenerSouvenir(udi);
        souvenirs.remove(souvenirRemove);
        return fileCsv.borrar(Ficheros.RUTA_SOUVENIRS_CSV,fileCsv.listaToCsv(souvenirs));

    }


    public boolean modificarAlimento(String nombre, float precio, String fEntrada, String udi, String fCaducidad) throws ParseException{
        Alimento alimentoModificar= new Alimento(nombre, precio, fEntrada, udi, fCaducidad);
        alimentos.remove(alimentoModificar);
        fileCsv.borrar(Ficheros.RUTA_ALIMENTOS_CSV,fileCsv.listaToCsv(alimentos));
        return agregarAlimento(alimentoModificar);
    }

    public boolean modificarAparato(String nombre, float precio, String fEntrada, String udi){
        Aparato aparatoModificar= new Aparato(nombre, precio, fEntrada, udi);
        aparatos.remove(aparatoModificar.getUdi());
        fileCsv.borrar(Ficheros.RUTA_APARATOS_CSV,fileCsv.listaToCsv(aparatos));
        return agregarAparato(aparatoModificar);
    }

    public boolean modificarCuidadoPersonal(String nombre, float precio, String fEntrada, String udi, int popularidad){
        CuidadoPersonal cuidadoPersonalModificar= new CuidadoPersonal(nombre, precio, fEntrada, udi,popularidad);
        cuidadoPersonales.remove(cuidadoPersonalModificar);
        fileCsv.borrar(Ficheros.RUTA_CUIDADOSPERSONALES_CSV, fileCsv.listaToCsv(cuidadoPersonales));
        return agregarCuidadosPersonal(cuidadoPersonalModificar);
    }

    public boolean modificarSouvenir(String nombre, float precio, String fEntrada, String udi){
        Souvenir souvenirModificar= new Souvenir(nombre, precio, fEntrada, udi);
        souvenirs.remove(souvenirModificar);
        fileCsv.borrar(Ficheros.RUTA_CUIDADOSPERSONALES_CSV,fileCsv.listaToCsv(souvenirs));
        return agregarSouvenir(souvenirModificar);
    }




    /**
     * Suma todos los precios de los alimentos
     * @return precio total
     */
    public float precioAlimentos(){
        float resultado = 0;
        for (Alimento alimento : alimentos) {
            if (!alimento.productoCaducado()) {
                resultado += alimento.getPrecio();
            }
            
        }
        return resultado;
    }
    /**
     * Suma todos los precios de los aparatos
     * @return precio total
     */
    public float precioAparatos(){
        float resultado = 0;
        for (Aparato aparato : aparatos.values()) {
            resultado += aparato.getPrecio();
        }
        return resultado;
    }
    /**
     * Suma todos los precios de los cuidados personales
     * @return precio total
     */
    public float precioCuidadoPersonales(){
        float resultado = 0;
        for (CuidadoPersonal cuidadoPersonal : cuidadoPersonales) {
            resultado += cuidadoPersonal.getPrecio();
        }
        return resultado;
    }
    /**
     * Suma todos los precios de los souvenirs
     * @return precio total
     */
    public float precioSouvenirs(){
        float resultado = 0;
        for (Souvenir souvenir : souvenirs) {
            resultado += souvenir.getPrecio();
        }
        return resultado;
    }
    /**
     * Devuelve el precio de todos los productos
     * @return precio total
     */
    public float precioProductos(){
        float resultado = 0;
        for (Producto producto : productos) {
            resultado+=producto.getPrecio();
        }
        return resultado;
    }



    /**
     * Suma todos las ganancias de los alimentos
     * @return ganancia total
     */
    public float ganaciaAlimentos(){
        float resultado = 0;
        for (Alimento alimento : alimentos) {
            if (!alimento.productoCaducado()) {
                resultado += alimento.precioMaximo()-alimento.getPrecio();
            }
            
        }
        return resultado;
    }
    /**
     * Suma todos las ganacia de los aparatos
     * @return ganacia total
     */
    public float gananciaAparatos(){
        float resultado = 0;
        for (Aparato aparato : aparatos.values()) {
            resultado += aparato.precioMaximo()-aparato.getPrecio();
        }
        return resultado;
    }
    /**
     * Suma todos las ganancias de los cuidados personales
     * @return precio total
     */
    public float gananciaCuidadoPersonales(){
        float resultado = 0;
        for (CuidadoPersonal cuidadoPersonal : cuidadoPersonales) {
            resultado += cuidadoPersonal.precioMaximo()-cuidadoPersonal.getPrecio();
        }
        return resultado;
    }
    /**
     * Suma todos las ganancias de los souvenirs
     * @return precio total
     */
    public float ganaciaSouvenirs(){
        float resultado = 0;
        for (Souvenir souvenir : souvenirs) {
            resultado += souvenir.precioMaximo()-souvenir.getPrecio();
        }
        return resultado;
    }
    /**
     * Devuelve la ganancia de todos los productos
     * @return precio total
     */
    public float ganaciaProductos(){
        float resultado = 0;
        for (Producto producto : productos) {
            resultado+=producto.precioMaximo()-producto.getPrecio();
        }
        return resultado;
    }

    /**
     * Suma todos las cantidades de los alimentos
     * @return ganancia total
     */
    public float cantidadAlimentos(){
        float resultado = 0;
        for (Alimento alimento : alimentos) {
            if (!alimento.productoCaducado()) {
                resultado += alimento.cantidadDisponible();
            }
            
        }
        return resultado;
    }
    /**
     * Suma todos las cantidades de los aparatos
     * @return ganacia total
     */
    public float cantidadAparatos(){
        float resultado = 0;
        for (Aparato aparato : aparatos.values()) {
            resultado += aparato.cantidadDisponible();
        }
        return resultado;
    }
    /**
     * Suma todos las ganancias de los cuidados personales
     * @return precio total
     */
    public float cantidadCuidadoPersonales(){
        float resultado = 0;
        for (CuidadoPersonal cuidadoPersonal : cuidadoPersonales) {
            resultado += cuidadoPersonal.cantidadDisponible();
        }
        return resultado;
    }
    /**
     * Suma todos las ganancias de los souvenirs
     * @return precio total
     */
    public float cantidadSouvenirs(){
        float resultado = 0;
        for (Souvenir souvenir : souvenirs) {
            resultado += souvenir.cantidadDisponible();
        }
        return resultado;
    }
    /**
     * Devuelve la cantidad de todos los productos
     * @return precio total
     */
    public float cantidadProductos(){
        
        return cantidadAlimentos() + cantidadAparatos() + cantidadCuidadoPersonales() + cantidadSouvenirs();
    }

    /**
     * Enseña todos los prodcutos recomendados
     * @return una hashset de los productos
     */
    public Set<CuidadoPersonal> productosRecomendados(){
        HashSet<CuidadoPersonal> productosRecomendados = new HashSet<>();
        for (CuidadoPersonal cuidadoPersonal : cuidadoPersonales) {
            if (cuidadoPersonal.recomendarProducto()) {
                productosRecomendados.add(cuidadoPersonal);
            }
        }
        return productosRecomendados;
    }

    public boolean venderAlimento(String udi){
        if (!obtenerAlimento(udi).productoCaducado()) {
            return eliminarAlimento(udi);
        }
        return true;
    }

    public List<Alimento> obtenerAlimentos()throws IOException,ParseException{
        List<Alimento> alimentosObtener = new ArrayList<>();
        for (Producto producto : fileCsv.leer(Ficheros.RUTA_ALIMENTOS_CSV,Ficheros.ALIMENTO)) {
                alimentosObtener.add((Alimento)producto);
        }
        return alimentosObtener;
    }
    public Map<String, Aparato> obtenerAparatos()throws IOException,ParseException{
        Map<String, Aparato> aparatosObtener = new HashMap<>();
        for (Producto producto : fileCsv.leer(Ficheros.RUTA_APARATOS_CSV,Ficheros.APARATO)) {
                aparatosObtener.put(producto.getUdi(),(Aparato)producto);
        }
        return aparatosObtener;
    }
    public Set<CuidadoPersonal> obtenerCuidadoPersonal()throws IOException,ParseException{
        Set<CuidadoPersonal> cuidadosPersonalesObtener = new HashSet<>();
        for (Producto producto : fileCsv.leer(Ficheros.RUTA_CUIDADOSPERSONALES_CSV,Ficheros.CUIDADO_PERSONAL)) {
                cuidadosPersonalesObtener.add((CuidadoPersonal)producto);
        }
        return cuidadosPersonalesObtener;
    }
    public Set<Souvenir> obtenerSouvenirs()throws IOException,ParseException{
        Set<Souvenir> souvenirsObtener = new HashSet<>();
        for (Producto producto : fileCsv.leer(Ficheros.RUTA_SOUVENIRS_CSV,Ficheros.SOUVENIR)) {
                souvenirsObtener.add((Souvenir)producto);
        }
        return souvenirsObtener;
    }
    public Set<Producto> obtenerProductos()throws ParseException,IOException{
        
        Set<Producto> productosObtener = new HashSet<>();
        productosObtener.addAll(fileCsv.leer(Ficheros.RUTA_ALIMENTOS_CSV,Ficheros.ALIMENTO));
        productosObtener.addAll(fileCsv.leer(Ficheros.RUTA_CUIDADOSPERSONALES_CSV,Ficheros.CUIDADO_PERSONAL));
        productosObtener.addAll(fileCsv.leer(Ficheros.RUTA_APARATOS_CSV,Ficheros.APARATO));
        productosObtener.addAll(fileCsv.leer(Ficheros.RUTA_SOUVENIRS_CSV,Ficheros.SOUVENIR));
        return productosObtener;
    }



    @Override
    public String toString() {
        return "{" +
            " alimentos='" + getAlimentos() + "'" +
            ", aparatos='" + getAparatos() + "'" +
            ", cuidadoPersonales='" + getCuidadoPersonales() + "'" +
            ", souvenirs='" + getSouvenirs() + "'" +
            "}";
    }

}

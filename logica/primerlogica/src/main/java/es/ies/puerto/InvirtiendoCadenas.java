package es.ies.puerto;

public class InvirtiendoCadenas {
    public String invertirCadena(String cadena){
        String resultado = "";
        for (int i = 1; i <= cadena.length(); i++) {
            resultado+=cadena.charAt(cadena.length()-i);
        }
        return resultado;
    }
}

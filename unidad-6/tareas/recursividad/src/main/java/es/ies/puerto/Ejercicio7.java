package es.ies.puerto;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio7 {
    public List<Integer> conteoRegresivo(int n){
        List<Integer> lista = new ArrayList<>();
        if (n<=0) {
            return lista;
        }
        lista.add(n);
        lista.addAll(conteoRegresivo(n-1));
        return lista;
    }
}

package es.ies.puerto;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {
    public List<Integer> cuentaRegresiva(int n){
        List<Integer> lista = new ArrayList<>();
        if (n<=0) {
            return lista;
        }
        lista.add(n);
        lista.addAll(cuentaRegresiva(n-1));
        return lista;
    }
}

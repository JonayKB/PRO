package es.ies.puerto;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {
    List<Integer> lista = new ArrayList<>();
    public List<Integer> cuentaRegresiva(int n){
        if (n<=0) {
            return lista;
        }
        lista.add(n);
        cuentaRegresiva(n-1);
        return lista;
    }
}

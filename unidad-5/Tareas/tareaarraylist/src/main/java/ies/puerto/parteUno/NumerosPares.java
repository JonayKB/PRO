package ies.puerto.parteUno;

import java.util.ArrayList;
/**
 * Crea un programa que declare e inicialice un ArrayList de enteros. Luego, agrega números pares del 1 al 10 a la lista.
 */
public class NumerosPares {
    static ArrayList<Integer> arrayList = new ArrayList<>();


    public ArrayList<Integer> llenarListaPares(){
        for (int i = 2; i <= 10; i++) {
            if (i%2==0) {
                arrayList.add(i);
            }
        }

        return arrayList;
    }
}
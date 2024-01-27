package ies.puerto.parteUno;

import java.util.ArrayList;

/**
 * Crea un programa que compare dos ArrayList de enteros y devuelva true si tienen al menos un elemento en común, de lo contrario, devuelve false. a la lista.
 */
public class CompararArrayList {

    public CompararArrayList(){}


    public boolean CompararArrayLists(ArrayList<Integer> arrayList1, ArrayList<Integer> arrayList2){
        for (Integer e : arrayList1) {
            for (Integer integer : arrayList2) {
                if (e == integer) {
                    return true;
                }
            }
        }
        return false;
    }
}

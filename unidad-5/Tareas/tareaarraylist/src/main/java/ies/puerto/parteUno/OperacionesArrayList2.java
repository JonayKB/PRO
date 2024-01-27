package ies.puerto.parteUno;
/**
 * Escribe un método en la clase OperacionesArrayList que reciba un ArrayList de números y devuelva una nueva lista con solo los números pares.
 */

import java.util.ArrayList;

public class OperacionesArrayList2 {
    private ArrayList<Integer> arrayList;

    public OperacionesArrayList2(){}
    public OperacionesArrayList2(ArrayList<Integer> arrayList){
        this.arrayList = arrayList;
    }

    public ArrayList<Integer> eliminarImpares(){
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i)%2!=0) {
                arrayList.remove(i);
            }
        }
        return arrayList;
    }
}

package ies.puerto.parteUno;

import java.util.ArrayList;
/**
 * Crea un programa que elimine los elementos duplicados de un ArrayList de cadenas y muestre la lista resultante.
 */
public class EliminarDuplicados {
    public ArrayList<String> eliminarDuplicados(ArrayList<String> arrayList){
        
        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = 0; j < arrayList.size(); j++) {
                if (arrayList.get(i)== arrayList.get(j) && i!=j) {
                    arrayList.remove(j);
                }
            }
        }

        return arrayList;
    }


}

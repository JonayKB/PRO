package es.ies.puerto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DiasDiferencia {
    public int obtenerDiasDiferencia(String fechaInicio, String fechaFinal){
        Date fechaInicioDate = new Date();
        Date fechaFinalDate = new Date();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        try {
            fechaInicioDate = format.parse(fechaInicio);
            fechaFinalDate = format.parse(fechaFinal);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return (int)Math.abs((fechaInicioDate.getTime()-fechaFinalDate.getTime())/(1000*60*60*24L));
    }
}

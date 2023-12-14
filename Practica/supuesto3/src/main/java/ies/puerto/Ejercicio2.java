package ies.puerto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ejercicio2 {
    static String nombre;
    static Date fechaNacimiento;
    static SimpleDateFormat format;

    public Ejercicio2(String nombre, String fechaNacimiento, String formato) throws ParseException{
        this.nombre = nombre;
        this.format = new SimpleDateFormat(formato);
        this.fechaNacimiento = this.format.parse(fechaNacimiento);

    }
    public static void main(String[] args) throws ParseException {
        
        Ejercicio2 ejercicio2 = new Ejercicio2("Roberto", "10/11/2000", "dd/MM/yyyy");
        System.out.println(informacion());
    }

    
    public static int calcularEdad(){
        Calendar fechaActual = Calendar.getInstance();
        Calendar fechaNacimientoCalendar = Calendar.getInstance();
        fechaNacimientoCalendar.setTime(fechaNacimiento);
        return (int)((fechaActual.getTimeInMillis() - fechaNacimientoCalendar.getTimeInMillis())/(1000*60*60*24*365L));
    }

    public static String calcularSigno(){
        String resultado = "";
        int dia = fechaNacimiento.getDate();
        int mes = fechaNacimiento.getMonth()+1;

        if((mes==12 && dia>=22)|(mes ==1 && dia<=19)){
            resultado = "Capricornio";
        }
        else if((mes==01 && dia>=20)|(mes ==02 && dia<=18)){
            resultado = "Acuario";
        }
        else if((mes==02 && dia>=19)|(mes ==3 && dia<=20)){
            resultado = "Piscis";
        }
        else if((mes==3 && dia>=21)|(mes ==4 && dia<=19)){
            resultado = "Aries";
        }
        else if((mes==4 && dia>=20)|(mes ==5 && dia<=20)){
            resultado = "Tauro";
        }
        else if((mes==5 && dia>=21)|(mes ==6 && dia<=20)){
            resultado = "Géminis";
        }
        else if((mes==6 && dia>=21)|(mes ==7 && dia<=22)){
            resultado = "Cáncer";
        }
        else if((mes==7 && dia>=23)|(mes ==8 && dia<=22)){
            resultado = "Leo";
        }
        else if((mes==8 && dia>=23)|(mes ==9 && dia<=22)){
            resultado = "Virgo";
        }
        else if((mes==9 && dia>=23)|(mes ==10 && dia<=22)){
            resultado = "Libra";
        }
        else if((mes==10 && dia>=23)|(mes ==11 && dia<=21)){
            resultado = "Escorpio";
        }
        else{
            resultado = "Sagitario";
        }
        return resultado;
        
    }

    public static String informacion(){
        String resultado="\nNombre: "+nombre+"\nFecha Nacimiento: "+format.format(fechaNacimiento)+"\nEdad: "+calcularEdad()+"\nSigno: "+calcularSigno();
        return resultado;
    }
}


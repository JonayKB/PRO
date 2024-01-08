package ies.puerto;

import java.util.Calendar;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Evento {
    private static String nombre;
    private static String fecha;
    private static String fechaMasMes;
    public Evento(){}
    /**
     * Constructor para añadir un mes
     * @param nombre del evento
     * @param fecha del eventot
     * @param añadirMes si añadirlo o no
     * @throws ParseException
     */
    public Evento(String nombre, String fecha, boolean añadirMes)throws ParseException{
        this.nombre = nombre;
        this.fecha=fecha;
        if (añadirMes) {
            this.fecha = añadirMes(convertirDate(fecha));
        }
        
    }
    /**
     * Constructor normal
     * @param nombre del evento
     * @param fecha del evento
     */
    public Evento(String nombre, String fecha){
        this.nombre = nombre;
        this.fecha = fecha;
    }
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return this.fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFechaMasMes() {
        return this.fechaMasMes;
    }

    public void setFechaMasMes(String fechaMasMes) {
        this.fechaMasMes = fechaMasMes;
    }


    public static void main(String[] args)throws ParseException {
        Evento evento = new Evento("Salchichas", "30/12/2023", true);
        System.out.println(evento.estaProximo(convertirDate(fecha)));
        Evento evento1 = new Evento("Esparragos", "14/12/2023");
        System.out.println(evento1.informacion());
        System.out.println(evento1.estaProximo(convertirDate(fecha)));
    }
    /**
     * Convierte fechas String a Date
     * @param fecha en string
     * @return en Date
     * @throws ParseException
     */
    public static Date convertirDate(String fecha)throws ParseException{
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaFinal;
        try {
            fechaFinal=format.parse(fecha);
        } catch (ParseException e) {
            throw new ParseException("Error de parse", 0);
        }
        return fechaFinal;
    }
    /**
     * Pasa la información necesaria a un String
     * @return el String
     * @throws ParseException
     */
    public static String informacion()throws ParseException{
        Date fechaFinal=convertirDate(fecha);
        String resultado = "\nNombre: "+nombre+"\nFecha: "+fecha;
        if(estaProximo(fechaFinal)){
            resultado+="\nES PROXIMO";
        }
        return resultado;
    }
    /**
     * Añade un mes a la fecha actual (no funciona bien por el .setTime)
     * @param fechaFinal a la cual le añadimos el mes
     * @return
     */
    public static String añadirMes(Date fechaFinal){
        
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fechaFinal);
        calendar.set(Calendar.MONTH, calendar.get(Calendar.MONTH+1));
        String resultado = calendar.get(Calendar.DAY_OF_MONTH)+"/"+(calendar.get(Calendar.MONTH)-1)+"/"+(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.YEAR));
        return resultado;
    }
    /**
     * Comprueba si una fecha esta cerca (no funciona bien, el metodo comparteTo solo da valores -1(antes), 0(ahora), +1(futuro))
     * @param fechaFinal de la que comprobar si esta próximo
     * @return si estta proximo o no
     */
    public static boolean estaProximo(Date fechaFinal){
        boolean resultado= false;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fechaFinal);
        Calendar calendarActual = Calendar.getInstance();

        if (calendar.compareTo(calendarActual)<=7&&calendar.compareTo(calendarActual)>0) {
            resultado = true;
        }
        return resultado;
    }






}

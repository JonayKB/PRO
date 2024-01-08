package ies.puerto;

public class Coche extends Motor {
    public Coche(){}
    public Coche(String color){
        super(color);
    }
    public Coche(String color, String matricula){
        super(color, matricula);
    }
    @Override
    public String toString(){
        String mensaje = "Yo soy un coche";
        //return"Yo soy un Coche y mi color es "+getColor();
        if (getColor() != null) {
            mensaje += ", mi color es "+getColor();
        }
        if (getMatricula() != null) {
            mensaje+= ", mi matrícula es "+getMatricula();
        }
        return mensaje;

    }
}

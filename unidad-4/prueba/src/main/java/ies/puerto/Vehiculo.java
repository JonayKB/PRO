package ies.puerto;
public class Vehiculo {
    private String color;

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    //Constructors
    public Vehiculo(){}
    public Vehiculo(String color){
        this.color = color;
    }

    public void mover(){
        System.out.println("El vehículo se está moviendo");
    }

    public void miColor(){
        System.out.println("Mi color es: "+color);
    }
    

    @Override
    public String toString() {
        return "{Vehiculo" +
            " color= " + color +"}";
    }
    
}

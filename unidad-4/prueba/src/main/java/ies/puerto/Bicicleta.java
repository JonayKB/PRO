package ies.puerto;

public class Bicicleta extends Vehiculo{
    private String talla;

    public Bicicleta(String talla, String color){
        super(color);
        this.talla=talla;
    }
    @Override
    public String toString(){
        return "Soy una bicicleta. Talla "+talla+" y color "+getColor();
    }
}

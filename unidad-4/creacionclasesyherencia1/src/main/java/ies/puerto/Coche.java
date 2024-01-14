package ies.puerto;

public class Coche extends Vehiculo {
    private int cilindrada;

    public Coche() {
    }

    /**
     * Consturctor de Coche
     * @param marca del vehiculo
     * @param modelo del vehiculo
     * @param precio del vehiculo
     * @param cilindrada del coche
     */
    public Coche(String marca, String modelo, double precio, int cilindrada){
        super(marca, modelo, precio);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return this.cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Soy un Coche:{Marca: "+getMarca()+"\nModelo: "+getModelo()+"\nPrecio: "+getPrecio()+"\nCilindrada: "+cilindrada+"}";
    }
}

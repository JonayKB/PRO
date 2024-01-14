package ies.puerto;

public class Motocicleta extends Vehiculo {
    private Conductor conductor;

    public Motocicleta() {
    }
    /**
     * Construcot de Motocicleta
     * @param marca del vehiculo
     * @param modelo del vehiculo
     * @param precio del vehiculo
     * @param conductor de la motocicoleta
     */
    public Motocicleta(String marca, String modelo, double precio,Conductor conductor){
        super(marca, modelo, precio);
        this.conductor = conductor;
    }

    public Conductor getConductor() {
        return this.conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    @Override
    public String toString() {
        return "Soy una Motocicleta:{Marca: "+getMarca()+"\nModelo: "+getModelo()+"\nPrecio: "+getPrecio()+"\nConductor: "+conductor.toString()+"}";
    }
}

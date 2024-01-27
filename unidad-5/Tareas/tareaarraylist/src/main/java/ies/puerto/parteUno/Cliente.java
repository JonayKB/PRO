package ies.puerto.parteUno;

public class Cliente {
    private int numero;
    private String nombre;
    private double saldo;

    public Cliente(){}
    public Cliente(int numero, String nombre, double saldo){
        this.nombre = nombre;
        this.numero = numero;
        this.saldo = saldo;
    }


    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    @Override
    public String toString() {
        
        return "Soy un cliente con numero "+numero+" nombre: "+nombre+" y un saldo de "+saldo;
    }

    public boolean equals(Cliente cliente) {

        if (cliente.numero == numero) {
            return true;
        }
        return false;
    }
}

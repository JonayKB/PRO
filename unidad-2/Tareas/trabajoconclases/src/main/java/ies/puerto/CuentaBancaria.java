package ies.puerto;
/**
 * Crea una clase CuentaBancaria con propiedades como numeroCuenta, nombreTitular y saldo. 
 * Agrega métodos para realizar depósitos, retiros, y mostrar el saldo actual.
 * @author JonayKB
 */
public class CuentaBancaria {
    private int numeroCuenta;
    private String nombreTitular;
    private double saldo;
    //Setters and Getters
    public int getNumeroCuenta() {
        return this.numeroCuenta;
    }

    public String getNombreTitular() {
        return this.nombreTitular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    /**
     * Constructor por defualt
     */
    public CuentaBancaria(){}

    /**
     * Constructor
     * @param numeroCuenta de la cuenta
     * @param nombreTitular de la cuenta
     * @param saldo de la cuenta
     */
    public CuentaBancaria(int numeroCuenta, String nombreTitular, double saldo){
        this.numeroCuenta = numeroCuenta;
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
    }

    /**
     * Función para retirar dinero de la cuenta 
     * @param aRetirar cantidad que se retira
     */
    public void retirarSaldo(double aRetirar){
        setSaldo(getSaldo()-aRetirar);
    }

    /**
     * Función para añadir dinero a la cuenta
     * @param aDepositar cantidad que se añade
     */
    public void depositarSaldo(double aDepositar){
        setSaldo(getSaldo()+aDepositar);
    }

    /**
     * Función para mostrar el saldo actual
     * @return el saldo
     */
    public double mostrarSaldo(){
        return getSaldo();
    }

    /**
     * Función para mostrar los detalles de la cuenta
     * @return los detalles
     */
    public String mostrarDetalles(){
        return "\nNúmero Cuenta: "+numeroCuenta+"\nNombre: "+nombreTitular+"\nSaldo: "+saldo;

    }

}

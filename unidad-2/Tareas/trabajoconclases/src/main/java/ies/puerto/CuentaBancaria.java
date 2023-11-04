package ies.puerto;

public class CuentaBancaria {
    private int numeroCuenta;
    private String nombreTitular;
    private double saldo;

    public int getNumeroCuenta() {
        return this.numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getNombreTitular() {
        return this.nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public CuentaBancaria(){}
    public CuentaBancaria(int numeroCuenta){
        this.numeroCuenta = numeroCuenta;
    }
    public CuentaBancaria(int numeroCuenta, String nombreTitular){
        this.numeroCuenta = numeroCuenta;
        this.nombreTitular = nombreTitular;
    }
    public CuentaBancaria(int numeroCuenta, String nombreTitular, double saldo){
        this.numeroCuenta = numeroCuenta;
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
    }

    public void retirarSaldo(double aRetirar){
        setSaldo(getSaldo()-aRetirar);
    }
    public void depositarSaldo(double aDepositar){
        setSaldo(getSaldo()+aDepositar);
    }
    public double mostrarSaldo(CuentaBancaria clase){
        return clase.getSaldo();
    }
    public String mostrarDetalles(){
        return "Número Cuenta: "+numeroCuenta+"\nNombre: "+nombreTitular+"\nSaldo: "+saldo;

    }

}

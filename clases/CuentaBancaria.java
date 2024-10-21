package clases;

import java.util.ArrayList;
import java.util.Random;

public class CuentaBancaria {
    private double saldo;
    private Persona titular;
    private int numeroCuenta;

    public static ArrayList<Integer> numeroCuentas = new ArrayList<>();
    public static int contador = 0;
    public static ArrayList<CuentaBancaria> listaCuentasBancarias = new ArrayList<CuentaBancaria>();

    public CuentaBancaria(Persona titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
        this.numeroCuenta = this.generarNroCuenta();
        CuentaBancaria.numeroCuentas.add(this.numeroCuenta);
        contador++;
        listaCuentasBancarias.add(this);
    }

    //Getters

    public String getTitular() {
        return titular.getNombre();
    }
    public double getSaldo() {
        return saldo;
    }
    public int getNumeroCuenta() {
    return numeroCuenta;
    }

    public static int getContador() {
        return contador;
    }
    public static ArrayList<CuentaBancaria> getListaCuentasBancarias() {
        return listaCuentasBancarias;
    }

    //SETTERs
    public void setTitular(Persona titular) {
        this.titular = titular;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    public static void setContador(int contador) {
        CuentaBancaria.contador = contador;
    }
    public static void setListaCuentasBancarias(ArrayList<CuentaBancaria> listaCuentasBancarias) {
        CuentaBancaria.listaCuentasBancarias = listaCuentasBancarias;
    }

    //metodos 
    public double depositar(double monto){
        this.saldo += monto;
        System.out.println("Nuevo saldo: " + this.saldo);
        return saldo;
    }

    public double retirar(double monto){
        if(monto > saldo){
            System.out.println("Saldo insuficiente");
        }else{
        this.saldo -= monto;
        }
        return saldo;
    }

	private int generarNroCuenta() {
		Random random = new Random();
		int numeroRandom = 100000 + random.nextInt(900000);
		if(CuentaBancaria.numeroCuentas.contains(numeroRandom)) {
			this.generarNroCuenta();
		}
		return numeroRandom;
	}

    public void despliegaInformacion(){
        System.out.println("La cuenta de: " + titular.getNombre() + ", cuyo numero es: " + getNumeroCuenta() + ". Cuenta con saldo: " +getSaldo() + "$");
    }

    public static void imprimeInformacionDeTodasLasCuentas(){
        System.out.println("Las cuentas actuales son: ");
        for (int i = 0; i < contador; i++){
            listaCuentasBancarias.get(i).despliegaInformacion();
        }
    }
}


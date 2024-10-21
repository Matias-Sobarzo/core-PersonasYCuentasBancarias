import clases.Persona;
import clases.CuentaBancaria;

public class Aplicacion {
    public static void main(String[] args) {
        
        Persona persona1 = new Persona("Ernesto", 37);
        Persona persona2 = new Persona("Luz", 26);
        Persona persona3 = new Persona("Grace", 28);

        persona1.despliegaInformacion();
        persona2.despliegaInformacion();
        persona3.despliegaInformacion();

        CuentaBancaria cuenta1 = new CuentaBancaria(persona1, 15000);
        CuentaBancaria cuenta2 = new CuentaBancaria(persona2, 150000);
        CuentaBancaria cuenta3 = new CuentaBancaria(persona3, 11000);

        cuenta1.despliegaInformacion();
        cuenta1.depositar(1000);
        cuenta1.retirar(1700);
        cuenta1.retirar(17000);
        cuenta1.despliegaInformacion();

        cuenta2.despliegaInformacion();
        cuenta2.depositar(100000);
        cuenta2.retirar(21000);
        cuenta2.retirar(170000);
        cuenta2.despliegaInformacion();

        cuenta3.despliegaInformacion();
        cuenta3.depositar(100000);
        cuenta3.retirar(170000);
        cuenta3.retirar(17050);
        cuenta3.despliegaInformacion();


        System.out.println(cuenta1.getTitular());
        CuentaBancaria.imprimeInformacionDeTodasLasCuentas();
    }
}

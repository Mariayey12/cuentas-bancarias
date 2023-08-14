import CuentaBanc.Cuenta;

import java.util.Scanner;

public class MainIngrear  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del titular: ");
        String nombreTitular = scanner.nextLine();

        System.out.print("Ingrese el saldo inicial: ");
        double saldoInicial = scanner.nextDouble();

        // Crear una cuenta
        Cuenta cuenta1 = new Cuenta(nombreTitular, saldoInicial);

        // Mostrar los datos de la cuenta
        System.out.println("Datos de la cuenta:");
        System.out.println(cuenta1.getDatosCuenta());

        // Realizar un ingreso
        System.out.print("Ingrese la cantidad a ingresar: ");
        double ingreso = scanner.nextDouble();
        cuenta1.setIngreso(ingreso);

        // Mostrar el saldo actual
        System.out.println("Saldo actual: " + cuenta1.getSaldoCuenta());

        // Realizar un retiro
        System.out.print("Ingrese la cantidad a retirar: ");
        double retiro = scanner.nextDouble();
        cuenta1.setRetiro(retiro);

        // Mostrar el saldo actual
        System.out.println("Saldo actual: " + cuenta1.getSaldoCuenta());

        // Cerrar el Scanner
        scanner.close();
    }
}


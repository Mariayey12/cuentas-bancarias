package CuentaBanc;

import java.util.Random;

public class Cuenta {
    private double saldoDeCuenta;
    private String nombreDelTitular;
    private long numeroDeCuenta;

    // Constructor de la clase
    public Cuenta(String nombreDelTitular, double saldoDeCuenta) {
        this.nombreDelTitular = nombreDelTitular;
        this.saldoDeCuenta = saldoDeCuenta;
        this.numeroDeCuenta = generarNumeroDeCuenta();
    }

    // Setter para hacer un ingreso
    public void setIngreso(double ingreso) {
        if (ingreso > 0) {
            saldoDeCuenta += ingreso;
            System.out.println("Se ha ingresado " + ingreso + " a la cuenta.");
        } else {
            System.out.println("El ingreso debe ser mayor que cero.");
        }
    }

    // Setter para hacer un retiro
    public void setRetiro(double retiro) {
        if (retiro > 0) {
            if (saldoDeCuenta >= retiro) {
                saldoDeCuenta -= retiro;
                System.out.println("Se ha retirado " + retiro + " de la cuenta.");
            } else {
                System.out.println("Fondos insuficientes.");
            }
        } else {
            System.out.println("El retiro debe ser mayor que cero.");
        }
    }

    // Getter para obtener el saldo de la cuenta
    public double getSaldoCuenta() {
        return saldoDeCuenta;
    }

    // Getter para obtener los datos generales de la cuenta
    public String getDatosCuenta() {
        return "Titular: " + nombreDelTitular +
                "\nNúmero de cuenta: " + numeroDeCuenta +
                "\nSaldo: " + saldoDeCuenta;
    }

    // Método privado para generar un número de cuenta aleatorio
    private long generarNumeroDeCuenta() {
        Random random = new Random();
        return Math.abs(random.nextLong()); // Para asegurarnos de que sea positivo
    }
}

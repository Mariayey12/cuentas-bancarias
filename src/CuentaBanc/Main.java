package CuentaBanc;



public class Main {
    public static void main(String[] args) {
        // Crear una cuenta
        Cuenta cuenta1 = new Cuenta("Juan Pérez", 1000.0);

        // Mostrar los datos de la cuenta
        System.out.println("Datos de la cuenta:");
        System.out.println(cuenta1.getDatosCuenta());

        // Realizar un ingreso
        cuenta1.setIngreso(500.0);

        // Mostrar el saldo actual
        System.out.println("Saldo actual: " + cuenta1.getSaldoCuenta());

        // Realizar un retiro
        cuenta1.setRetiro(300.0);

        // Mostrar el saldo actual
        System.out.println("Saldo actual: " + cuenta1.getSaldoCuenta());
    }



}




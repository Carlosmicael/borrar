import java.util.Scanner;

public class CajeroAutomatico {
    static double saldoCuenta;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el saldo inicial de la cuenta: ");
        saldoCuenta = sc.nextDouble();

        boolean continuar = true;
        while (continuar) {
            System.out.println("\nSelecciona una opción:");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Retirar efectivo");
            System.out.println("3. Depositar efectivo");
            System.out.println("4. Salir");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    consultarSaldo();
                    break;
                case 2:
                    System.out.print("Ingresa la cantidad a retirar: ");
                    double retiro = sc.nextDouble();
                    if (retirarEfectivo(retiro)) {
                        System.out.println("Retiro exitoso. Saldo actual: " + saldoCuenta);
                    } else {
                        System.out.println("Saldo insuficiente. Saldo actual: " + saldoCuenta);
                    }
                    break;
                case 3:
                    System.out.print("Ingresa la cantidad a depositar: ");
                    double deposito = sc.nextDouble();
                    depositarEfectivo(deposito);
                    System.out.println("Deposito exitoso. Saldo actual: " + saldoCuenta);
                    break;
                case 4:
                    continuar = false;
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor selecciona una opción válida.");
                    break;
            }
        }
    }

    public static void consultarSaldo() {
        System.out.println("Saldo actual: " + saldoCuenta);
    }

    public static boolean retirarEfectivo(double retiro) {
        if (retiro <= saldoCuenta) {
            saldoCuenta -= retiro;
            return true;
        } else {
            return false;
        }
    }

    public static void depositarEfectivo(double deposito) {
        saldoCuenta += deposito;
    }
}
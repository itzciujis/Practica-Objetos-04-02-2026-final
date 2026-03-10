import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Usuario usuario = new Usuario("Juan Pérez", "12345678A", 30);
        CuentaBancaria cuenta = new CuentaBancaria(usuario, 1000);

        int opcion;

        do {

            System.out.println("=== MENÚ BANCO ===");
            System.out.println("1. Ver información de la cuenta");
            System.out.println("2. Ingresar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    cuenta.verInformacionCuenta();
                    break;

                case 2:
                    System.out.print("Cantidad a ingresar: ");
                    double ingreso = sc.nextDouble();
                    cuenta.ingresarDinero(ingreso);
                    break;

                case 3:
                    System.out.print("Cantidad a retirar: ");
                    double retirada = sc.nextDouble();
                    cuenta.retirarDinero(retirada);
                    break;

                case 4:
                    System.out.println("Gracias por usar el banco.");
                    break;

                default:
                    System.out.println("Opción no válida.");

            }

        } while (opcion != 4);

        sc.close();
    }
}
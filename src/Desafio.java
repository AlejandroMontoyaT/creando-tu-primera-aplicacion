import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        //Datos del cliente
        String nombre = "Tony Stark";
        String tipoDeCuenta = "Corriente";
        double saldo = 1599.99;

        System.out.println("----------------------");
        System.out.println("\nNombre del Ciente: " + nombre);
        System.out.println("El tipo de  cuenta es: " + tipoDeCuenta);
        System.out.println("El saldo de la cuenta es: " + "$" + saldo);
        System.out.println("----------------------");

        //Datos del menu
        String menu = """
                ***Escribe el numero de la opcion deseada
                1. Consultar saldo
                2. Retirar dinero
                3. Depositar dinero
                4. Salir
                """;
        //habilitar la lectura de datos dede teclado
        Scanner teclado = new Scanner(System.in);
        // se crea una condicion con while para que el menu se repita
        int opcion = 0;
        while (opcion != 9) {
            System.out.println(menu);
            opcion = teclado.nextInt();

            //usar switch para las opciones del menu por que lo deja mas organizado
            switch (opcion) {
                case 1:
                    System.out.println("El saldo de la cuenta es: " + "$" + saldo);
                    break;
                case 2:
                    System.out.println("Cual es el valor que quieres retirar?");
                    double valorRetirar = teclado.nextDouble();
                    if (valorRetirar > saldo) {
                        System.out.println("No tienes suficiente dinero en la cuenta");
                    }else{
                        saldo -= valorRetirar;
                        System.out.println("El saldo actualizado: " + "$" + valorRetirar);
                    }
                    break;
                case 3:
                    System.out.println("Cual es valor que quieres depositar?");
                    double valorADepositar = teclado.nextDouble();
                    saldo += valorADepositar;
                    System.out.println("El saldo actualizado: " + "$" + saldo);
                    break;
                case 9:
                    System.out.println("Gracias por usar el cajero automatico");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }

        }
    }
}

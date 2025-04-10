package EjeExtras;

import java.util.Scanner;

public class ClaseScanner {
    public static void main(String[] args) {
        //objeto
        Scanner teclado = new Scanner(System.in);

        //variables
        String nombre;
        int edad;
        char sexo;
        double sueldo;

        //capturaDatos
        System.out.println("Captura tu nombre");
        nombre = teclado.nextLine();
        System.out.println("Captura tu edad");
        edad = teclado.nextInt();
        teclado.nextLine(); // Limpia el buffer
        System.out.println("Captura tu sexo");
        sexo = teclado.next().charAt(0);
        System.out.println("Captura tu sueldo");
        sueldo = teclado.nextDouble();

        // Salidas
        System.out.println("Tus Datos son");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Sexo: " + sexo);
        System.out.println("Saldo: " + sueldo);
    }
}
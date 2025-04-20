/*
* Crea un programa que simule un juego de adivinanzas. El programa debe generar un número aleatorio entre 0 y 100, y pedir al usuario que intente adivinar ese número en un máximo de 5 intentos. En cada intento, el programa debe informar si el número ingresado por el usuario es mayor o menor que el número generado.

Consejos:

Para generar un número aleatorio en Java: new Random().nextInt(100);

Utiliza el Scanner para obtener los datos del usuario.

Utiliza una variable para contar los intentos.

Utiliza un bucle para controlar los intentos.

Utiliza la instrucción ‘break;’ para salir del bucle.

¡Buena suerte!
* */

package DesafioA3;

import java.util.Scanner;
import java.util.Random;

public class JuegoAdivinacion {
    public static void main(String[] args) {
        // Crear una instancia de la clase Juego
        int intentos = 0;
        Scanner scanner = new Scanner(System.in);
        // Generar un número aleatorio entre 0 y 100
        int numAleatorio = new Random().nextInt(100);

        //CRear un bucle para controlar los intentos
        for (int i = 0; i < 5; i++) {
            intentos++;
            // Aquí irá el código para:
            // 1. Pedir al usuario un número
            System.out.println("Adivina que numero es, en un rango del 1 al 100");
            // 2. Comparar con el número aleatorio
            int numUsuario = scanner.nextInt();
            // 3. Mostrar pistas
            if (numUsuario < numAleatorio) {
                System.out.println("El número es mayor");
            } else if (numUsuario > numAleatorio) {
                System.out.println("El número es menor");
            } else {
                System.out.println("¡Felicidades! Adivinaste el número en " + intentos + " intentos.");

                // 4. Salir del bucle si acierta (usando break)
                break; // Salir del bucle si acierta
            }
            // Mensaje para el último intento
            if (i == 4 && numUsuario != numAleatorio) {
                System.out.println("Lo siento, has agotado tus 5 intentos. El número era " + numAleatorio);
            }
        }

        // Cerrar el scanner al finalizar
        scanner.close();
    }
}



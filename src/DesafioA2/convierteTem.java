/*
* Escribe un programa que convierta una temperatura en grados Celsius a Fahrenheit. Utiliza variables para representar los valores de las temperaturas e imprime en la consola el valor convertido de Celsius a Fahrenheit.

Consejo: La fórmula para convertir temperaturas de grados Celsius a Fahrenheit es: (temperatura * 1.8) + 32.
Después de terminar, probar y verificar que tu programa se haya ejecutado correctamente, crea una variable entera para mostrar la temperatura en Fahrenheit sin decimales. Recuerda que probablemente necesitarás realizar un casting de valores.
* */

package DesafioA2;

public class convierteTem {

    public static void main(String[] args) {
       //convierta una temperatura en grados Celsius a Fahrenheit
        // Paso 1: Definir la temperatura en Celsius
        double celsius = 25.0;

        // Paso 2: Realizar la conversión a Fahrenheit
        double fahrenheit = (celsius * 1.8) + 32;

        // Paso 3: Mostrar el resultado
        System.out.println("La temperatura de Grados C° a F° es: " + fahrenheit);
    }
}

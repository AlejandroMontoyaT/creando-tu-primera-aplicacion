//se necesita importar la libreria Scanner para leer datos desde teclado
import java.util.Scanner;

public class Lectura {
    public static void main(String[] args) {
                            //para leer los datos desde declado con Scanner
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el nombre de la pelicula favorita: ");
        //para leer desde teclado
        String Pelicula = teclado.nextLine();
        System.out.println("Escribe el año de lanzamiento: ");
        //se crea variable para que almacena el dato ingresado en teclado
        int fechaDeLanzamiento = teclado.nextInt();
        System.out.println("pro ultimo dinos que nota le das a esta pelicula: ");
        double nota = teclado.nextDouble();

        System.out.println("La pelicula es: " + Pelicula);
        System.out.println("La fecha de lanzamiento es: " + fechaDeLanzamiento);
        System.out.println("La nota de la pelicula es: " + nota);
    }
}

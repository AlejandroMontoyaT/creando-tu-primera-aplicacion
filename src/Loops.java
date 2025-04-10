import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double nota = 0;
        //variable de donde se almacena la nota
        double mediaEvaluaviones = 0;

        for (int i = 0; i < 3 ; i++) {
            System.out.println("Escribe la nota que le darias a la pelicula matrix: ");
            nota = teclado.nextDouble();

            //para almacenar la nota en un arreglo
            mediaEvaluaviones = mediaEvaluaviones + nota;
        }
        System.out.println("la media de las evaluaciones es: " + (mediaEvaluaviones / 3));
    }
}

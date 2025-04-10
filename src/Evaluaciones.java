import java.util.Scanner;

public class Evaluaciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double mediaEvaluaviones = 0;
        //esta variable es para que while sepa cuantos ciclos hacer
        double totalEvaluaciones = 0;
        //          diferente a -1
        while (nota != -1) {
            System.out.println("Escribe la nota que le darias a la pelicula matrix: ");
            nota = teclado.nextDouble();

            if (nota != -1) {
                //si la nota es diferente a -1
                //para almacenar la nota en un arreglo
                mediaEvaluaviones += nota;
                totalEvaluaciones++;
            }
            //para almacenar la nota en un arreglo
            //mediaEvaluaviones += nota;
            //totalEvaluaciones++;
        }
        System.out.println("la media de las evaluaciones es: " + mediaEvaluaviones / totalEvaluaciones);
    }
}

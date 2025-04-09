public class Main {

    public static void main(String[] args) {
        System.out.println("Bienvenido a Screen Match");
        System.out.println("Pelicula: Matrix");

       int fechaDeLanzamiento = 1999;
       boolean incruidoEnElPlan = true;
       double notaDeLaPelicula = 8.2;

       double media = (8.2 + 6.0 + 9.0) / 3;
        System.out.println("Media: " + media);

        String sinopsis = """
                Un hacker llamado Neo investiga sobre una misteriosa realidad llamada 
                Matrix y se une a un grupo de rebeldes que luchan contra las máquinas que dominan el mundo.
                La película explora temas de realidad virtual, control mental y la lucha por la libertad.""" + fechaDeLanzamiento;
        System.out.println("Sinopsis: " + sinopsis);

        //casteo o conversion de tipos
        int clasificacion = (int) (media / 2);
        System.out.println("Clasificacion: " + clasificacion);
    }
}
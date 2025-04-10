public class Decisiones {

    public static void main(String[] args) {
        int fechaDeLanzamiento = 1998;
        boolean incruidoEnElPlan = false;
        double notaDeLaPelicula = 8.2;
        //se crea una variable para la media del plan
        String tipoPlan = "plus";

        //sepregunta al usuario
        //si  condicion
        if     (fechaDeLanzamiento > 2022){
            //bloque del codigo va aqui a dentro
            System.out.println("La pelicula mas populares: ");
            //en caso contrario
        }   else{
            System.out.println("La pelicula Retro pero aun vale la pena ver por que es del año: " + fechaDeLanzamiento);
        }
        //operadores logicos
        //condicional si esta incluido en el plan
        //si  esta               o   condicional para saber del plan
     //    if  (incruidoEnElPlan   || tipoPlan.equals("plus") ){
        //operador condicional
        if  (incruidoEnElPlan && tipoPlan.equals("plus") ){
             System.out.println("Disfrute de la pelicula");
     //en caso contrario
        }else {
            System.out.println("No puede ver la pelicula para su plan contratado");
         }


    }
}

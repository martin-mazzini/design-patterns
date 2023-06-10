package observer.live2;



public class Client {



    // EN algun liugar, tenemos que tener toda la lista de suscriptores que tenemos.
    // El publisher, cuando cambie el estado, se va a encargar de notificar a los suscripoters
    // Estado y % de la tarea. Esta es la novedad que le vamos a psar los suscribers.
    // Los subscriber tienen que tener LA LOGICA PARA PROCESAR la novedad.

    public static void main(String[] args) {


        Tarea tarea = new Tarea();
        tarea.ejecutar();



    }





}

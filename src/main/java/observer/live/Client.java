package observer.live;

public class Client {






    // EN algun liugar, tenemos que tener toda la lista de suscriptores que tenemos.
    // El publisher, cuando cambie el estado, se va a encargar de notificar a los suscripoters
    // Estado y % de la tarea. Esta es la novedad que le vamos a psar los suscribers.
    // Los subscriber tienen que tener LA LOGICA PARA PROCESAR la novedad.

    public static void main(String[] args) {

        TareaPublisher tareaPublisher = new TareaPublisher();

        BdSubscriber bdSubscriber = new BdSubscriber();
        tareaPublisher.addSubscriber(bdSubscriber);
        LoggerSubscriber loggerSubscriber = new LoggerSubscriber();
        tareaPublisher.addSubscriber(loggerSubscriber);

        tareaPublisher.setStatus("INICIALIZANDO");

        tareaPublisher.setStatus("COMPLETADO");
        tareaPublisher.setStatus("ERROR");

        tareaPublisher.removeSubscriber(bdSubscriber);
        System.out.println("LUEGO DE REMOVER AL SUBSCRIBER DE LA BD");
        tareaPublisher.setStatus("COMPLETADO");




    }





}

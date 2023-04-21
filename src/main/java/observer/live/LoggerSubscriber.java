package observer.live;

public class LoggerSubscriber implements Suscriber {


    @Override
    public void handle(Tarea tarea) {
        if (tarea.getEstado().equals("ERROR")){
            System.out.println("Tarea con error " + tarea);
        }else{
            System.out.println("Me notificaron pero no me interesa");
        }

    }
}

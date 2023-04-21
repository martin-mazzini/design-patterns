package observer.live;

public class BdSubscriber implements Suscriber{



    @Override
    public void handle(Tarea tarea) {
        if (tarea.getEstado().equals("COMPLETADO")){
            System.out.println("GUARDANDO TAREA EN LA BASE DE DATOS" + tarea);
        }else{
            System.out.println("Me notificaron pero no me interesa");
        }
    }


}

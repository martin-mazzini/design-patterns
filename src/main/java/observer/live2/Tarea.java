package observer.live2;

import java.util.ArrayList;
import java.util.List;

public class Tarea  {
    private Integer porcentaje;
    private String estado;



    public Tarea() {
        this.porcentaje = 0;
        this.estado = "INICIALIZANDO";
    }

    public void ejecutar(){
        this.estado = "EJECUTANDO";
        for (int i = 0; i < 9; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.porcentaje = (i + 1) * 10;
        }
        this.estado = "FINALIZADA";
    }

}

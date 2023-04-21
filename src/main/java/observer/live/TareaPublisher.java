package observer.live;

import java.util.ArrayList;
import java.util.List;

public class TareaPublisher implements Publisher {


    private List<Suscriber> suscriberList = new ArrayList<>();
    private Tarea tarea = new Tarea(0, "INICIALIZANDO");


    @Override
    public void addSubscriber(Suscriber suscriber) {
        suscriberList.add(suscriber);
    }

    @Override
    public void removeSubscriber(Suscriber suscriber) {
        suscriberList.remove(suscriber);
    }

    @Override
    public void notifySubscriber() {
        for (Suscriber suscriber: suscriberList){
            suscriber.handle(tarea);
        }
    }

    public void setStatus(String status){
        tarea.setEstado(status);
        notifySubscriber();
    }
}

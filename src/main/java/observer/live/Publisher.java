package observer.live;

import java.util.concurrent.Flow;

public interface Publisher {

    public void addSubscriber(Suscriber suscriber);

    public void removeSubscriber(Suscriber suscriber);

    public void notifySubscriber();

}

package observer.task;

import observer.mine.Event;
import observer.mine.Observer;

public interface TaskPublisher {

    public void attach(TaskSubscriber observer);
    public void detach(Observer observer);
    public void notifyObservers(Task event);

}

package observer.task;

import observer.mine.Event;
import observer.mine.Observer;

public interface TaskSubscriber {

    public void update(Task event);


}

package observer.task;

import lombok.SneakyThrows;
import observer.mine.Event;
import observer.mine.Observer;

import java.util.ArrayList;
import java.util.List;

public class TaskPublisherImpl extends Thread implements TaskPublisher{

   List<TaskSubscriber> subscriberist;
   Task task;
    private Runnable runnable;

    public TaskPublisherImpl(List<TaskSubscriber> subscriberist, Task task) {
        this.subscriberist = subscriberist;
        this.task = task;
    }


    @Override
    public void attach(TaskSubscriber subscriber) {
        subscriberist.add(subscriber);
    }

    @Override
    public void detach(Observer observer) {

    }

    @Override
    public void notifyObservers(Task task) {
        for (int i = 0; i < subscriberist.size(); i++) {
            subscriberist.get(i).update(task);
        }
    }

    public void setTaskState(String state){
        task.setState(TaskState.valueOf(state));
        notifyObservers(this.task);
    }

    @SneakyThrows
    @Override
    public void run() {
        this.setTaskState("ESPERANDO");
        for (int i = 0; i < 3; i++) {
            Thread.sleep(1 * 1000);

        }
        this.setTaskState("COMPLETADA");
    }
}

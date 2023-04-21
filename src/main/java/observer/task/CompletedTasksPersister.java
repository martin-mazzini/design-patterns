package observer.task;

public class CompletedTasksPersister implements TaskSubscriber{



    @Override
    public void update(Task event) {

        System.out.println("Task completed: " + event.getState());
    }
}

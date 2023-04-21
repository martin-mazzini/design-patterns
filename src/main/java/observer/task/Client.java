package observer.task;

import java.util.ArrayList;

public class Client {

    public static void main(String[] args) {

        TaskPublisherImpl taskPublisher = new TaskPublisherImpl(new ArrayList<>(
        ), new Task());
        CompletedTasksPersister completedTasksPersister = new CompletedTasksPersister();

        taskPublisher.attach(completedTasksPersister);


        taskPublisher.run();

        try {
            taskPublisher.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



    }
}

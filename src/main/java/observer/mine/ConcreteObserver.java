package observer.mine;

public class ConcreteObserver implements Observer {

    private String id;

    public ConcreteObserver(String id) {
        this.id = id;
    }

    @Override
    public void update(Event event) {
        // Perform some action in response to the update.
        System.out.println("Observer " + id + " observing following event: " + event);
    }
}

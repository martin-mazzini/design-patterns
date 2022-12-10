package observer;

public class ConcreteObserver implements Observer {

    private int state;

    @Override
    public void update(Subject subject) {
        this.state = subject.getState();
        // Perform some action in response to the update.
    }
}

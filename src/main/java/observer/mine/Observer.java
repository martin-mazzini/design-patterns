package observer.mine;

// This is the observer interface, which defines a method for receiving
// notifications from the subject.
public interface Observer {
    public void update(Event event);
}

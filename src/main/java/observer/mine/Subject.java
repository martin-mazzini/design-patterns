package observer.mine;

// This is the subject interface, which defines methods for attaching and
// detaching observers, as well as a method for notifying observers of
// changes to the subject's state.
public interface Subject {
    public void attach(Observer observer);
    public void detach(Observer observer);
    public void notifyObservers(Event event);
}

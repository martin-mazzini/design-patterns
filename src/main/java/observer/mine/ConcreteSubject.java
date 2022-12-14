package observer.mine;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {
    private List<Observer> observers;
    private int state;

    public ConcreteSubject() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void attach(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers(Event event) {
        for (Observer observer : this.observers) {
            observer.update(event);
        }
    }

    // This method is called to change the state of the subject, which
    // will cause the observers to be notified.
    public void setState(int state) {
        this.state = state;
        this.notifyObservers(new Event("State change", "State was changed to " + state));
    }

    public int getState() {
        return this.state;
    }
}

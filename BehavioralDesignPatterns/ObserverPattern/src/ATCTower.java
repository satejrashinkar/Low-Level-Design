import java.util.ArrayList;
import java.util.List;

public class ATCTower implements ISubject {

    List<IObserver> observers = new ArrayList<>();

    @Override
    public void addObserver(IObserver observer) {
        System.out.println("Adding a observer in tower / Subscribed in tower");
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        System.out.println("Removing a observer in tower / Unsubscribed in tower");
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (IObserver observer : observers){
            // logic to notify all observers
            observer.proceed(this);
        }
    }
}

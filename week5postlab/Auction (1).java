package week5postlab;

import java.util.ArrayList;
import java.util.List;

public class Auction implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String item;
    public void setItem(String item) {
        this.item = item;
        notifyObservers("Item available: " + item);
    }

    public void startAuction() {
        notifyObservers("Auction started for item: " + item);
    }

    public void endAuction() {
        notifyObservers("Auction ended for item: " + item);
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}


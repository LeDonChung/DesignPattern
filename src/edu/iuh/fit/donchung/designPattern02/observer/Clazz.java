package edu.iuh.fit.donchung.designPattern02.observer;

import java.util.ArrayList;
import java.util.List;

public class Clazz implements Subject{
    private List<Observer> observers;

    public Clazz() {
        this.observers = new ArrayList<>();
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
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}

package edu.iuh.fit.donchung.designPattern02.observer;

public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObserver();
}

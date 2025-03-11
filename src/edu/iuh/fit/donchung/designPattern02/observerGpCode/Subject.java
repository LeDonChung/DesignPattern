package edu.iuh.fit.donchung.designPattern02.observerGpCode;

public interface Subject {

    void attach(Observer observer);

    void detach(Observer observer);

    void notifyAllObserver();
}

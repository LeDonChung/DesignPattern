package edu.iuh.fit.donchung.designPattern02.observer;

public class Run {
    public static void main(String[] args) {
        LopTruong lopTruong = new LopTruong("Nguyen Van A", "123");
        LopTruong lopPho = new LopTruong("Nguyen Van B", "124");

        Clazz clazz = new Clazz();
        clazz.attach(lopTruong);
        clazz.attach(lopPho);

        clazz.notifyObserver();
    }
}

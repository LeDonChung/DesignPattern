package edu.iuh.fit.donchung.designPattern02.observerGpCode;

public class Logger implements Observer {

    @Override
    public void update(User user) {
        System.out.println("Logger: " + user);
    }
}

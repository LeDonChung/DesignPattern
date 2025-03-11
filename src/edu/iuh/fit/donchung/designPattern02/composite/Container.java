package edu.iuh.fit.donchung.designPattern02.composite;

import java.util.List;

public class Container implements Component{
    private List<Component> components;

    public Container(List<Component> components) {
        this.components = components;
    }

    public Container() {
    }

    @Override
    public double totalPrice() {
        double total = 0;
        for (Component component : components) {
            total += component.totalPrice();
        }
        return total;
    }
}

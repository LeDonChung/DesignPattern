package edu.iuh.fit.donchung.designPattern02.observer;

public class LopPho implements Observer{
    private String name;
    private String id;

    public LopPho(String name, String id) {
        this.name = name;
        this.id = id;
    }


    @Override
    public void update() {
        System.out.println("Lớp phó " + name + " đã nhận được thông báo");
    }
}

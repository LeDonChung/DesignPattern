package edu.iuh.fit.donchung.designPattern02.observer;

public class LopTruong implements Observer{
    private String name;
    private String id;

    public LopTruong(String name, String id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public void update() {
        System.out.println("Lớp trưởng " + name + " đã nhận được thông báo");
    }
}

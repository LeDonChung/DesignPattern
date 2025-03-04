package edu.iuh.fit.donchung.designPattern01.state;


public class KeToanTruongState implements ChucVu{

    @Override
    public void handlerRequest() {
        System.out.println("Kế toán trưởng đang làm việc.");
    }
}

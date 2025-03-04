package edu.iuh.fit.donchung.designPattern01.state;


public class DoiTruongState implements ChucVu{

    @Override
    public void handlerRequest() {
        System.out.println("Đội trưởng đang làm việc.");
    }
}

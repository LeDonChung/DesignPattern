package edu.iuh.fit.donchung.designPattern01.state;


public class GiamDocState implements ChucVu{

    @Override
    public void handlerRequest() {
        System.out.println("Giám đốc đang làm việc.");
    }
}

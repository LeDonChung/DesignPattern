package edu.iuh.fit.donchung.designPattern01.state;


public class NhanVienXuongState implements ChucVu{

    @Override
    public void handlerRequest() {
        System.out.println("Nhân viên xưởng đang làm việc.");
    }
}

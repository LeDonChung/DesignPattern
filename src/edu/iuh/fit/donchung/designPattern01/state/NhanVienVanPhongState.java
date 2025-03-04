package edu.iuh.fit.donchung.designPattern01.state;


public class NhanVienVanPhongState implements ChucVu{

    @Override
    public void handlerRequest() {
        System.out.println("Nhân viên văn phòng đang làm việc.");
    }
}

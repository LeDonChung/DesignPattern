package edu.iuh.fit.donchung.designPattern01.straytegy;

public class DoiTruongNhanVien implements NhanVien{
    @Override
    public void handlerRequest() {
        System.out.println("Đội trưởng đang làm việc.");
    }
}

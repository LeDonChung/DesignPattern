package edu.iuh.fit.donchung.designPattern01.straytegy;

public class KeToanTruongNhanVien implements NhanVien{
    @Override
    public void handlerRequest() {
        System.out.println("Kế toán trưởng đang làm việc.");
    }
}

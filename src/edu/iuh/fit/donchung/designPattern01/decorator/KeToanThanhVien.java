package edu.iuh.fit.donchung.designPattern01.decorator;

public class KeToanThanhVien extends ThanhVienDecorator{
    public KeToanThanhVien(ThanhVienBasic thanhVien) {
        super(thanhVien);
    }

    @Override
    public void handleRequest() {
        thanhVien.handleRequest();
        System.out.println(" đang là là kế toán");
    }
}

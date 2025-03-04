package edu.iuh.fit.donchung.designPattern01.decorator;

public class DoiTruongThanhVien extends ThanhVienDecorator{
    public DoiTruongThanhVien(ThanhVienBasic thanhVien) {
        super(thanhVien);
    }

    @Override
    public void handleRequest() {
        thanhVien.handleRequest();
        System.out.println(" đang là là đối trưởng");
    }
}

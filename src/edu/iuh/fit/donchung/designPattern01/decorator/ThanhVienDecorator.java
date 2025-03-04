package edu.iuh.fit.donchung.designPattern01.decorator;

import edu.iuh.fit.donchung.designPattern01.state.ChucVu;

public class ThanhVienDecorator implements ThanhVien {
    protected ThanhVienBasic thanhVien;

    public ThanhVienDecorator(ThanhVienBasic thanhVien) {
        this.thanhVien = thanhVien;
    }

    @Override
    public void handleRequest() {
        this.thanhVien.handleRequest();
    }
}

package edu.iuh.fit.donchung.designPattern01.straytegy;

public class NhanVienContext {
    private NhanVien nhanVien;


    public NhanVienContext(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }



    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

    public void handlerRequest() {
        this.nhanVien.handlerRequest();
    }
}

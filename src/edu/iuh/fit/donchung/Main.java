package edu.iuh.fit.donchung;

import edu.iuh.fit.donchung.designPattern01.noDesignPattern.ChucVu;
import edu.iuh.fit.donchung.designPattern01.noDesignPattern.ThanhVien;

public class Main {
    public static void main(String[] args) {
        ThanhVien donChung = new ThanhVien(1L, "Đôn Chủng", ChucVu.DoiTruong);
        donChung.handlerRequest();

        ThanhVien thanhTuyen = new ThanhVien(1L, "Thanh Tuyền", ChucVu.GiamDoc);
        thanhTuyen.handlerRequest();
    }
}

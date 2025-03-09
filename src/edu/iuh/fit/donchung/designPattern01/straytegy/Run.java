package edu.iuh.fit.donchung.designPattern01.straytegy;

import edu.iuh.fit.donchung.designPattern01.state.ChucVu;
import edu.iuh.fit.donchung.designPattern01.state.GiamDocState;
import edu.iuh.fit.donchung.designPattern01.state.KeToanTruongState;

public class Run {
    public static void main(String[] args) {

        NhanVienContext nhanVienContext = new NhanVienContext(new DoiTruongNhanVien());
        nhanVienContext.handlerRequest();


        nhanVienContext.setNhanVien(new KeToanTruongNhanVien());
        nhanVienContext.handlerRequest();
    }
}

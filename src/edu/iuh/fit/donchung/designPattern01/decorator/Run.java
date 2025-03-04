package edu.iuh.fit.donchung.designPattern01.decorator;

public class Run {
    public static void main(String[] args) {
        ThanhVienBasic doiTruong = new ThanhVienBasic("Don Chung");

        DoiTruongThanhVien doiTruongThanhVien = new DoiTruongThanhVien(doiTruong);

        doiTruongThanhVien.handleRequest();


        ThanhVienBasic keToan = new ThanhVienBasic("Thanh Tuyen");
        KeToanThanhVien keToanThanhVien = new KeToanThanhVien(keToan);
        keToanThanhVien.handleRequest();


    }
}

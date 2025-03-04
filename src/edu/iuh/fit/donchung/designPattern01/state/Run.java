package edu.iuh.fit.donchung.designPattern01.state;

public class Run {
    public static void main(String[] args) {
        NhanVienContext nhanVienContext = new NhanVienContext();

        // Set GiamDocState
        ChucVu giamDoc = new GiamDocState();
        nhanVienContext.setChucVu(giamDoc);

        // Call handlerRequest
        nhanVienContext.handlerRequest();


        // Set TruongPhongState
        ChucVu keToan = new KeToanTruongState();
        nhanVienContext.setChucVu(keToan);

        // Call handlerRequest
        nhanVienContext.handlerRequest();
    }
}

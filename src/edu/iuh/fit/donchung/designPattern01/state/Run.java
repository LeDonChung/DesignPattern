package edu.iuh.fit.donchung.designPattern01.state;

public class Run {
    public static void main(String[] args) {
        ChucVuContext chucVuContext = new ChucVuContext();

        // Set GiamDocState
        ChucVu giamDoc = new GiamDocState();
        chucVuContext.setChucVu(giamDoc);

        // Call handlerRequest
        chucVuContext.handlerRequest();


        // Set TruongPhongState
        ChucVu keToan = new KeToanTruongState();
        chucVuContext.setChucVu(keToan);

        // Call handlerRequest
        chucVuContext.handlerRequest();
    }
}

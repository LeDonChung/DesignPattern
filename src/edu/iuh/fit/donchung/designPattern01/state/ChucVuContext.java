package edu.iuh.fit.donchung.designPattern01.state;

public class ChucVuContext implements ChucVu{
    private ChucVu chucVu;

    public ChucVu getChucVu() {
        return chucVu;
    }

    public void setChucVu(ChucVu chucVu) {
        this.chucVu = chucVu;
    }

    @Override
    public void handlerRequest() {
        this.chucVu.handlerRequest();
    }
}

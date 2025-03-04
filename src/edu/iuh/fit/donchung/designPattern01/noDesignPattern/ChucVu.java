package edu.iuh.fit.donchung.designPattern01.noDesignPattern;

public enum ChucVu {
    DoiTruong("Đội trưởng"),
    GiamDoc("Giám đốc"),
    NhanVienVanPhong("Nhân viên văn phòng"),
    NhanVienXuong("Nhân viên xưởng"),
    KeToanTruong("Kế toán trưởng");


    private final String value;

    private ChucVu(String value) {
        this.value = value;
    }


    @Override
    public String toString() {
        return value;
    }

}

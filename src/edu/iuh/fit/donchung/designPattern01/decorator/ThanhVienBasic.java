package edu.iuh.fit.donchung.designPattern01.decorator;

import edu.iuh.fit.donchung.designPattern01.state.ChucVu;

public class ThanhVienBasic implements ThanhVien {
    private final String fullName;
    public ThanhVienBasic(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public void handleRequest() {
        System.out.printf(fullName);
    }
}

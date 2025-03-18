package edu.iuh.fit.donchung.designPattern02.adapter;

public class Run {
    public static void main(String[] args) {
        // {hoTen: 'Don Chung', tuoi: 21, diaChi: 'HCMC'} -> <hoTen>Don Chung</hoTen> -> JSON request
        XMLTarget target = new ConvertAdapter();
        target.request("<hoTen>Don Chung</hoTen>");
    }
}

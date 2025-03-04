package edu.iuh.fit.donchung.designPattern01.noDesignPattern;

public class ThanhVien {
    private Long id;
    private String name;
    private ChucVu chucVu;

    public ThanhVien(Long id, String name, ChucVu chucVu) {
        this.id = id;
        this.name = name;
        this.chucVu = chucVu;
    }

    public ThanhVien() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ChucVu getChucVu() {
        return chucVu;
    }

    public void setChucVu(ChucVu chucVu) {
        this.chucVu = chucVu;
    }


    public void handlerRequest() {
        switch(this.chucVu) {
            case DoiTruong:
                System.out.println("Đội trưởng " + this.name + " đang xử lý yêu cầu");
                break;

            case GiamDoc:
                System.out.println("Giám đốc " + this.name + " đang xử lý yêu cầu");
                break;

            case NhanVienVanPhong:
                System.out.println("Nhân viên văn phòng " + this.name + " đang xử lý yêu cầu");
                break;

            case NhanVienXuong:
                System.out.println("Nhân viên xưởng " + this.name + " đang xử lý yêu cầu");
                break;

            case KeToanTruong:
                System.out.println("Kế toán trưởng " + this.name + " đang xử lý yêu cầu");
                break;

            default:
                System.out.println("Chức vụ không hợp lệ");
                break;
        }
    }

    @Override
    public String toString() {
        return "ThanhVien{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", chucVu=" + chucVu +
                '}';
    }
}

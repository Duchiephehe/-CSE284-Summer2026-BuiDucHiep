import java.util.Scanner;

public class HoaQuaXuatKhau extends HoaQua {
    private String quocGiaXuat;
    private Double thueXuatKhau;

    public String getQuocGiaXuat() {
        return quocGiaXuat;
    }

    public void setQuocGiaXuat(String qg) {
        this.quocGiaXuat = qg;
    }

    public Double getThueXuatKhau() {
        return thueXuatKhau;
    }

    public void setThueXuatKhau(Double thue) {
        this.thueXuatKhau = thue;
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập quốc gia xuất: ");
        this.quocGiaXuat = scanner.nextLine();
        
        System.out.print("Nhập thuế xuất khẩu: ");
        this.thueXuatKhau = scanner.nextDouble();
    }

    @Override
    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.println("Quốc gia xuất: " + this.quocGiaXuat);
        System.out.println("Thuế xuất khẩu: " + this.thueXuatKhau);
    }
}

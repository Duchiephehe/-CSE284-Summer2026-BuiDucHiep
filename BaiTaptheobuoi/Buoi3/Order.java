import java.util.Scanner;

public class Order {
    private String maDonHang;
    private String ngayTao;
    private Double tongTien;

    public String getMaDonHang() {
        return maDonHang;
    }

    public void setMaDonHang(String maDonHang) {
        this.maDonHang = maDonHang;
    }

    public String getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(String ngayTao) {
        this.ngayTao = ngayTao;
    }

    public Double getTongTien() {
        return tongTien;
    }

    public void setTongTien(Double tongTien) {
        this.tongTien = tongTien;
    }

    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã đơn hàng: ");
        this.maDonHang = scanner.nextLine();
        
        System.out.print("Nhập ngày tạo (dd/mm/yyyy): ");
        this.ngayTao = scanner.nextLine();
        
        System.out.print("Nhập tổng tiền: ");
        this.tongTien = scanner.nextDouble();
    }

    public void xuatThongTin() {
        System.out.println("Mã ĐH: " + this.maDonHang);
        System.out.println("Ngày tạo: " + this.ngayTao);
        System.out.println("Tổng tiền: " + this.tongTien);
    }
}

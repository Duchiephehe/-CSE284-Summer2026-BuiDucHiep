import java.util.Scanner;

public class Customer {
    private String maKhachHang;
    private String tenKhachHang;
    private String soDienThoai;

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã khách hàng: ");
        this.maKhachHang = scanner.nextLine();
        
        System.out.print("Nhập tên khách hàng: ");
        this.tenKhachHang = scanner.nextLine();
        
        System.out.print("Nhập số điện thoại: ");
        this.soDienThoai = scanner.nextLine();
    }

    public void xuatThongTin() {
        System.out.println("Mã KH: " + this.maKhachHang);
        System.out.println("Tên KH: " + this.tenKhachHang);
        System.out.println("SĐT: " + this.soDienThoai);
    }
}

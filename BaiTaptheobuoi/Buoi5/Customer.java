import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Customer implements IThongTin {
    private String maKhachHang;
    private String tenKhachHang;
    private String soDienThoai;
    
    // Quan hệ 1 - n: Một khách hàng có thể có nhiều đơn hàng
    private List<Order> danhSachDonHang;

    public Customer() {
        this.danhSachDonHang = new ArrayList<>();
    }

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

    public List<Order> getDanhSachDonHang() {
        return danhSachDonHang;
    }

    public void setDanhSachDonHang(List<Order> danhSachDonHang) {
        this.danhSachDonHang = danhSachDonHang;
    }

    public void themDonHang(Order order) {
        this.danhSachDonHang.add(order);
    }

    @Override
    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã khách hàng: ");
        this.maKhachHang = scanner.nextLine();
        
        System.out.print("Nhập tên khách hàng: ");
        this.tenKhachHang = scanner.nextLine();
        
        System.out.print("Nhập số điện thoại: ");
        this.soDienThoai = scanner.nextLine();
    }

    @Override
    public void xuatThongTin() {
        System.out.println("Mã KH: " + this.maKhachHang);
        System.out.println("Tên KH: " + this.tenKhachHang);
        System.out.println("SĐT: " + this.soDienThoai);
        System.out.println("Số lượng đơn hàng: " + this.danhSachDonHang.size());
    }
}

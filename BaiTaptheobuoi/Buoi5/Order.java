import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Order implements IThongTin {
    private String maDonHang;
    private String ngayTao;
    private Double tongTien;
    
    // Quan hệ 1 - n: Một đơn hàng có thể có nhiều loại hoa quả
    private List<Fruit> danhSachHoaQua;

    public Order() {
        this.danhSachHoaQua = new ArrayList<>();
    }

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

    public List<Fruit> getDanhSachHoaQua() {
        return danhSachHoaQua;
    }

    public void setDanhSachHoaQua(List<Fruit> danhSachHoaQua) {
        this.danhSachHoaQua = danhSachHoaQua;
    }

    public void themHoaQua(Fruit fruit) {
        this.danhSachHoaQua.add(fruit);
    }

    @Override
    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã đơn hàng: ");
        this.maDonHang = scanner.nextLine();
        
        System.out.print("Nhập ngày tạo (dd/mm/yyyy): ");
        this.ngayTao = scanner.nextLine();
        
        System.out.print("Nhập tổng tiền: ");
        this.tongTien = scanner.nextDouble();
    }

    @Override
    public void xuatThongTin() {
        System.out.println("Mã ĐH: " + this.maDonHang);
        System.out.println("Ngày tạo: " + this.ngayTao);
        System.out.println("Tổng tiền: " + this.tongTien);
        System.out.println("Số lượng các loại hoa quả: " + this.danhSachHoaQua.size());
    }
}

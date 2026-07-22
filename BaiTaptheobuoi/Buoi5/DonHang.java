import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DonHang implements INhapXuat {
    private String maDonHang;
    private String ngayTao;
    private Double tongTien;
    private List<HoaQua> danhSachHoaQua;

    public DonHang() {
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

    public List<HoaQua> getDanhSachHoaQua() {
        return danhSachHoaQua;
    }

    public void setDanhSachHoaQua(List<HoaQua> danhSachHoaQua) {
        this.danhSachHoaQua = danhSachHoaQua;
    }

    public void themHoaQua(HoaQua fruit) {
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

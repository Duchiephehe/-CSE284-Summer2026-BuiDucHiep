import java.util.Scanner;

public class HoaQua implements INhapXuat {
    private String maHoaQua;
    private String tenHoaQua;
    private Double giaBan;
    private Integer soLuong;

    public String getMaHoaQua() {
        return maHoaQua;
    }

    public void setMaHoaQua(String ma) {
        this.maHoaQua = ma;
    }

    public String getTenHoaQua() {
        return tenHoaQua;
    }

    public void setTenHoaQua(String ten) {
        this.tenHoaQua = ten;
    }

    public Double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(Double gia) {
        this.giaBan = gia;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer sl) {
        this.soLuong = sl;
    }

    @Override
    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã hoa quả: ");
        this.maHoaQua = scanner.nextLine();
        
        System.out.print("Nhập tên hoa quả: ");
        this.tenHoaQua = scanner.nextLine();
        
        System.out.print("Nhập giá bán: ");
        this.giaBan = scanner.nextDouble();
        
        System.out.print("Nhập số lượng: ");
        this.soLuong = scanner.nextInt();
    }

    @Override
    public void xuatThongTin() {
        System.out.println("Mã hoa quả: " + this.maHoaQua);
        System.out.println("Tên hoa quả: " + this.tenHoaQua);
        System.out.println("Giá bán: " + this.giaBan);
        System.out.println("Số lượng: " + this.soLuong);
    }
}

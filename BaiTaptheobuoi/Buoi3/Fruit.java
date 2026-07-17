import java.util.Scanner;

public class Fruit {
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

    public void xuatThongTin() {
        System.out.println("Mã hoa quả: " + this.maHoaQua);
        System.out.println("Tên hoa quả: " + this.tenHoaQua);
        System.out.println("Giá bán: " + this.giaBan);
        System.out.println("Số lượng: " + this.soLuong);
    }

    public static void main(String[] args) {
        System.out.println("=== CHƯƠNG TRÌNH QUẢN LÝ HOA QUẢ ===");
        Fruit fruit = new Fruit();
        
        System.out.println("\n--- Yêu cầu nhập thông tin ---");
        fruit.nhapThongTin();
        
        System.out.println("\n--- Thông tin đã nhập ---");
        fruit.xuatThongTin();
    }
}

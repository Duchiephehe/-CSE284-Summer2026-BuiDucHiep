import java.util.Scanner;

public class HoaQuaDiaPhuong extends HoaQua {
    private String vungMien;

    public String getVungMien() {
        return vungMien;
    }

    public void setVungMien(String vm) {
        this.vungMien = vm;
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vùng miền: ");
        this.vungMien = scanner.nextLine();
    }

    @Override
    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.println("Vùng miền: " + this.vungMien);
    }
}

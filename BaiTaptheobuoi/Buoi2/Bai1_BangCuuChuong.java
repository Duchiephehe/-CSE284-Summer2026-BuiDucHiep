public class Bai1_BangCuuChuong {
    public static void main(String[] args) {
        System.out.println("=== Bài 1: Bảng Cửu Chương (2 → 9) ===");
        for (int i = 2; i <= 9; i++) {
            System.out.println("--- Bảng " + i + " ---");
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d x %2d = %3d%n", i, j, i * j);
            }
        }
        System.out.println();
    }
}

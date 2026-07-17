public class Bai2_BinhPhuongLapPhuong {
    public static void main(String[] args) {
        System.out.println("=== Bài 2: Bình Phương và Lập Phương (1 → 10) ===");
        System.out.printf("%-5s %-12s %-12s%n", "n", "n^2 (BP)", "n^3 (LP)");
        System.out.println("-----------------------------");
        for (int n = 1; n <= 10; n++) {
            System.out.printf("%-5d %-12d %-12d%n", n, n * n, n * n * n);
        }
        System.out.println();
    }
}

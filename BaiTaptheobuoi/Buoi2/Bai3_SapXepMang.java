import java.util.Arrays;

public class Bai3_SapXepMang {
    public static void main(String[] args) {
        System.out.println("=== Bài 3: Sắp Xếp Mảng Tăng Dần ===");
        int[] mang = {42, 7, 95, 13, 68, 30, 55, 1, 88, 24};

        System.out.print("Mảng ban đầu: ");
        System.out.println(Arrays.toString(mang));

        for (int i = 0; i < mang.length - 1; i++) {
            for (int j = 0; j < mang.length - 1 - i; j++) {
                if (mang[j] > mang[j + 1]) {
                    int tam = mang[j];
                    mang[j] = mang[j + 1];
                    mang[j + 1] = tam;
                }
            }
        }

        System.out.print("Mảng sau sắp xếp (tăng dần): ");
        System.out.println(Arrays.toString(mang));
        System.out.println();
    }
}

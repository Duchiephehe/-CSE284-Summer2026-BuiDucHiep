import java.math.BigInteger;

public class Bai4_Fibonacci {
    public static void main(String[] args) {
        System.out.println("=== Bài 4: 90 Số Fibonacci Đầu Tiên ===");
        BigInteger a = BigInteger.ONE; 
        BigInteger b = BigInteger.ONE; 

        System.out.printf("F(%2d) = %s%n", 1, a);
        System.out.printf("F(%2d) = %s%n", 2, b);

        for (int i = 3; i <= 90; i++) {
            BigInteger c = a.add(b);
            System.out.printf("F(%2d) = %s%n", i, c);
            a = b;
            b = c;
        }
        System.out.println();
    }
}

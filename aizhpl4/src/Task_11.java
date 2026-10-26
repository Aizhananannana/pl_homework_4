import java.util.Scanner;

public class Task_11 {
    static long gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    static long lcm(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        return Math.abs((long) a / gcd(a, b) * b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("LCM = " + lcm(a, b));
    }
}
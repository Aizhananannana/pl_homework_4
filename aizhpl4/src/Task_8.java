import java.util.Scanner;

public class Task_8 {
    static String decimalToBinary(int n) {
        if (n == 0) {
            return "0";
        }
        String b = "";
        while (n > 0) {
            int remainder = n % 2;
            b = remainder + b;
            n = n / 2;
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Binary = " + decimalToBinary(n));
    }
}
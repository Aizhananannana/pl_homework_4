import java.util.Scanner;

public class Task_6 {
    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= n / i; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    static int primeCount(int a, int b) {
        int count = 0;

        for (int i = a; i <= b; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Prime Count = " + primeCount(a, b));
    }
}
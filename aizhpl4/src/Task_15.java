import java.util.Scanner;

public class Task_15 {
    static boolean isPalindrome(int n) {
        if (n < 0) {
            return false;
        }
        int original = n;
        int reversed = 0;
        while (n > 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n = n / 10;
        }
        return original == reversed;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (isPalindrome(n)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
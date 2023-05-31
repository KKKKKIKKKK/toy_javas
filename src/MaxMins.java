import java.util.Scanner;

public class MaxMins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("3 "); // 숫자 3 출력 
        int first = scanner.nextInt();

        System.out.print("7 "); // 숫자 7 출력 
        int second = scanner.nextInt();

        int max = Max(first, second);
        int min = Min(first, second);

        System.out.println("최댓값: " + max);
        System.out.println("최솟값: " + min);
    }

    public static int Max(int a, int b) {
        return Math.max(a, b);
    }

    public static int Min(int a, int b) {
        return Math.min(a, b);
    }
}
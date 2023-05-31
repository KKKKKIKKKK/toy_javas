import java.util.Scanner;

public class MaxMins { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("두개의 숫자를 입력하시오 :");
        int first = scanner.nextInt();
        int second = scanner.nextInt(); //숫자입력

 
        MaxMins maxMins = new MaxMins(); 
        int totalmax = Max(first, second);
        int totalmin = Min(first, second);
        
        System.out.println("최댓값: " + totalmax);
        System.out.println("최솟값: " + totalmin);
    }

     public static int Max(int first, int second) {// max 함수
        int end = 0;
        if (first > second) {
          end = first; 
        } else if (first < second) {
            end = second;
        } else {
            end = first;
        } return end;
    }

    public static int Min(int first, int second) { // min 함수
        int end = 0;
        if (first < second) {
          end = first; 
        } else if (first > second) {
            end = second;
        } else {
            end = first;
        } return end;
    }

    }

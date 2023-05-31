import java.util.Scanner;

public class MaxMins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("두개의 숫자를 입력하시오 :");
        int first = scanner.nextInt();
        int second = scanner.nextInt(); //숫자입력

 
        MaxMins maxMins = new MaxMins();  
        int maxresult = Max(first, second);
        int minresult = Min(first, second);
        
        System.out.println("최댓값: " +  maxresult);
        System.out.println("최솟값: " + minresult);
    }

     public static int Max(int first, int second) { // max 함수
        int maxresult = 0;
        if (first > second) {
            maxresult = first; 
        } else if (first < second) {
            maxresult = second;
        } else {
            maxresult = first;
        } return maxresult;
    }

    public static int Min(int first, int second) { // min 함수
        int minresult = 0;
        if (first < second) {
            minresult = first; 
        } else if (first > second) {
            minresult = second;
        } else {
            minresult = first;
        } return minresult;
    }

    }

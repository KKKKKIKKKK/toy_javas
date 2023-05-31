import java.util.Scanner;

public class MaxMins {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("두개의 숫자를 입력하시오 :");
            int first = scanner.nextInt();
            int second = scanner.nextInt(); //숫자입력

    
            MaxMins maxMins = new MaxMins();  //인스턴스 생성 
            int maxresult = Max(first, second);
            int minresult = Min(first, second); //최댓값 최소값 함수 값 넣는 int 변수 선언
            
            System.out.println("최댓값: " +  maxresult);
            System.out.println("최솟값: " + minresult);
        } catch (Exception e) {
            // TODO: handle exception
        }
      
    }

     public static int Max(int first, int second) { // max 함수
       int maxresult = 0; //max값 넣은 변수 선언
       try { //두개의 숫자 비교 if문사용 
            if (first > second) { //둘중 first가 클때
            maxresult = first;  //max값 first 
        } else  { //second가 클 때 
            maxresult = second; //max 값 first
         } 
    
        } catch (Exception e) {
            // TODO: handle exception
        }
        return maxresult;   
    }

    public static int Min(int first, int second) { // min 함수
        int minresult = 0; //min값 넣은 변수 선언
        try {
                if (first < second) {  //숫자 비교 
                minresult = first; //min 값 first
                } else{
                    minresult = second;
                } 

        } catch (Exception e) {
            // TODO: handle exception
        }
        return minresult;
  }

    }

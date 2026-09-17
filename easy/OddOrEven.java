import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int evenNum = 0;
        int oddNum = 0;
        
        // 입력받은 정수값 반복
        for(int i = 0; i < num; i++){

            // 정수 입력받기
            int value = sc.nextInt();

            // 짝수면 짝수 합 누적
            if(value % 2 == 0){
                evenNum += value;
            }

            // 홀수면 홀수 합 누적
            else{
                oddNum += value;
            }
        }
        sc.close();
        // 짝수 합이 크면 "짝수 합이 큼" 출력
        if (evenNum > oddNum){
            System.out.println("짝수 합이 큼");
        }

        // 홀수가 큰 경우 "홀수 합이 큼" 출력
        else if(oddNum > evenNum){
            System.out.println("홀수 합이 큼");
        }

        // 같은 경우 예외 출력
        else{
            System.out.println("같음");
        }
    }
    
}

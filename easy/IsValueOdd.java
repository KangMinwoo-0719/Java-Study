import java.util.Scanner;

public class IsValueOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;

        // 입력받은 정수 값 반복
        for(int i = 0; i < num; i++){
            // 정수 입력받기
            int value = sc.nextInt();

            // 홀수인 경우 카운트
            if(value % 2 != 0){
                count++;        
            }
        }

        // 홀수 개수 출력
        sc.close();
        System.out.println("홀수 개수: " + count);
    }
}

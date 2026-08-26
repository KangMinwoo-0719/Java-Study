import java.util.Scanner;

public class minimumValueOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = 0;
        
        // n값 반복
        for(int i = 0; i < n; i++){

            // 정수 입력받기
            int num = sc.nextInt();

            // 처음 입력값은 무조건 min
            if(i == 0){
                min = num;
            }

            // 현재 입력받은 정수가 이전 정수보다 작으면 새로 갱신
            if(num < min){
                min = num;
            }
        }

        // 최솟값 출력
        System.out.println("최솟값: " + min);
    }
}

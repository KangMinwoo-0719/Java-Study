import java.util.Scanner;

public class TotalOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int total = 0;
        // num 범위만큼 반복
        for(int i = 0; i < num; i++){

            // 정수 입력받기
            int value = sc.nextInt();

            // 입력받은 정수 누적
            total += value;

        }
        // 누적값 출력
        sc.close();
        System.out.println("합계: " + total);
        
    }
}

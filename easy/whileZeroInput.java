import java.util.Scanner;

public class whileZeroInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int sum = 0;
        
        // 0을 입력받기 전 까지 정수를 입력받아 합을 누적하기
        do{
            num = sc.nextInt();
            sum += num;
        }
        while (num != 0);

        // 누적 합계 출력하기
        System.out.println("합계: " + sum);

        sc.close();
    }
}

import java.util.Scanner;

public class sumOfSegment{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int total = 0;

        // a값부터 b값 범위만큼 반복
        for(int i = a; i <= b; i++){

            // 범위 안 값 누적하기
            total += i;
        }

        // 누적값 출력
        System.out.println("합계: " + total);
    }
    
}

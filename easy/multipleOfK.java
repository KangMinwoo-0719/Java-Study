import java.util.Scanner;

public class multipleOfK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int total = 0;

        // n값 범위만큼 반복
        for(int i = 0; i <= n; i++){
            // k의 배수인 경우에만 합 누적
            if(i % k == 0){
                total += i;
            }
        }

        // 누적값 출력
        System.out.printf("%d의 배수 합: %d", k, total);
    }
}

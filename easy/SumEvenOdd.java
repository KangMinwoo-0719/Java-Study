import java.util.Scanner;

public class SumEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int even = 0;
        int odd = 0;
        sc.close();

        // num 범위만큼 반복
        for(int i = 1; i <= num; i++){

            // 짝수 값 누적
            if(i % 2 == 0){
                even += i;
            }

            // 홀수 값 누적
            else{
                odd += i;
            }
        }

        // 홀수, 짝수 합 누적 출력
        System.out.println("홀수 합: " + odd);
        System.out.println("짝수 합: " + even);
    }
}

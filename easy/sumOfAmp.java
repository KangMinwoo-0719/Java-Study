import java.util.Scanner;

public class sumOfAmp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        int total = 0;

        // num 범위 반복
        for(int i = 1; i <= num; i++){

            // num의 약수인 경우 합 누적
            if(num % i == 0){
                total += i;
            }
        }

        // 약수 누적 합 출력
        System.out.println("약수 합: " + total);
    }
}

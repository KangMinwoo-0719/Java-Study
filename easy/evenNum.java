import java.util.Scanner;

public class evenNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int divideCount = 0;
        sc.close();

        // num값 범위 반복
        for(int i = 1; i <= num; i++){

            // i로 나누어 떨어지면 약수 개수 카운트
            if(num % i == 0){
                divideCount ++;
            }
        }

        // 약수 개수 출력
        System.out.println("약수 개수: " + divideCount);
    }
}

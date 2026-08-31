import java.util.Scanner;

public class OneOverMinimum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int minimum = num;

        // num - 1 ~ 2 범위까지 순회
        for(int result = num; result > 1; result--){

            // 현재 수가 가장 작은 약수인 경우 갱신
            if(num % result == 0 && result < minimum){
                minimum = result;
            }
        }
        // 최소 진약수 출력
        System.out.println("최소 진약수: " + minimum);
    }
}

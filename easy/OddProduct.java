import java.util.Scanner;

public class OddProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        long total = 1;

        // 1 ~ num 범위 사이 2씩 증가하며 반복(홀수)
        for(int i = 1; i <= num; i += 2){

            // 현재 수를 total에 누적하여 곱하기
            total *= i;
        }

        // 누적 홀수 곱 출력
        sc.close();
        System.out.println("홀수 곱: " + total);
    }
}

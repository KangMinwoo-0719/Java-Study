import java.util.Scanner;

public class IsPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int positive = 0;
        int negative = 0;
        
        // 입력받은 정수 범위 반복
        for(int i=0; i<num; i++){

            // 정수 입력받기
            int value = sc.nextInt();

            // 양수(0 초과)인 경우 양수 카운트 1
            if(value > 0){
                positive++;
            }

            // 음수(0 미만)인 경우 음수 카운트 1
            else if(value < 0){
                negative++;
            }
        }
        
        sc.close();

        // 양수, 음수 개수 출력
        System.out.println("양수: " + positive);
        System.out.println("음수: " + negative);
    }
}

import java.util.Scanner;

public class WhilePositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        
        // 양수(0 초과)를 입력받기 전 까지 정수를 입력받기
        do{
            x = sc.nextInt();
            
        }while(x <= 0);

        // 양수인 경우 입력값 출력하기
        sc.close();
        System.out.println("입력값: " + x);
    }
}

import java.util.Scanner;

public class isAdault {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        
        // 나이가 18세 이상이면 성인
        if(age >= 18) {
            System.out.println("성인입니다");
        }

        // 아닌 경우 pass
    }
}

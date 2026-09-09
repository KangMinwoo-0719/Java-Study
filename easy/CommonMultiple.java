import java.util.Scanner;

public class CommonMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        int count = 0;

        // num 범위 반복
        for(int i = 1; i <= num; i++){

            // 5와 3의 공배수인 경우 카운트
            if(i % 5 == 0 && i % 3 == 0){
                count++;
            }
        }

        // 공배수 개수 출력
        System.out.println("공배수 개수: " + count);
    }
    
}

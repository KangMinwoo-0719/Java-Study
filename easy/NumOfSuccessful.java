import java.util.Scanner;

public class NumOfSuccessful {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;

        // num 정수 범위만큼 반복
        for(int i = 0; i < num; i++){

            // 정수 입력받기
            int score = sc.nextInt();

            // 60점 이상인 경우 count + 1
            if(score >= 60){
                count++;
            }
        }
        
        // 총 합격자 수 출력
        sc.close();
        System.out.println("합격자 수: " + count);

    }
}

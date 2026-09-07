import java.util.Scanner;

public class SectionValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int small = sc.nextInt();
        int big = sc.nextInt();
        int count = 0;

        // num값 범위 반복
        for(int i = 0; i < num; i++){

            // 정수 입력받기
            int value = sc.nextInt();

            // small <= value <= big 범위라면 카운트 + 1
            if(small <= value && value <= big){
                count++;
            }
        }

        // 구간 안의 정수 개수 출력
        System.out.println("구간 내 개수: " + count);
        
    }
}

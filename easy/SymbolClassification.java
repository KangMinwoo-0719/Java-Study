import java.util.Scanner;

public class SymbolClassification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        
        // 양수인 경우 "양수" 출력
        if(num > 0){
            System.out.println("양수");
        }

        // 음수인 경우 "음수" 출력
        else if(num < 0){
            System.out.println("음수");
        }

        // 0인 경우 "영" 출력
        else{
            System.out.println("영");
        }
    }
}

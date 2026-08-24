public class totalSum {
    public static void main(String[] args) {
        int total = 0;
        int k = 1;
        // 1부터 시작하여 100을 초과할 때 까지 반복
        while(true){
            total += k;
            if(total > 100){
                break;
            }
            k += 1;
        }
        // 누적 합, 100을 넘는 최초의 숫자 출력
        System.out.println("1 + 2 + ... + k 가 100을 넘는 최초의 k = " + k);
        System.out.println("(그때의 합 = " + total + ")");
        
    }
}
package infJava_A_Start.A_4_Loop;

// while 2 누적합계
public class While2_2 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        sum = sum + i;
        System.out.println("i="+i+" sum="+sum);
        i++;

        sum = sum + i;
        System.out.println("i="+i+" sum="+sum);
        i++;

        sum = sum + i;
        System.out.println("i="+i+" sum="+sum);
        // 좋은 코드인지 아닌지는 변경사항이 발행했을 때 알 수있다.
        // 변경사항이 발생했을 때 변경해야 하는 부분이 적을수록 좋은코드이다.

        // 기존: i부터 하나씩 증가하는 수를 3번까지 더하기 (i ~ i+2)
        // NEW : i부터 하나씩 증가하는 수를 endNum(마지막 수)까지 더해라 (i ~ endNum 더하기)


    }
}

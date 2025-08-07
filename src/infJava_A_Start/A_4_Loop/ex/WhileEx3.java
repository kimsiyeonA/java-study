package infJava_A_Start.A_4_Loop.ex;

// 누적 합 계산 - while 문 버전

// 반복문을 사용하여 1부터 max 까지의 합을 계산하고 출력하는 프로그램을 작성해보세요
// 이때, sum 이라는 변수를 사용하여 누적합을 표현하고,
// i라는 변수를 사용하여 카운트 (1부터 max 까지 중가하는 변수)를 수행해야 합니다.

public class WhileEx3 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        int max = 100;

        while(i <= max){
            sum += i;
            // System.out.println("num = "+num+" sum = "+sum);
            i++;
        }
        System.out.println("max ="+max+" sum = "+sum);

        System.out.println();

        // 강사 풀이
        int max2 = 100;
        int sum2 = 0;
        int i2 = 1;
        while(i2 <= max2){
            sum2 += i2;
            i2++;
        }
        System.out.println("sum2 = " + sum2);

    }
}

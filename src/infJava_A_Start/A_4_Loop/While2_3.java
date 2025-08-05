package infJava_A_Start.A_4_Loop;

// while 2 누적합계
public class While2_3 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        int endNum = 100;

        while (i <= endNum) {
            sum = sum + i;
            System.out.println("i=" + i + " sum=" + sum);
            i++;
        }

        // while 문을 사용하면 원하는 횟수만큼 같은 코드를 반복실행할 수 있다.
        // while 문에서 i <= endNum 조건을 통해 i가 endNum 이 될때까지 코드블럭을 실행한다.
        // i가 endNum 보다 크면 while 문을 종료한다.

        // 실행 코드 분석
        // sum(0), i(1), endNum(3)
        // 루프 1
        // while (i(1) <= endNum(3)) -> true
        // sum(0)+i(1) -> sum(1)i(1)++ -> i(2)
        // 루프 2
        // while (i(2) <= endNum(3)) -> true
        // sum(1)+i(2) -> sum(3)
        // i(2)++ -> i(3)
        // 루프 3
        // while (i(3) <= endNum(3)) -> true
        // sum(3)+i(3) -> sum(6)
        // i(3)++ -> i(4)
        // 루프 4
        // while (i(4) <= endNum(3)) -> false

    }
}

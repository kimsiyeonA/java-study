package infJava1_1.A_4_Loop;

// for 문

public class For2 {
    public static void main(String[] args) {
        int sum = 0;
        int endNum = 3;

        for(int i = 1; i <= endNum; i++){
            sum += i;
            System.out.println("i="+i+" sum="+sum);
        }

        // i가 카운터 변수, 증가하면서 반복 횟수가 올라가고 i를 통해서 계속 반복할지 아니면 빠져나갈지 판단한다.
        // 변수 선언, 값증가, 조건식에 활용까지 해서 구조를 활용해서 처리한다.
        // 루프 횟수와 관련된 코드와 나머지 코드를 구분할 수 있다.

        // while 문은 변수 i 선언과 증가부분이 코드에 분산되어 있다.

    }
}

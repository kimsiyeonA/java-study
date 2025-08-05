package infJava_A_Start.A_4_Loop;

// Continue
// 반복문에서 사용할 수 있는 키워드
// 반복문의 나무지 부분을 건너뛰고 다음 반복으로 진행하는데 사용한다.
// while, do-while, for 와 같은 모든 반복문에서 사용할 수 있다.

public class Continue1 {
    public static void main(String[] args) {
        // Continue
        // while (조건식){
        //      코드1;
        //      continue; // 즉시 조건식으로 이동한다.
        //      코드2;
        // }
        // 코드2가 실행되지 않고 다시 조건식으로 이동하고,
        // 조건식이 참이면 while문을 실행한다.

        // 1~5까지 출력하는데 3은 건너뛰고 출력하기
        int i = 1;

        while(i<=5){
            if(i==3){
                i++; // 없으면 i가 2에 멈춰져서 무한반복 됨
                continue; // 3일때 출력이 안되고 조건식으로 돌아감
            }
            System.out.println("i = " + i);
            i++;
        }





    }
}

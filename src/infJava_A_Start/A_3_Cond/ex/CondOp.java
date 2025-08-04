package infJava_A_Start.A_3_Cond.ex;

// 문제 : "더 큰 숫자 찾기"
// 두 개의 정수 변수 a와 b를 가지고 있다.
// a의 값은 10이고, b의 값은 20이다.
// 삼항연산자를 사용하여 두 숫자 중 더 큰 숫자를 출력하는 코드 작성

// 출력 예시
// "더 큰 숫자는 20 입니다"

public class CondOp {
    public static void main(String[] args) {
        int a = 10, b = 20;

        int big = (a > b) ? a : b ;
        System.out.println("더 큰 숫자는 " + big + "입니다.");

        /* 강사 풀이 */
        int max = (a > b) ? a : b ;
        System.out.println("더 큰 숫자는 " + max + "입니다.");
    }
}

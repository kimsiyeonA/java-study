package infJava1_1.A_3_Cond.ex;

// 문제 : "홀수 짝수 찾기"
// 정수 x가 주어지면 x가 짝수이면 "짝수"를,
// x가 홀수이면 "홀수"를 출력하는 프로그램

// 출력 예시
// x: 2
// 출력: x = 2, 짝수
// x: 3
// 출력: x = 3, 홀수

public class EvenOdd {
    public static void main(String[] args) {
        int x = 4;
        
        if (x % 2 == 0){
            System.out.println("x = " + x + ", 짝수");
        }else{
            System.out.println("x = " + x + ", 홀수");
        }

        /* 강사 풀이 */
        String result = (x % 2 == 0) ? "짝수" : "홀수" ;
        System.out.println("x = " + x + ", " + result);
    }
}

package awsJava.javaBasic.exam;
// 문제 : 실행되는 출력문에는 참 그렇지 않으면 거짓 이라고 적어주세요.

public class A009_1_if {
    public static void main(String[] args) {
        if ( true ) {
            System.out.println("참");
        }

        if ( false ) {
            System.out.println("거짓");
        }

        int a = 10; // 오직 정수만 넣을 수 있는 a라는 변수에 10이라는 값을 넣겠다.

        // `==` => 같다.
        if ( a == 10 ) {
            System.out.println("참");
        }

        // `!=` => 같지 않다.
        if ( a != 10 ) {
            System.out.println("거짓");
        }

        if ( a > 10 ) {
            System.out.println("거짓");
        }

        if ( a >= 10 ) {
            System.out.println("참");
        }

        int b = 10;

        if ( a == b ) {
            System.out.println("참");
        }

        // boolean c => c 에는 오직 true/false 만 담을 수 있다.
        boolean c = a != b;
        // 10!=10 / false
        // 오직 논리만 담을 수 있는 c 라는 번수에다가 false라는 값을 넣겠다.

        if ( c ) {
            System.out.println("거짓");
        }

        if ( c == false ) {
            System.out.println("참");
        }

        // `!` => 반전
        if ( !c ) {
            System.out.println("참");
        }

        // `!` => 반전
        if ( !(!c) ) {
            System.out.println("거짓");
        }

        boolean d = true;

        if ( c != d ) {
            System.out.println("참");
        }

        if ( 20 > 2 && 10 > 3 && true != false && 10 != 10 ) {
            System.out.println("거짓");
        }

        if ( 10 != 10 || 10 < 2 ) {
            System.out.println("거짓");
        }
    }
}

/* 단축 평가
* 10 != 10 && 20 == 20
* f && 20 == 20 => f가 나오면 어차피 다 f이기 때문에 더이상 판단하지 않음
*
* 10 == 10 || 20 != 20
* t || 20 != 20 => t가 나오면 어차피 다 t이기 때문에 더이상 판단하지 않음
*
*/


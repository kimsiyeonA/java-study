package infJava_A_Start.A_2_Operator;

// 산술 연산자 - 산술 연산자는 주로 숫자를 계산하는 데 사용
/*  + (더하기)
    - (빼기)
    * (곱하기)
    / (나누기)
    % (나머지) */
public class Operator1 {
    public static void main(String[] args) {
        // 변수 초기화
        int a = 5;
        int b = 2;

        // 덧셈
        int sum = a + b;
        System.out.println("a + b = "+sum) ; // 출력 a + b = 7,문자+숫자 > 문자열 그대로 나온뒤 숫자가 붙음

        // 뺄셈
        int diff = a - b;
        System.out.println("a - b = "+diff) ; // 출력 a - b = 3

        // 곱셈
        int multi = a * b;
        System.out.println("a * b = "+multi) ; // 출력 a * b = 10

        // 나눗셈
        int div = a / b;
        System.out.println("a / b = "+div) ; // 출력 a / b = 2 (2.5 > 정수형으로 나오기 때문에 소수점을 버림)
        // 같은 int 형끼리 계산하면 계산 결과도 같은 int 형을 사용한다. int 형은 정수이기 때문에 소수점 이하를 포함할 수 없다.
        // 0으로 나누기 안됨
        // 10 / 0 과 같이 숫자는 0으로 나눌 수 없다. (수학에서 허용하지 않음)
        // 방금 예제에서 변수 b = 0 을 대입하면 5 / 0 이 된다. 이 경우 프로그램에 오류가 발생한다. > 오류가 발생하면 아래 코드가 실행되지 않음
        // 나머지
        int mod = a % b; // 5/2 -> 몫:2, 나머지:1
        System.out.println("a % b = "+mod) ; // 출력 a % b = 1
    }
}
/*
    연산자 종류
    산술 연산자: + , - , * , / , % (나머지 연산자)
    증감(증가 및 감소) 연산자: ++ , --
    비교 연산자: == , != , > , < , >= , <=
    논리 연산자: && (AND), || (OR), ! (NOT)
    대입 연산자: = , += , -= , *= , /= , %=
    삼항 연산자: ? :
    연산자와 피연산자
    ```
    3 + 4
    a + b
    ```
    연산자(operator): 연산 기호 - 예) + , -
    피연산자(operand): 연산 대상 - 예) 3 , 4 , a , b
 */
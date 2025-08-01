package infJava_A_Start.A_2_Operator;

// 비교연산자
// 두 값을 비교하는데 사용함, 주로 조건문에서 사용
// 결과는 참(true), 거짓(false)가 나옴
// =(변수의 값을 대입) 과 ==(동등한지 확인) 는 다름
// != (불일치 연산자) !가 반대라는 뜻
public class Operator7Comp1 {
    public static void main(String[] args) {
        int a = 2, b = 3;

        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);

        // 결과를 boolean 변수에 담을 수 있음
        boolean result = a == b; // false
        System.out.println(result);
    }
}

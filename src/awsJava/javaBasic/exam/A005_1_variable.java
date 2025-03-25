package awsJava.javaBasic.exam;
// 문제 : a와 b가 가지고 있는 값을 서로 뒤바꿔주세요.

public class A005_1_variable {
    public static void main(String[] args) {
        // `int a` => a라는 이름의 변수(즉 공간)을 만든다.
        // `int` => a라는 공간에는 정수만 담을 수 있다.
        // `;` => 문장이 끝남을 알린다.
        int a;
        a = 5;

        System.out.println(a);
        System.out.println(a + 10);

        int b = 10;

        // `+` => 문장과 문자을 합친다.
        System.out.println("a : " + a);
        System.out.println("b : " + b);

        // 여기서 부터
        a = 10;
        b = 5;
        // 여기까지 수정 가능

        System.out.println("a : " + a);
        // 출력 : a : 10
        System.out.println("b : " + b);
        // 출력 :  b : 5
    }
}

/*
 *  int a ; // => 이자체가 변수 선언 / 변수에 만들어 지는 시기에 int를 붙이면 변수를 만드는 것
 *  a = 5;  // =>a라는 변수에 5라는 값을 담는다.
 *  문장 + 값는 그대로 출력된다.
 *  단순 연산 결과 출력은 변수 안의 앖에 영향을 주지 않는다.
 *
 *
 */
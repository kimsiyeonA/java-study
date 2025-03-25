package awsJava.javaBasic;

public class A006_priority {

    public static void main(String[] args) {
        int x = 10;

        System.out.println("x"); // 출력 : x
        System.out.println(x); // 출력 : 10
        System.out.println("x" + x); // 출력 : x10
        System.out.println("x : " + x); // 출력 : x : 10
        System.out.println("x : " + x * 10); // 출력 : x : 100
        System.out.println("x : " + x + 10); // 출력 : x : 1010
        System.out.println("x : " + (x + 10)); // 출력 : x : 20
    }
}
/*
 * System.out.println(10+20); // 30
 * System.out.println("10"+20); // 1020
 * System.out.println("10+20"); // 10+20
 *
 * + 를 사용하려면 양쪽에 있는 자료형이 같아야 한다.
 * 자료형이면 문자인지, 숫자인지, 정수인지
 * 숫자가 문장이 된다.
 * "10"+"20" == "1020" 문자 + 문자 == 이어준다.
 * 값이 합쳐지는 것이 아니라 이어줌으로 숫자가 문자로 변한다는 것을 알 수 있다.
 *
 * int x =5;
 * System.out.println("x : "+x*5); // x : 25 // => * 가 우선순위가 높다
 * System.out.println("x : "+x+5); // x : 55 // => 문장 + 숫자 => 문장 + 숫자 => 문장화
 *
 * 우선순위	연산자	설명	예시
    1	()	괄호 (가장 우선)	(a + b) * c
    2	++, --	후위 증감	a++, b--
    3	++, --, +, -, !, ~	전위 증감, 부호, 논리 부정, 비트 반전	++a, -b, !flag
    4	*, /, %	곱셈, 나눗셈, 나머지	a * b, x % y
    5	+, -	덧셈, 뺄셈	a + b - c
    6	<<, >>, >>>	시프트 연산자	a << 2
    7	<, <=, >, >=, instanceof	비교	a < b, obj instanceof String
            instanceof는 어떤 객체(obj)가 특정 클래스의 인스턴스인지 확인
            * Object obj = "Hello";
            if (obj instanceof String) {
                System.out.println("obj는 String입니다.");
            }
            위 코드는 obj가 String 타입이면 true.

            결과: "obj는 String입니다." 출력됨

            ✔ 쓰임:
            null 체크 없이 안전하게 타입 확인 가능
            보통 if (obj instanceof SomeClass)와 같이 쓰고, 이후에 형변환(casting)해서 사용해

    8	==, !=	동등 비교	a == b
    9	&	비트 AND	a & b
    10	^	비트 XOR	a ^ b
    11	`	`	비트 OR
    12	&&	논리 AND (그리고)	a && b
    13	`		`
            공백 같은 문자는, 탭(tab)
            ✔ 예시:
            System.out.println("이름\t나이");
            System.out.println("홍길동\t20");
            ✔ 출력 결과:
            이름    나이
            홍길동  20
            \t는 "tab" 을 의미하고, 출력할 때 일정 간격으로 띄어져 보여.
    14	? :	삼항 조건 연산자	flag ? a : b
    15	=, +=, -=, *=, ...	대입 연산자	a = b, x += 1
 *
 * 자바 연산자 우선순위
 *
 *
 */

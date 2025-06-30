package infJava1_1.A_5_Scope_Casting;

// 형변환 - 자동형변환
// 작은 범위에서 큰 범위로는 당현히 값을 넣을 수 있다
// 예) int -> long -> double
// 큰 범위에서 작은 범위는 다음과 같은 문제가 발생할 수 있다.
// 소수점 버림, 오버플로우

// 작은 점위에서 큰 범위로 대읍은 허용한다.
// 자바에서 숫자를 표현할 수 있는 범위는 다음과 같다.
// int < long < double
// int 보다는 long, long 보다는 double이 큰 범위를 표현할 수 있다.
// 작은 범위에서 큰 범위에 값을 대입하는 코드를 실행하면 특별한 문제 없이 잘 수행된다.
public class Casting1 {
    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue; // int -> long
        System.out.println("longValue = " + longValue);

        doubleValue = intValue; // int -> double
        System.out.println("doubleValue = " + doubleValue);

        doubleValue = 20L; // long -> double
        System.out.println("doubleValue2 = " + doubleValue);

        doubleValue = 2000000000000000000L; // long -> double
        System.out.println("doubleValue2 = " + doubleValue);
    }
    // int -> long을 비교하면 long이 int보다 더 튼 숫자 범위를 표현한다.
    // 작은 범위 숫자 타입에서 큰 범위 숫자 타입에 대입하면 문제가 되지 않는다.
    // long -> double 의 경우에도 double 은 부동 소수점을 사용하기 때문에 더 큰 숫자 범위를 표현한다.
    // 따라서 대입할 수 있다.
    // 작은 범위에서 큰 범위로의 대입은 자바언어에서 허용한다.
    // 큰그릇은 작은 그릇에 담긴 내용물을 담을 수 있다.

    // 하지만 대입하는 형(타입)을 맞춰야 하기 때문에 개념적으로는 다음과 같이 동작한다.
    // intValue = 10;
    // doubleValue = intValue;
    // doubleValue = (double)intValue; // 형 맞추기
    // doubleValue = (double)10; // 변수 값 읽기
    // doubleValue == 10.0 // 형변환

    // (double)과 같이 적어주면 int형이 double형으로 변한다.
    // 형이 변경되는 것을 형변환이라고 한다.
    // 작은 범위 숫자 타입에서 큰 범위 숫자 타입으로 대입은 개발자가 직접 형변환을 하지 않아도 된다.
    // 자동으로 일어나기 때문에 자동형변환, 묵시적 형변환 이라고 한다.


}

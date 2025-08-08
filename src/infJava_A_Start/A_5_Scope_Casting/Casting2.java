package infJava_A_Start.A_5_Scope_Casting;

// 형변환 - 명시적 형변환

// 큰범위에서 작은 범위 대입은 명시적 형변환이 필요하다.
// double은 실수를 표현할 수 있다. 1.5가 가능하다.
// 그런데 int는 실수로 표현할 수 없다.

// double -> int로 대입하려면?

public class Casting2 {
    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

        // intValue = doubleValue; // 컴파일 오류 발생
        intValue = (int) doubleValue; // 직접 적어서 형변환 시켜줌
        System.out.println("intValue = " + intValue);

        // java: incompatible types: possible lossy conversion from double to int
        // java: 호환되지 않는 유형: double에서 int로의 가능한 손실 변환
        // int형은 double형보다 숫자의 표현 범위가 작다. 실수를 표할 수도 없더,
        // 숫자가 손실되는 문제가 발생할 수 있다, 예를들어 큰 없에 담긴 물을 작은 컵에 옮겨 담으려고 하니 손실이 발생하는 것이다.

        // 하지만 만약 이런 위험을 개발자가 직접 감수하고도 값을 대입하고 싶다면 데이터 타입으로 강제로 변경할 수 있다.
        // 대략적인 결과를 보고싶은데 이때, 소수점을 버리고 정수로만 보고 싶을 수 있다.

        // 데이터 타입을 (int)와 같이 괄호를 사용해서 명시적으로 입력하면 된다.
        // 이것을 형(타입)을 바꾼다고 해서 형변환이라 하고 영어로는 캐스팅이라 한다.
        // 개발자가 직접 형변환 코드를 입력한다고 해서 명시적 형변환 이라 한다.

        // 캐스팅 용어
        // "캐스팅"은 단어 "cast"에서 유래되었다. 금속이나 다른 물질을 녹여서 특정한 평태나 모양으로 만드는 과정을 의미한다.

        // 명시적 형변환 과정
        // doubleValue = 1.5;
        // intValue = (int) doubleValue;
        // intValue = (int) 1.5; // doubleValue에 있는 값을 읽는다.
        // intValue = 1; // (int)로 형변환 한다. intValue에 int형인 숫자 1을 대입한다.

        // 형변환을 한다고 해서 doubleValue 자체의 타입이 변경되거나 그 안에 있는 값이 변경되는 것은 아니다.
        // doubleValue에서 읽은 값을 형변환 하는 것이다. doubleValue 안에 있는 1.5 값은 그대로 유지된다.
        // 변수의 값은 대입연산자(=)를 사용해서 직접 대입할때만 변경된다.

    }
}

package infJava_A_Start.A_5_Scope_Casting;

// 형변환과 오버플로우
// 형변환을 할때 만약 작은 숫자가 표현할 수 있는 범위를 넘어서면?
public class Casting3 {
    public static void main(String[] args) {
        long maxIntValue = 2147483647; // int 최고값
        long maxIntOver = 2147483648L; // int 최고값 + 1 (초과)
        int intValue = 0;

        intValue = (int) maxIntValue; // 형변환
        System.out.println("maxIntValue casting = " + intValue);

        intValue = (int) maxIntOver; // 형변환
        System.out.println("maxIntOver casting = " + intValue); // int의 작은값부터 다시 시작
    }
    // 정상범위
    // long maxIntValue = 241783647를 보면 int로 표현할 수 있는 가장 큰 숫자인 2147483647를 입력했다.
    // 이 경우 int를 표련할 수 있는 범위에 포함되기 때문에 다음과 같이 long -> int로 형변환해도 아무런 문제가 없다.

    // 초과 범위
    // long maxIntOver = 2147483648L 를 보면 int 로 표현할 수 있는 가장 큰 숫자인 2147483647보다 1큰 숫자를 입력했디.
    // 이 숫자는 리터럴 int 범위를 넘어가기 때문에 마지막에 L을 붙여서 long형을 사용해야한다.
    // int로 표현할 수 있는 범위를 넘기 때문에 다음과 같이 long -> int로 형변환 하면 문제가 생긴다.

    // maxIntOver = 2147483648L; // int 최고값 + 1
    // intValue = (int) maxIntOver; // 변수 값 읽기
    // intValue = (int) 2147483648L; // 형변환 시도
    // intValue = -2147483648;

    // 결과를 보면 -2147483648이라는 전혀 다른 숫자가 보인다 int형은 2147483648L를 표현할 수 있는 방법이 없다.
    // 기존의 범위를 초과해서 표현사게 되면 전혀 다른 숫자가 표현되는데 이를 오버플로우라고 한다.
    // 오버플로우가 발생하면 마치 시계가 한바퀴 돈 것처럼 다시 처음부터 시작한다.
    // -2147483648숫자는 int의 가장 작은 숫자이다.

    // 중요한 것은 오버플로우 발생하는 것 자체가 문재라는 것이다.
    // 오버플로우가 발생했을 때 결과가 어떻게 되는지 계산하는데 시간을 낭비하면 안된다.
    // 오버플로우 자체가 발생하지 않도록 막아야한다.

    // 단순히 대입하는 변수(intValue)의 타입을 int -> long으로 변경해서 사이즈를 늘리면 오버플로우 문제가 해결된다.
}

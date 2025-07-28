package infJava1_1.A_8_Method;

// 메서드와 형변환 - 자동 형변환

// int < long < double
// 메서드를 호출할 때 매개변수에 값을 전달하는 것도 결국 변수에 값을 대입하는 것
// 이전에 배운 자동형변환이 그대로 적용된다.

public class Method5Casting2 {
    public static void main(String[] args) {
        int number = 100;
        printNumber(number); // int -> double, double 이 더 큰 범위를 표현하기 때문에 자동으로 형변환된다
    }

    public static void printNumber(double n){
        System.out.println("숫자: " + n);
    }

    // printNumber(number); // number는 int형 100
    // printNumber(100); //메서드를 호출하기 전에 number 변수의 값을 읽음

    // void printNumber(double n=100) //double형 파라미터 변수 n에 int형 값 100을 대입
    // void printNumber(double n=(double) 100) //double이 더 큰 숫자 범위이므로 자동 형변환 적용
    // void printNumber(double n=100.0) //자동 형변환 완료

    // => 메서드를 호출할 때는 전달하는 인수의 타입과 매개변수의 타입이 맞아야 한다.
    // 단 타입이 달라도 자동 형변환이 가능한 경우에는 호출할 수 있다.
}

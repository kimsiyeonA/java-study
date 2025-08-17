package infJava_A_Start.A_8_Method;

// 메서드와 형변환 - 명시적 형변환

// 아규먼트와 매개변수의 타입이 안 맞을 때

public class Method5Casting1 {
    public static void main(String[] args) {
        double number = 1.5;
        //  printNumber(number);
        // 받는 형은 int 인데 double 을 넣을려면 오류가 생김, 큰걸 작은데 넣으면 오류가 생김
        // double 을 int 에 대입하므로 컴파일 오류
        printNumber((int)number); // 명시적 형변환을 사용해 double 을 int 로 변환
    }

    public static void printNumber(int n){
        System.out.println("숫자: " + n);
    }

    // printNumber(number) //number는 1.5 실수
    // printNumber(1.5) //메서드를 호출하기 전에 number 변수의 값을 읽음
    // void printNumber(int n=1.5) //int형 매개변수 n에 double형 실수인 1.5를 대입 시도, 컴파일 오류

    // printNumber((int) number); // 명시적 형변환을 사용해 double을 int로 변환
    // printNumber(1); // (double) 1.5 -> (int) 1로 변환
    // void printNumber(int n=1) //int형 파라미터 변수 n에 int형 1을 대입

}

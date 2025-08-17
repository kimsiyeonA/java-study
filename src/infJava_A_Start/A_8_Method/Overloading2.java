package infJava_A_Start.A_8_Method;

// 메서드 오버로딩 - 매개변수의 타입이 다른 오버로딩

public class Overloading2 {
    public static void main(String[] args) {
        myMethod(1, 1.2); // 정수 1, 실수 1.2 호출 -> myMethod(int a, double b) 호출
        myMethod(1.2, 1); // 실수 1.2, 정수 1 호출 -> myMethod(double a, int b) 호출
    }

    public static void myMethod(int a, double b){
        System.out.println("int a, double b");
    }

    public static void myMethod(double a, int b){
        System.out.println("double a, int b");
    }
}

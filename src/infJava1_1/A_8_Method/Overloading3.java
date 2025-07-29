package infJava1_1.A_8_Method;

// 메서드 오버로딩 - 매개변수의 타입이 다른 오버로딩 2

public class Overloading3 {
    public static void main(String[] args) {
        System.out.println("1: " + add(1, 2)); // 정수 1, 정수 2 호출 -> add(int a, int b) 호출
        System.out.println("2: " + add(1.2, 1.5)); // 실수 1.2, 실수 1.5 호출 -> add(double a, double b) 호출
    }

    // 첫 번째 add 메서드: 두 정수를 받아서 합을 반환한다.
    public static int add(int a, int b){
        System.out.println("1번 호출");
        return a + b;
    }

    // 두 번째 add 메서드: 두 실수를 받아서 합을 반환한다.
    // 첫 번째 메서드와 이름은 같지만, 매개변수의 유형이 다르다.
    public static double add(double a, double b){
        System.out.println("2번 호출");
        return a + b;
    }

    // 만약 int add(int a, int b) 삭제 된다면
    // 자동 형변환이 발생해서 double add(double a, double b)이 호출된다.

    // => 먼저 본인의 타입에 최대한 맞는 메서드를 찾아서 실행하고,
    // 그래도 없으면 형 변환이 가능한 타입 메서드를 찾아서 실행한다.
}

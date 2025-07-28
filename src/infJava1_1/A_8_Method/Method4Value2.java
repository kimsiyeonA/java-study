package infJava1_1.A_8_Method;

// 메서드의 호출과 값 전달 2 - 메서드 호출과 이름이 같은 변수

public class Method4Value2 {
    public static void main(String[] args) {
        int number = 5;
        System.out.println("1. changeNumber 호출 전, number: " + number); // 5
        changeNumber(number);
        System.out.println("4. changeNumber 호출 후, number: " + number); // 5
    }

    public static void changeNumber(int number){
        System.out.println("2. changeNumber 변경 전, number: " + number); // 5
        number = number * 2;
        System.out.println("3. changeNumber 변경 후, number: " + number); // 10
    }

    // main() 에 정의한 변수와 메서드의 매개변수(파라미터)의 이름이 둘다 number 로 같다.

    // 실행결과
    // 1. changeNumber 호출 전, number: 5
    // 2. changeNumber 변경 전, number: 5
    // 3. changeNumber 변경 후, number: 10
    // 4. changeNumber 호출 후, number: 5

    // main() 도 사실은 메서드이다.
    // 각각의 메서드 안에서 사용하는 변수는 서로 완전히 분리된 다른 변수이다.
    // 물론 이름이 같아도 완전히 다른 변수다.
    // 따라서 main() 의 number 와 changeNumber() 의 number 는 서로 다른 변수이다.
    // 이름만 같지 완전히 다른 공간에서 변수 이름이 생성된다.
}

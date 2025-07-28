package infJava1_1.A_8_Method;

// 메서드의 호출과 값 전달 1 - 메서드 호출과 값 복사

public class Method4Value1 {
    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("1. changeNumber 호출 전, num1: " + num1);
        changeNumber(num1);
        System.out.println("4. changeNumber 호출 후, num1: " + num1);
    }

    public static void changeNumber(int num2){
        System.out.println("2. changeNumber 변경 전, num2: " + num2);
        num2 = num2 * 2;
        System.out.println("3. changeNumber 변경 후, num2: " + num2);
    }

    // 실행결과
    // 1. changeNumber 호출 전, num1: 5
    // 2. changeNumber 변경 전, num2: 5
    // 3. changeNumber 변경 후, num2: 10
    // 4. changeNumber 호출 후, num1: 5

    // 실행 과정
    // changeNumber(num1) 호출 시점 : num1의 값 5를 읽고 값을 복사해서 num2에 전달, 원본이 들어가거나 변화가 생기는 것이 아님 값만! 전달
    // changeNumber 메서드 실행 중 : num2 의 변경은 num1 에 영향을 주지 않는다. 왜냐하면 앞서 값을 복사해서 전달했기 때문이다.

    // 실행 과정 코드
    // changeNumber(num1); //changeNumber 를 호출한다. num1(5)
    // changeNumber(5); //num1의 값을 읽는다.

    // void changeNumber(int num2=5) //num1의 값 5가 num2에 복사된다. 결과: num1(5), num2(5)
    // num2 = num2 * 2; //num2에 2를 곱한다. 결과: num1(5), num2(5)
    // num2 = 5 * 2; //num2의 값을 읽어서 2를 곱한다. 결과: num1(5), num2(5)
    // num2 = 10; //num2에 계산 결과인 값 10을 대입한다. 결과: num1(5), num2(10)

    // num2를 출력한다: num2의 값인 10이 출력된다.
    // num1을 출력한다: num1의 값인 5가 출력된다.

    // 변수 num2 의 값만 10으로 변경되고 num1 의 값은 변경되지 않고 기존 값인 5로 유지된다.
    // 자바는 항상 값을 복사해서 전달하기 때문에 num2 의 값을 바꾸더라도 num1 에는 영향을 주지 않는다.
    // => 대입을 해야만 값이 변경된다.

}

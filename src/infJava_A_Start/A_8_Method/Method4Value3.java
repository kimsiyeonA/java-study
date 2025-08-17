package infJava_A_Start.A_8_Method;

// 메서드의 호출과 값 전달 2 - 메서드 호출과 값 반환받기

public class Method4Value3 {
    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("changeNumber 호출 전, num1: " + num1); // 5
        num1 = changeNumber(num1);
        System.out.println("changeNumber 호출 후, num1: " + num1); // 10
    }

    public static int changeNumber(int num2){
        num2 = num2 * 2;
        return num2;
    }

    // num1 = changeNumber(num1); //num1(5)
    // num1 = changeNumber(5);

    // 호출 시작:changeNumber()
    // num1의 값 5가 num2에 대입된다. num1의 값을 num2에 복사한다. num1(5), num2(5)
    //      int changeNumber(int num2=5)
    //      num2 = num2 * 2; //계산 결과: num1(5), num2(10)
    //      return num2; // num2의 값은 10이다.
    //      return 10;
    // 호출 끝: changeNumber()

    // num1 = changeNumber(5);//반환 결과가 10이다.
    // num1 = 10;//결과: num1(10)

    // 자바는 항상 변수의 값을 복사해서 대입한다
    // 참조형이라는 것을 학습하는데, 참조형 변수도 참조형 변수에 있는 값인 참조값을 복사하는 것이다


}

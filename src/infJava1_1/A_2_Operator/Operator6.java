package infJava1_1.A_2_Operator;

// 전위, 후위 증감연산자 -> 연산자의 위치에 따라 연산이 수행되는 시점이 달라짐
// ++a; 값을 먼저 증가시키고 증가된 값을 활용함
// a++; 변수의 값을 먼저 사용하고 마지막에 값을 증가시킴
public class Operator6 {
    public static void main(String[] args) {
        // 전위 증감 연산자 사용 예
        int a = 1;
        int b = 0;

        b = ++a ; // a의 값을 먼저 증가시키고, 그 결과를 b에 대입
        // a = a + 1 // a의 증감 연산이 먼저 진행, a =2
        // b = a // 이후에 a를 대입 b = 2
        System.out.println("a = " + a +", b = " + b); // 결과 : a = 2, b = 2

        // 후위 증감 연산자 사용 예
        a = 1;
        b = 0;

        b = a++; // a의 현재 값을 b에 먼저 대입하고, 그 후 a값을 증가시킴
        // b = a // a의 값을 먼저 b에 대입 b = 1
        // a = a + 1 // 이후에 a의 값을 증가 a =2
        System.out.println("a = " + a +", b = " + b); // 결과 : a = 2, b = 1
        
        // 증감 연산자를 단독으로 사용하는 경우에는 다른 연산이 없기 때문에 본인의 값만 증가함
        // shift + F10 이전 코드 실행
    }
}

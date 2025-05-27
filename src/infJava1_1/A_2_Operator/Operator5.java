package infJava1_1.A_2_Operator;

// 증감연산자
// ++ , --로 표현되며 변수의 값을 1만큼 증가시키거나 감소시킴
// 값을 1씩 증가하거나 1씩 감소할 때가 아주 많기 때문에 편의 기능을 제공한다.
public class Operator5 {
    public static void main(String[] args) {
        int a = 0;

        a = a + 1; // 0 + 1
        System.out.println("a = " + a); // 1

        a = a + 1; // 1 + 1
        System.out.println("a = " + a); // 2

        // 증감 연산자
        ++a; // a = a + 1 : 변수에 있는 값을 증가시킴
        System.out.println("a = " + a); // 3
        ++a; // a = a + 1
        System.out.println("a = " + a); // 4

        --a; // 감소
        System.out.println("a = " + a); // 3
    }
}

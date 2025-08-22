package infJava_B_Basic.A_2_Ref;

// 기본형과 변수 대입

public class VarChange1 {
    public static void main(String[] args) {
        int a = 10;
        int b = a;
        // 변수의 대입은 변수에 들어있는 값을 복사해서 대입한다.
        // 변수 a에 들어있는 값 10을 복사해서 변수 b에 대입한다. 변수 a 자체를 b에 대입하는 것이 아니다.

        System.out.println("a = " + a); // 10
        System.out.println("b = " + b); // 10

        // a 변경
        a = 20;
        System.out.println("변경 a = 20");
        System.out.println("a = " + a); // 20
        System.out.println("b = " + b); // 10
        // 변수 a에 값 20을 대입했다. 변수 a의 값이 10에서 20으로 변경되었다.
        // 변수 b에는 아무런 영향을 주지 않는다.

        // b 변경
        b = 30;
        System.out.println("변경 b = 30");
        System.out.println("a = " + a); // 20
        System.out.println("b = " + b); // 30
        // 변수 b에 값 30을 대입했다. 변수 b의 값이 10에서 30으로 변경되었다.
        // 변수 a에는 아무런 영향을 주지 않는다.

        // 핵심: int b = a라고 했을 때 변수에 들어있는 값을 복사해서 전달한다.
        // 각각 본인의 값만 변경되는 것을 확인할 수 있다.
    }
}

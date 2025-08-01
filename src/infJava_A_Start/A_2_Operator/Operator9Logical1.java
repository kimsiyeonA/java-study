package infJava_A_Start.A_2_Operator;

// 논리 연산자
// boolean 형인 true,false 를 비교하는데 사용함
// &&(그리고) : 두 피연산자가 모두 참이면 참, 둘 중 하나라도 거짓이면 거짓
// ||(또는) : 두 피연산자 중 하나라도 참이면 참, 둘다 거짓이면 거짓
// !(부정) : 참이면 거짓, 거짓이면 참
public class Operator9Logical1 {
    public static void main(String[] args) {
        System.out.println("&& : AND 연산");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && false);

        System.out.println("|| : OR 연산");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || false);

        System.out.println("! : NOR 연산");
        System.out.println(!true);
        System.out.println(!false);

        System.out.println("변수 활용");
        boolean a = true;
        boolean b = false;

        System.out.println(a && b);
        System.out.println(a || b);
        System.out.println(!a);
        System.out.println(!b);
    }
}

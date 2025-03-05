package A_1_variable;

// 변수 타입 - 정해진 규격대로 담을 수 있다.
public class Var7 {
    public static void main(String[] args) {
        int a = 100 ; // 정수
        double b = 10.5; // 실수
        boolean c = true; // 불리언(boolean) true, false 두가지만 입력 가능
        char d ='A'; // 문자 하나
        String e = "Hello Java"; // 문자열 문자열을 다루기 위한 특별한 타입

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        // 자신의 타입에 맞는 데이터를 사용, int "백원" "100" 오류남 ""는 문자열로 취급
        // 리터럴 = 100, 10.5, true, 'A', "Hello Java" 개발자가 직접 적어놓는 값들
        // 변수의 값을 변할 수있지만 리터럴은 개발자가 직접 입력한 고정된 값이라서 리터럴 자체는 변하지 않는다.


    }
}
package infJava_A_Start.A_2_Operator;

// 문자열 비교
// .equals() 매서드를 사용해야함
// ==를 사용하면 성공할 때도 있지만 실패할 때도 있다.
public class Operator8Comp2 {
    public static void main(String[] args) {
        String str1 = "문자열1";
        String str2 = "문자열2";

        boolean result1 = "hello".equals("hello"); // 리터럴 비교
        boolean result2 = str1.equals("문자열1"); // 문자열 변수, 리터럴 비교
        boolean result3 = str1.equals(str2); // 문자열 변수 비교

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3); // ctrl+shift+enter : 세미콜론 붙이기 단축키
    }
}

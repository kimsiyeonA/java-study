package A_2_Operator;

// 문자열 더하기
// 문자열에도 + 연산자를 사용할 수 있다. 문자열에 + 연산자를 사용하면 두 문자를 연결할 수 있다
// 문자 두개를 더해서 더 큰 문자를 만들어준다.
public class Operator2 {
    public static void main(String[] args) {
        // 문자열과 문자열 더하기 1
        String result1 = "hello" + "world";
        System.out.println(result1);

        // 문자열과 문자열 더하기 2 (문자열을 담은 변수끼리 합치기)
        String s1 = "String1";
        String s2 = "String2";
        String result2 = s1 + s2;
        System.out.println(result2);

        // 문자열과 숫자 더하기 1(문자열에 숫자를 더할 수는 없다. 문자랑 더하는 다른 대상을 문자열로 바꿔서 붙인다)
        String result3 = "a + b = " + 10;
        System.out.println(result3);
        /*
        계산 과정
        "a + b = "(String) + 10(int) //문자열과 숫자 더하기
        "a + b = "(String) + "10"(int -> String) //숫자를 문자열로 변경
        "a + b = " + "10" //문자열과 문자열 더하기
        "a + b = 10" //결과
         */

        // 문자열과 숫자 더하기 2
        int num = 20;
        String str = "a + b = ";
        System.out.println(str + num);
        /*
        계산 과정
        str(String) + num(int)
        "a + b = "(String) + num(int) //str 변수에서 값 조회
        "a + b = "(String) + 20(int) //num 변수에서 값 조회
        "a + b = "(String) + "20"(int -> String) //숫자를 문자열로 변경
        "a + b = " + "20" //문자열과 문자열 더하기
        "a + b = 20" //결과
        */

        // 문자열인 String 타입에 다른 타입을 더하는 경우 대상 타입을 문자열로 변경한다.
        // 문자열에 더하는 것은 다 문자열이 된다.
    }
}

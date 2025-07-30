package infJava_A_Start.A_1_Variable;

// 변수 초기화
// 선언한 변수에 처음으로 값을 저장하는 것을 변수 초기화라 한다.
public class Var5 {
    public static void main(String[] args) { // 실행 단축키 : ctrl+shift+f10
        // 1. 변수 선언, 초기화 각각 따로
        int a ;
        a = 1;
        System.out.println(a);

        // 2. 변수 선언과 초기화를 한번에
        int b = 2;
        System.out.println(b);

        // 3. 여러 변수 선언화 초기화를 한번에
        int c = 3, d = 4;
        System.out.println(c);
        System.out.println(d);
    }
}

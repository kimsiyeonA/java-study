package infJava_B_Basic.A_2_Ref;

// 변수의 종류, 초기화 - 실행

public class InitMain {
    public static void main(String[] args) {
        InitData data = new InitData();
        System.out.println("value1 = " + data.value1);
        System.out.println("value2 = " + data.value2);
        // 지역 변수를 선언하는 것 말고 new 로 해주는 것은 인스턴스를 만들면서 값을 초기값을 넣어준다.
        // 숫자는 0
    }
}

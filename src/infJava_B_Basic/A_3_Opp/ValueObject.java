package infJava_B_Basic.A_3_Opp;

// 클래스와 메서드2 - 멤버변수와 기능 포함 클래스

public class ValueObject {
    int value;

    void add(){
        value++;
        System.out.println("숫자 증가 value=" + value);
    }
}

// 데이터인 value 해당 데이터를 사용하는 기능인 add() 메서드를 함께 정의했다.

// 참고: 여기서 만드는 add() 메서드에는 static 키워드를 사용하지 않는다.
// 메서드는 객체를 생성해야 호출할 수 있다. 그런데 static 이 붙으면 객체를 생성하지 않고도 메서드를 호출할 수 있다.


package infJava_B_Basic.A_3_Opp;

// 클래스와 메서드 - 멤버변수만 존재하는 클래스 - 실행 클래스

// 클래스는 데이터 멤버 변수 뿐 아니라 기능역할을 하는 메서드도 포함할 수 있다.

public class ValueDataMain {
    public static void main(String[] args) {
        ValueData valueData = new ValueData();
        add(valueData);
        add(valueData);
        add(valueData);
        System.out.println("최종 숫자=" + valueData.value);
    }

    static void add(ValueData valueData){
        valueData.value++;
        System.out.println("숫자 증가 value=" + valueData.value);
    }

    // ValueData 라는 인스턴스를 생성하고 외부에서 ValueData.value 에 접근해 숫자를 하나씩 증가시키는 단순한 코드이다.
    // 코드를 보면 데이터인 value 와 value 의 값을 증가시키는 기능인 add() 메서드가 서로 분리되어 있다.

    // 자바 같은 객체 지향 언어는 클래스 내부에 속성(데이터)와 기능(메서드)을 함께 포함할 수 있다.

}

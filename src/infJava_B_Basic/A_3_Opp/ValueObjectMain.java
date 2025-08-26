package infJava_B_Basic.A_3_Opp;

// 클래스와 메서드2 - 멤버변수와 기능 포함 클래스 - 실행 클래스

// 클래스는 데이터 멤버 변수 뿐 아니라 기능역할을 하는 메서드도 포함할 수 있다.

public class ValueObjectMain {
    public static void main(String[] args) {
        ValueObject valueObject = new ValueObject();
        // ValueObject 라는 객체를 생성했다. 이 객체는 맴버 변수 쁜만 아니라 내부에 있는 기능을 수행하는 add() 메서드도 함께 존재한다.

        valueObject.add();
        // 인스턴스의 메서드를 호출하는 방법은 멤버 변수를 사용하는 방법과 동일하다.
        // . (dot)을 찍어서 객체 접근한 다음에 원하는 메서드를 호출하면 된다.
        // valueObject.add(); //1
        // x002.add(); //2: x002 ValueObject 인스턴스에 있는 add() 메서드를 호출한다.
        // 3: add() 메서드를 호출하면 메서드 내부에서 value++ 을 호출하게 된다.
        //    이때 value 에 접근해야 하는데, 기본으로 본인 인스턴스에 있는 멤버 변수에 접근한다.
        //    본인 인스턴스가 x002 참조값을 사용하므로 자기 자신인 x002.value 에 접근하게 된다.
        // 4: ++ 연산으로 value 의 값을 하나 증가시킨다.
        valueObject.add();
        valueObject.add();
        System.out.println("최종 숫자=" + valueObject.value);
    }

}
// 정리
// - 클래스는 속성(데이터, 멤버 변수)과 기능(메서드)을 정의할 수 있다.
// - 객체는 자신의 메서드를 통해 자신의 멤버 변수에 접근할 수 있다.
//   - 객체의 메서드 내부에서 접근하는 멤버 변수는 객체 자신의 멤버 변수이다

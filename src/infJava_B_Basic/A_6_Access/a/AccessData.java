package infJava_B_Basic.A_6_Access.a;

// 접근 제어자 사용 - 필드, 메서드 레벨의 접근 제어자

// 다양한 상황에 따른 접근 제어자를 확인해보자.
//  패키지 위치가 매우 중요하다. 패키지 위치에 주의하자
public class AccessData {

    public int publicField;
    int defaultField;
    private int privateField;

    public void publicMethod(){
        System.out.println("publicMethod 호출 " + publicField);
    }

    void defaultMethod(){
        System.out.println("defaultMethod 호출 " + defaultField);
    }

    private void privateMethod(){
        System.out.println("PrivateMethod 호출 " + privateField);
    }

    public void innerAccess(){ // 내부에서 모두 접근 할 수 있는지 확인
        System.out.println("내부 호출");
        publicField = 100;
        defaultField = 200;
        privateField = 300;
        publicMethod();
        defaultMethod();
        privateMethod();
    }
    // 컴파일 오류 없이 모든 필드와 메서드에 접근할 수 있는 것을 알 수 있다.
    // 본인 안에서 접근하는 것은 다 됨

    // 패키지 위치는 package access.a 이다. 패키지 위치를 꼭 맞추어야 한다. 주의하자.
    // 순서대로 public , default , private 을 필드와 메서드에 사용했다.
    // 마지막에 innerAccess() 가 있는데, 이 메서드는 내부 호출을 보여준다.
    // 내부 호출은 자기 자신에게 접근하는 것이다. 따라서 private 을 포함한 모든 곳에 접근할 수 있다.

}

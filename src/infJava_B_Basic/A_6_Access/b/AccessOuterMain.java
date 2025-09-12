package infJava_B_Basic.A_6_Access.b;

// 접근 제어자 사용 - 필드, 메서드

// 다른 패키지 다른 클래스

import infJava_B_Basic.A_6_Access.a.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();
        // public 호출 가능
        data.publicField = 1;
        data.publicMethod();

        // 다른 패키지 default 호출 불가
        // data.defaultField = 2;
        // data.defaultMethod();

        // private 호출 불가
        // data.privateField = 3; > 에러 발생
        // data.privateMethod();

        data.innerAccess(); // -> AccessData 내부에서 매서드가 실행되어 호출된다. 우회해서 돌아가는 느낌
    }
}
// - 패키지 위치는 package access.b 이다. 패키지 위치를 꼭 맞추어야 한다. 주의하자.
// - public 은 모든 접근을 허용하기 때문에 필드, 메서드 모두 접근할 수 있다.
// - default 는 같은 패키지에서 접근할 수 있다. access.b.AccessOuterMain 은
//   access.a.AccessData 와 다른 패키지이다. 따라서 default 접근 제어자에 접근할 수 없다.
// - private 은 AccessData 내부에서만 접근할 수 있다. 따라서 호출 불가다.
// - AccessData.innerAccess() 메서드는 public 이다. 따라서 외부에서 호출할 수 있다.
//   innerAccess() 메서드는 외부에서 호출되었지만 해당 메서드 안에서는 자신의 private 필드와 메서드에 접근할 수 있다.

// 생성자도 접근 제어자 관점에서 메서드와 동일하게 사용된다,
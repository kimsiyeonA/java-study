package infJava_B_Basic.A_5_Pack.a;

// 패키지 사용 1 - Pack.a.User.java

public class User {
    public User(){
        System.out.println("패키지 infJava_B_Basic.A_5_Pack.a 회원 생성");
    }
}

// 패키지의 하위의 하위는 점으로 구분한다.
// pack 하위에 a 라는 패키지를 먼저 만들자.
// pack.a 패키지에 User 클래스를 만들었다.
// 이후에 User 인스턴스가 생성되면 생성자를 통해 정보를 출력한다.

// 생성자에 public 을 사용했다.
// 다른 패키지에서 이 클래스의 생성자를 호출하려면 public 을 사용해야 한다.
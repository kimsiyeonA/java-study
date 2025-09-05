package infJava_B_Basic.A_5_Pack;

// 패키지 사용 1 - 풀네임 패키지 사용

public class PackageMain1 {
    public static void main(String[] args) {
        Data data = new Data();
        // PackageMain1과 Data 는 같은 패키지 레벨에 있다.
        // 같은 패키지에 있으면 이름을 그대로 쓰면 된다.

        // 하위 패키지 안에 있는 클래스 호출하기
        // src 아래 있는 패키지 이름부터 지금 있는 패키지와 클래스 이름까지 .을 찍어 입력하면 된다.
        // 이런 이름을 풀네임이라고 한다.
        infJava_B_Basic.A_5_Pack.a.User user = new infJava_B_Basic.A_5_Pack.a.User();
    }
}

// 사용자와 같은 위치:
// PackageMain1 과 Data 는 같은 pack 이라는 패키지에 소속되어 있다.
// 이렇게 같은 패키지에 있는 경우에는 패키지 경로를 생략해도 된다.
// 사용자와 다른 위치:
// PackageMain1 과 User 는 서로 다른 패키지다.
// 이렇게 패키지가 다르면 pack.a.User 와 같이 패키지 전체 경로를 포함해서 클래스를 적어주어야 한다.

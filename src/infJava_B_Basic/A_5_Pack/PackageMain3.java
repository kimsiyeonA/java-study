package infJava_B_Basic.A_5_Pack;

// 패키지 사용2 - 클래스 이름 중복

// 패키지 덕분에 클래스 이름이 같아도 패키지 이름으로 구분해서 같은 이름의 클래스를 사용할 수 있다.
// pack.a.User -> a 패키지 소속의 유저
// pack.b.User -> b 패키지 소속의 유저
// 이런 경우 클래스 이름이 둘다 User 이지만 패키지 이름으로 대상을 구분할 수 있다.

// => 결국 클래스를 구분하는건 이름만으로 구분하는게 아니라 사실 패키지 명을 포함한 전체 경로로 구분한다.
import infJava_B_Basic.A_5_Pack.a.User;

public class PackageMain3 {
    public static void main(String[] args) {
        User userA = new User(); // 클래스명을 쓰고 선택하면 IDE 가 자동으로 선택해준다.
        infJava_B_Basic.A_5_Pack.b.User userB = new infJava_B_Basic.A_5_Pack.b.User();
    }
}

// 이미 import User 를 했기 때문에 다른 패키지 이름이여도 임포트 팔 수 없다.
// 그래서 다른 경로를 적어줘야 한다.
// 둘중 하나는 다 적어줘야 한다.

// 같은 이름의 클래스가 있다면 import 는 둘중 하나만 선택할 수 있다.
// 이때는 자주 사용하는 클래스를 import 하고 나머지를 패키지를 포함한 전체 경로를 적어주면 된다.
// 물론 둘다 전체 경로를 적어준다면 import 를 사용하지 않아도 된다.
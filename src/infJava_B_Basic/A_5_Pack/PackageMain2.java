package infJava_B_Basic.A_5_Pack;

// 패키지 사용 1 - import 사옹

// 이전에 본 코드와 같이 패키지가 다르다고 pack.a.User 와 같이 항상 전체 경로를 적어주는 것은 불편하다.
// 이때는 import 를 사용하면 된다

import infJava_B_Basic.A_5_Pack.a.User; // 나는 이걸 가져다가 쓸거야
import infJava_B_Basic.A_5_Pack.a.*; // 패키지에 있는 클래스를 여러개 가져다 쓸 때
// 하나로 infJava_B_Basic.A_5_Pack.a 패키지 안에 있는 클래스들을 사용할 수 있다.
// 하위는 안가지고 옴 infJava_B_Basic.A_5_Pack.a 패키지 안에 있는 클래스만 가지고 옴

public class PackageMain2 {
    public static void main(String[] args) {
        Data data = new Data();
        User user = new User(); // import -> 포함해서 쓴다는 뜻으로 클래스 명만 입력하면 됨
        User2 user2 = new User2();
    }
}

// 코드에서 첫줄에는 package(나의 패키지) 를 사용하고, 다음 줄에는 import(가져올것) 를 사용할 수 있다.
// import 를 사용하면 다른 패키지에 있는 클래스를 가져와서 사용할 수 있다.
// import 를 사용한 덕분에 코드에서는 패키지 명을 생략하고 클래스 이름만 적을 수 있다

// 특정 패키지에 포함된 모든 클래스를 포함해서 사용하고 싶으면 import 시점에 *(별) 을 사용하면 된다.
// pack.a 패키지에 있는 모든 클래스를 패키지 명을 생략하고 사용할 수 있다.

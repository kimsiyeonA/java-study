package infJava_B_Basic.A_4_Construct;

// 생성자가 필요한 이유, this - 멤버 참조 클래스

public class MemberInit {
    String name;
    int age;
    int grade;

     // 추가
     void initMember(String name, int age, int grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
        // 본인한테 가까운게 scope 의 우선순위를 가진다.
        // 매개변수가 scope 상 가깝다. 멤버변수가 더 멀다.
    }

    // this

    // 매개변수와 클래스의 멤버변수의 이름이 같은 경우
    // 그냥 변수의 이름을 쓰면 매개변수로 받은 변수명인지 클래스 멤버변수의 이름인지 모른다.
    // 그래서 클래스의 멤버변수임을 알려주기 위해 this 를 붙인다.
    // this 를 붙이면 자기 자신의 인스턴스를 가리킨다.

    // initMember() 의 코드를 보면 메서드의 매개변수에 정의한 String name 과 Member 의 멤버변수의 이름이 String name 으로 둘다 똑같다.
    // 나머지 변수 이름도 name, age, grade 로 모두 같다.

    // 멤버 변수와 메서드의 매개변수의 이름이 같으면 둘을 어떻게 구분해야 할까?
    // - 이 경우 멤버 변수보다 매개변수가 코드 블럭의 더 안쪽에 있기 때문에 매개변수가 우선순위를 가진다.
    //   따라서 initMember() 메서드 안에서 name 이라고 적으면 매개변수에 접근하게 된다.
    // - 멤버 변수에 접근하려면 앞에 this. 이라고 해주면 된다. 여기 this 는 인스턴스 자신의 참조값을 가리킨다.

    // this.name = name; //1. 오른쪽의 name 은 매개변수에 접근
    // this.name = "user"; //2. name 매개변수의 값 사용
    // x001.name = "user"; //3. this.은 인스턴스 자신의 참조값을 뜻함, 따라서 인스턴스의 멤버 변수에 접근

    // this 를 제거하면
    // name 은 둘다 매개변수를 뜻하게 된다. 따라서 맴버변수의 값이 변경되지 않는다

    // 정리
    // 매개변수의 이름과 맴버 변수의 이름이 같은 경우 this 를 사용해서 둘을 명확하게 구분해야 한다.
    // this 는 인스턴스 자신을 가리킨다.

}

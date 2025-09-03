package infJava_B_Basic.A_4_Construct;

// 생성자 - 오버로딩과 this() - 참조 클래스

// 생성자도 메서드 오버로딩처럼 매개변수만 다르게 해서 여러 생성자를 제공할 수 있다.

public class MemberConstruct2 {
    String name;
    int age;
    int grade;

    // 추가
//    MemberConstruct2(String name, int age){ // 이름과 나이만 있으면 성적 50점 부터 시작한다.
//        this.name = name;
//        this.age = age;
//        this.grade = 50;
//    }

    MemberConstruct2(String name, int age){ // 스스로는 부를 수 없다
        this(name, age, 50); // 변경
        System.out.println("go");
    }

    MemberConstruct2(String name, int age, int grade){
        System.out.println("생성자 호출 name=" + name + ",age=" + age + ",grade=" + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}

// 기존 MemberConstruct 에 생성자를 하나 추가해서 생성자가 2개가 되었다.

// 시험 치고 들어온 학생와 안 치고 들어온 학생을 분류할 때 이런식으로 개발하면 된다.

// this()
// 두 생성자를 비교해보면 코드가 중복되는 부분이 있다.
// this.name = name;
// this.age = age;

// 이때 this() 라는 기능을 사용하면 생성자 내부에서 자신의 생성자를 호출할 수 있다.
// 참고로 this 는 인스턴스 자신의 참조값을 가리킨다.
// 그래서 자신의 생성자를 호출한다고 생각하면 된다.

// 는 첫번째 생성자 내부에서 두번째 생성자를 호출한다.
// MemberConstruct(String name, int age) -> MemberConstruct(String name, int age,int grade)

// this() 를 사용하면 생성자 내부에서 다른 생성자를 호출할 수 있다.
// 이 부분을 잘 활용하면 지금과 같이 중복을 제거할 수 있다. 물론 실행 결과는 기존과 같다.

// this() 규칙
// this() 는 생성자 코드 안에서 첫줄에만 작성할 수 있다.
// 다음은 규칙 위반이다. 이 경우 컴파일 오류가 발생한다.
// public MemberConstruct(String name, int age) {
//      System.out.println("go");
//      this(name, age, 50);
// }
//this() 가 생성자 코드의 첫줄에 사용되지 않았다.

// MemberConstruct2(String name, int age){
//      this(name, age, 50); // 변경
//      System.out.println("go");
// }
// 이거는 가능


// this()를 쓴다고 해서 객체가 두개 생성되는 것이 아니라 생성이 되고 초기화를 해주는 것이다.


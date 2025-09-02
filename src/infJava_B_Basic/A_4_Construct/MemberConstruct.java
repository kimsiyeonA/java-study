package infJava_B_Basic.A_4_Construct;

// 생성자 - 도입 - 생성자 있는 참조 클래스

// 프로그래밍을 하다보면 객체를 생성하고 이후에 바로 초기값을 할당해야 하는 경우가 많다.
// 따라서 initMember() 와 같은 메서드를 매번 만들어야 한다.
// 대부분의 객체 지향 언어는 객체를 생성하자마자 즉시 필요한 기능을 좀 더 편리하게 수행할 수 있도록 생성자라는 기능을 제공한다.
// 생성자를 사용하면 객체를 생성하는 시점에 즉시 필요한 기능을 수행할 수 있다.
// 생성자는 앞서 살펴본 initMember() 와 같이 매서드와 유사하지만 몇가지 다른 특징이 있다.

public class MemberConstruct {
    String name;
    int age;
    int grade;

    // 생성자
    MemberConstruct(String name, int age, int grade){
        System.out.println("생성자 호출 name=" + name + ",age=" + age + ",grade=" + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}

// 매서드랑 같은데 명이 클래스 이름과 같다.

// 생성자는 메서드와 비슷하지만 차이가 있다.
// - 생성자의 이름은 클래스 이름과 같아야 한다. 따라서 첫 글자도 대문자로 시작한다.
// - 생성자는 반환 타입이 없다. 비워두어야 한다.
// - 나머지는 메서드와 같다.

// 생성자는 객체 생성 직후 객체를 초기화 하기 위한 특별한 메서드로 생각할 수 있다


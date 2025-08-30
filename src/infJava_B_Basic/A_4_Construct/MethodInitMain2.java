package infJava_B_Basic.A_4_Construct;

// 생성자가 필요한 이유 - 반복 메서드로 분리, 메서드 클래스에 합치기를 원함
// 객체를 생성하는 시점에 어떤 작업을 하고 싶다면 생성자(Constructor)를 이용하면 된다.
public class MethodInitMain2 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit(); //  참조값을 넘겨서 초기화하기 때문에 다시 참조값을 받을 필요는 없음
        initMember(member1,"user1", 15, 90);

        MemberInit member2 = new MemberInit();
        initMember(member2, "user2", 16, 80);

        MemberInit[] members = {member1, member2};

        for(MemberInit s : members){
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " +  s.grade);
        }
    }

    static void initMember(MemberInit member, String name, int age, int grade){
        member.name = name;
        member.age = age;
        member.grade = grade;
    }

    // initMember() 메서드를 사용해서 반복을 제거했다.
    // 그런데 이 메서드는 대부분 MemberInit 객체의 멤버 변수를 사용한다.
    // 우리는 앞서 객체 지향에 대해서 학습했다.
    // 이런 경우 속성과 기능을 한 곳에 두는 것이 더 나은 방법이다.
    // 쉽게 이야기해서 MemberInit 가 자기 자신의 데이터를 변경하는 기능(메서드)을 제공하는 것이 좋다.

}

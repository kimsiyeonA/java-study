package infJava_B_Basic.A_4_Construct;

// this 사용 - 메인 클래스
// 객체를 생성하는 시점에 어떤 작업을 하고 싶다면 생성자(Constructor)를 이용하면 된다.
public class MethodInitMain3 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit(); //  참조값을 넘겨서 초기화하기 때문에 다시 참조값을 받을 필요는 없음
        member1.initMember("user1", 15, 90);

        MemberInit member2 = new MemberInit();
        member2.initMember("user2", 16, 80);

        MemberInit[] members = {member1, member2};

        for(MemberInit s : members){
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " +  s.grade);
        }
    }

    // initMember() Member 에 초기값 설정 기능을 제공하는 메서드이다.
    // 다음과 같이 메서드를 호출하면 객체의 맴베 변수에 인자로 넘어온 값을 채운다.
    // member1.initMember("user1", 15, 90);
    // 자기 자신의 값을 외부에서 받아서 자기 자신의 값을 바꾼다.
}

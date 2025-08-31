package infJava_B_Basic.A_4_Construct;

// 생성자가 필요한 이유
// 객체를 생성하는 시점에 어떤 작업을 하고 싶다면 생성자(Constructor)를 이용하면 된다.

public class MethodInitMain1 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        member1.name = "user1";
        member1.age = 15;
        member1.grade = 90;

        MemberInit member2 = new MemberInit();
        member2.name = "user2";
        member2.age = 16;
        member2.grade = 80;

        MemberInit[] members = {member1, member2};

        for(MemberInit s : members){
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " +  s.grade);
        }
    }

    // 회원 객체를 생성하고 나면 name, age, grade 같은 변수에 초기값을 설정한다.
    // 아마도 회원 객체를 제대로 사용하기 위해서는 객체를 생성하자마자 이런 초기값을 설정해야할 것이다.
    // 이 코드에는 회원의 초기값을 설정하는 부분이 계속 반복된다.
    // 메서드를 사용해서 반복을 제거해보자.
}

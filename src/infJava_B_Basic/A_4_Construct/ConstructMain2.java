package infJava_B_Basic.A_4_Construct;

// 생성자 - 오버로딩과 this() - 참조 클래스

public class ConstructMain2 {
    public static void main(String[] args) {
        MemberConstruct2 member1 = new MemberConstruct2("user1",15,90);
        MemberConstruct2 member2 = new MemberConstruct2("user2",16);

        MemberConstruct2[] members = {member1, member2};

        for(MemberConstruct2 s : members){
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " +  s.grade);
        }
    }
}
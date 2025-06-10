package infJava1_1.A_3_Comd;

// else if 적용
public class If4 {
    public static void main(String[] args) {
        int age = 14;
        if(age <= 7){
            System.out.println("미취학");
        } else if (age <= 13) { // 8살 이하의 거르는 조건은 앞에서 조건을 거치고 들어옴
            System.out.println("초등학생");
        } else if (age <= 16){
            System.out.println("중학생");
        } else if (age <= 19) {
            System.out.println("고등학생");
        } else{
            System.out.println("성인");
        }

        // age = 7인 경우
        // if(age <= 7) 의 조건이 참이다. "미취학"을 출력하고 전체 if 문 밖으로 나간다.

        // age = 13인 경우
        // if(age <= 7) 의 조건이 거짓이다. 다음 조건으로 넘어간다.
        // else if(age <= 13) 의 조건이 참이다. "초등학생"을 출력하고 전체 if 문 밖으로 나간다.

        // age = 50인 경우
        // if(age <= 7) 의 조건이 거짓이다. 다음 조건으로 넘어간다.
        // else if(age <= 13) 의 조건이 거짓이다. 다음 조건으로 넘어간다.
        // else if(age <= 16) 의 조건이 거짓이다. 다음 조건으로 넘어간다.
        // else if(age <= 19) 의 조건이 거짓이다. 다음 조건으로 넘어간다.
        // else 만족하는 조건 없이 else 까지 왔다. else 에 있는 "성인"을 출력하고 전체 if 문 밖으로 나간다.

    }
}

package infJava1_1.A_3_Comd;

// else if 조건문
// 불필요한 조건 검사를 피하고 코드의 효율성을 향상시킬 수 있다.
public class If3 {
    public static void main(String[] args) {
        // 7세 이하일 경우: "미취학"
        // 8세 이상 13세 이하일 경우: "초등학생"
        // 14세 이상 16세 이하일 경우: "중학생"
        // 17세 이상 19세 이하일 경우: "고등학생"
        // 20세 이상일 경우: "성인"

        int age = 20;

        /**if 문으로만 할때**/
        if (age <= 7){
            System.out.println("미취학");
        }
        if (8 <= age && age <= 13){
            System.out.println("초등학생");
        }
        if (14 <= age && age <= 16){
            System.out.println("중학생");
        }
        if (17 <= age && age <= 19){
            System.out.println("고등학생");
        }
        if (20 <= age){
            System.out.println("성인");
        }
        // 단점 : 이미 조건을 만족해도 다음 조건을 검사함,
        // 같은 조건이 중복 됨, 8살 넘는 것을 체크하고 또 같은 조건을 체크함 age <= 7, 8 <= age 조건 중복 체크

        // else if
        // 앞선 if문의 조건이 거짓일 때 다음 조건을 검사하며 참이 걸리시 다음 조건을 검사하지 않는다.
        // 전체 if문을 하나로 묶는다. 득정조건을 만족하면 실행하고 끝다고 만족하지 않으면 다음 조건을 검사한다.
        // 핵심 : 순서대로 맞는 조건을 찾고, 만는 조건이 있으면 그 조건에 대항하는 코드 딱 한개만 실행함
        // else 생략가능

        // if (condition1){
        //   조건1이 참일때 실행되는 코드
        // }else if (condition2){
        //   조건1이 거짓이고, 조건2가 참일 때 실행되는 코드
        // }else if (condition3){
        //   조건2가 거짓이고, 조건3이 참일 때 실행되는 코드
        // }else{
        //   모든 조건이 거짓일때 실행되는 코드
        // }



    }
}

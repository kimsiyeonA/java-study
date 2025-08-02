package infJava_A_Start.A_3_Cond;

// If문 - else
// 조건문 : 특정 조건에 따라서 다른 코드를 실행하는 것
public class If2 {
    public static void main(String[] args) {
        // else문
        // if문에서 만족하는 조건이 없을 때 실행하는 코드
        // if (condition){
        //   조건이 참일때 실행되는 코드
        // }else{
        //   만족하는 조건이 없을 때 실행되는 코드
        // }

        int age =20;

        if(age >= 18){
            System.out.println("성인입니다.");
        }else{
            System.out.println("미성년자입니다.");
        }
    }
}

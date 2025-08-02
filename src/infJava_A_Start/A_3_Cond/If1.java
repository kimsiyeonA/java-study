package infJava_A_Start.A_3_Cond;

// If문 - if 
// 조건문 : 특정 조건에 따라서 다른 코드를 실행하는 것
public class If1 {
    public static void main(String[] args) {
        // if문
        // 특정 조건이 참인지 확인하고, 그 조건이 참일 경우 특정 코드 블록을 실행
        // if(condition){
        //   조건이 참일 때 실행되는 코드
        // }
        // 거짓일때는 코드블럭을 실행하지 않고 넘어간다.
        // 코드블록: {} 사이에 있는 코드

        int age = 20; // 사용자 나이

        if(age >= 18){
            System.out.println("성인입니다.");
        }
        // if (20 >= 18){"성인입니다"} // age의 값은 20이다.
        // if (true) {"성인입니다"} // 조건이 참으로 판명된다.
        // {"성인입니다"} // if문에 있는 코드블록이 실행된다.

        if(age < 18){
            System.out.println("미성년자 입니다.");
        }
        // if (20 < 18){"미성년자입니다"} // age의 값은 20이다.
        // if (false) {"미성년자입니다"} // 조건이 거짓으로 판명된다.
        // 해당 코드 블록은 실행 되지 않는다.

    }
}

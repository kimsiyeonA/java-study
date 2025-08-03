package infJava_A_Start.A_3_Cond;

// switch 문

// if문으로 만들기, switch 기본 설명
public class Switch1 {
    public static void main(String[] args) {
        // if문 풀이
        // 회원 등급에 따라 다른 쿠폰을 발급하는 프로그램
        // int grade 라는 변수를 사용하며, 회원등급(grade)에 따라 다음 쿠폰을 발급함
        // - 1등급 : 쿠폰 1000
        // - 2등급 : 쿠폰 2000
        // - 3등급 : 쿠폰 3000
        // - 위 등급이 아닐 경우 : 쿠폰 500
        // 각 쿠폰이 할당된 후에는 "발급받은 쿠폰" + 쿠폰값을 출력해야한다.
        // 예) 발급받은 쿠폰 2000

        int grade = 1;
        int coupon;

        if(grade == 1){
            coupon = 1000;
        }else if(grade == 2){
            coupon = 2000;
        }else if(grade == 3){
            coupon = 3000;
        }else{
            coupon = 500;
        }

        System.out.println("발급받은 쿠폰 " + coupon);

        // switch
        // if 문은 비교연산자를 사용할 수 있지만, switch 문은 단순히 값이 같은지만 비교할 수 있다.
        // switch (조건식) {
        //      case value1:
        //          조건식의 결과 값이 value1일 때 실행되는 코드
        //          break;
        //      case value2:
        //          조건식의 결과 값이 value2일 때 실행되는 코드
        //          break;
        //      default:
        //          조건식의 결과 값이 위의 어떤 값에도 해당하지 않을 때 실행되는 코드

        // 조건식의 결과 값이 어떤 case 의 값과 일치하면 해당 case 의 코드를 실행한다.
        // break 문은 현재 실행중인 코드를 끝내고, switch 문을 빠져나가게 하는 역할을 한다.
        // 만약 break 문이 없으면, 일치하는 case 이후의 모든 case 코드들이 순서대로 실행된다.
        // default 는 조건식의 결과값이 모든 case 의 값과 일치하지 않을 때 실행된다.
        // if 문의 else 와 같다. 쓸지 말지는 선택이다.

    }
}

package infJava1_1.A_3_Cond;

// switch 문 - break가 없을 때
public class Switch3 {
    public static void main(String[] args) {
        int grade = 2;
        int coupon;

        // 2등급 3등급 3000원 쿠폰을 받을 수 있개 함

        switch (grade) {
            case 1:
                coupon = 1000;
                break;
            case 2: // break이 없으니 아래로 실행됨
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
        }

        System.out.println("발급받은 쿠폰 " + coupon);

        // if vs switch
        // switch
        // 조건식을 넣는 부분이 참 거짓 결과가 나오는 조건이 아니라 단순히 값만 넣는다.
        // 조건이 특정 case 와 같은지만 체크할 수 있다. 확인연산만 가능하다(문자도 가능)
        // if
        // 참 거짓의 결과가 나오는 조건식을 자유롭게 쓸 수 있다.

        // if 문으로 사용해도 되지만 특정 값에 따라 코드가 실행되면 switch 문을 사용하면 간결하게 사용할 수 있다.


    }
}

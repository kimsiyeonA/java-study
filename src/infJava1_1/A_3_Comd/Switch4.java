package infJava1_1.A_3_Comd;

// 새로운 형식 switch 문 / 자바 14 이상에서 사용 가능
public class Switch4 {
    public static void main(String[] args) {
        int grade = 2;

        int coupon = switch (grade) {
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
        };

        System.out.println("발급받은 쿠폰" + coupon);

        // 특징
        // - ->를 사용한다.
        // - 선택된 데이터를 반환할 수 있다.
        // 더 많은 다양한 내용들이 있으나 생략함
    }
}

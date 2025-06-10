package infJava1_1.A_3_Comd;

// if + else if 문
public class If6 {
    public static void main(String[] args) {
        int price = 10000; // 아이템 가격
        int age = 10; // 나이
        int discount = 0;

        if(price >= 10000){ // >> 여기만 실행됨, 만족되면 실행되고 아래로 진행되지 않고 나감
            discount += 1000;
            System.out.println("10000원 이상 구매, 1000원 할인");
        }else if (age >= 10){
            discount += 1000;
            System.out.println("나이 10살 이하 1000원 할인");
        }else{
            System.out.println("할인 없음");
        }

        System.out.println("총 할인 금액 : " + discount + "원");
        System.out.println("결제 금액 : " + (price - discount));

        if (true) {
            System.out.println("if문에서 실행됨");
        }
        if (true) System.out.println("if문에서 실행되는게 한줄일 때 {}를 지울 수 있다.");
        // 하지만 권장하지는 않음 가독성과 유지보수성을 위해서

    }
}

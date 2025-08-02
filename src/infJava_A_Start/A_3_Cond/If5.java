package infJava_A_Start.A_3_Cond;

// if문과 else if문
// if문과 else if문을 함께 사용하는 것은 서로 연관된 조건일때 사용
// 서로 관련없는 독립조건이면 else if를 사용하지 않고 if문을 각각 따로 사용해야한다.

// if 문 각각
public class If5 {
    public static void main(String[] args) {
        // 예시 1. if-else 사용: 서로 연관된 조건이어서, 하나로 묶을 때
        // if (condition1){
        //      작업 1 수행
        // } else if (condition2) {
        //      작업 2 수행
        // }

        // 예시 2. if 각각 사용 : 독립 조건일 때-> 다른 조건과 연관되지 않고 각각의 조건에 대해 별도의 작업을 수행
        // if (condition1){
        //      작업 1 수행
        // }
        // if (condition2){
        //      작업 2 수행
        // }

        // 문제
        // 온라인 쇼핑몰의 할인 시스템을 개발해야 한다. 한 사용자가 어떤 상품을 구매할때, 다양한 할인 조건에 따라 총 할인 금액이 달라질 수 있다.
        // 각각의 할인 조건은 다음과 같다.
        // - 아이템 가격이 10000원 이상일 때, 1000원 할인
        // - 나이가 10살 이하일때 1000원 할인
        // 이 할인 시스템은 한 사용자가 동시에 여러 할인을 받을 수 있다.
        // 예를 들어, 10000원짜리 아이템을 구매할때 1000원 할인을 받고 동시에 나이가 10살 이하면 추가로 1000원 더 할인 받는다면
        // 총 2000원 까지 할인 받을 수 있다.

        int price = 10000; // 아이템 가격
        int age = 10; // 나이
        int discount = 0;

        if(price >= 10000){
            discount += 1000;
            System.out.println("10000원 이상 구매, 1000원 할인");
        }
        if (age >= 10){
            discount += 1000;
            System.out.println("나이 10살 이하 1000원 할인");
        }

        System.out.println("총 할인 금액 : " + discount + "원");
        System.out.println("결제 금액 : " + (price - discount));






    }
}

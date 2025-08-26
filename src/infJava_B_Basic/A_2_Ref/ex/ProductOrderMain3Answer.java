package infJava_B_Basic.A_2_Ref.ex;

// 문제 - 상품 주문 시스템 개발 - 사용자 입력

import java.util.Scanner;

public class ProductOrderMain3Answer {
    public static void main(String[] args) {
        // 여러 상품의 주문 정보를 담는 배열 생성
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        ProductOrder[] orders = new ProductOrder[n];

        // createOrder()를 여러번 사용해서 상품 주문 정보들을 생성하고 배열에 저장
        for(int i = 0; i < orders.length; i++){
            System.out.println((i+1) + "번째 주문 정보를 입력하세요.");

            System.out.print("상품명: ");
            String productName = scanner.nextLine();

            System.out.print("가격: ");
            int price = scanner.nextInt();

            System.out.print("수량: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            orders[i] = createOrder(productName,price,quantity);
        }


        // printOrders()를 사용해서 상품 주문 정보 출력
        printOrder(orders);

        // getTotalAmount()를 사용해서 총 결제 금액 계산
        System.out.println("총 결제 금액: " + getTotalAmount(orders));
    }

    static ProductOrder createOrder(String productName, int price, int quantity){
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }

    static void printOrder(ProductOrder[] orders){
        for(ProductOrder order : orders){
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity );
        }
    }

    static int getTotalAmount(ProductOrder[] orders){
        int totalPrice = 0;
        for(ProductOrder order : orders){
            totalPrice += (order.price * order.quantity);
        }
        return totalPrice;
    }
}

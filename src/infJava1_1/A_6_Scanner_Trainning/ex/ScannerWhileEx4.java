package infJava1_1.A_6_Scanner_Trainning.ex;

// 문제 - 상품 구매

// - 사용자로부터 상품 정보(상품명, 가격, 수량)를 입력 받고, 이들의 총 가격을 출력하는 프로그램을 작성하세요.
//   사용자는 여러 상품을 추가하고 결제할 수 있으며 프로그램은 언제든지 종료할 수 있습니다.
// - 사용자에게 다음 세 가지 옵션을 제공해야 합니다. 1. 상품입력, 2: 결제, 3: 프로그램 종료
//   옵션은 정수로 입력받으며, 옵션을 저장하는 변수의 이름은 option 이어야 합니다.
// - 상품 입력 옵션을 선택하면, 사용자에게 상품명과 가격, 수량을 입력받으세요.
// - 결재 옵션을 선택하면, 총 비용을 출력하고 총 비영을 0으로 초기화 하세요.
//   (사용자가 총 비용을 확인하고, 결제를 완료했다고 가정합니다.
//   따라서 다음 사용자를 위해 총 비용을 다시 0으로 초기화 해야합니다)
// - 프로그램 종료 옵션을 선택하면, "프로그램을 종료합니다." 라는 메세지를 출력하고 프로그램을 종료하세요.
// - 위의 세 가지 옵션 이외애 다른 값을 입력하면, "올바른 옵션을 선택해주세요." 라는 메세지를 출력하게요.

// 실행 결과 예시
// 1: 상품 입력, 2: 결제, 3: 프로그램 종료
// 1
// 상품명을 입력하세요: 스프링
// 상품의 가격을 입력하세요: 30000
// 구매 수량을 입력하세요: 1
// 상품명:스프링 가격:30000 수량:1 합계:30000
// 1: 상품 입력, 2: 결제, 3: 프로그램 종료
// 1
// 상품명을 입력하세요: JPA
// 상품의 가격을 입력하세요: 40000
// 구매 수량을 입력하세요: 2
// 상품명:JPA 가격:40000 수량:2 합계:800001: 상품 입력, 2: 결제, 3: 프로그램 종료
// 2
// 총 비용: 110000
// 1: 상품 입력, 2: 결제, 3: 프로그램 종료
// 3
// 프로그램을 종료합니다.

import java.util.Scanner;

public class ScannerWhileEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int totalPrice = 0;
        System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
        while(true){
            int option = scanner.nextInt();
            scanner.nextLine();

            if(option == 1){
                System.out.print("상품명을 입력하세요: ");
                String name = scanner.nextLine();

                System.out.print("삳품의 가격을 입력하세요: ");
                int price = scanner.nextInt();

                System.out.print("구매 수량을 입력하세요: ");
                int quantity = scanner.nextInt();

                System.out.println("상품명: "+name+" 가격: "+price+" 수량: "+quantity+" 합계: "+(price*quantity));
                totalPrice += (price * quantity);

            }else if(option == 2){
                System.out.println("총 비용: "+totalPrice);
                totalPrice =0;
            }else if(option == 3){
                System.out.println("프로그램을 종료합니다.");
                break;
            }else{
                System.out.println("올바른 옵션을 선택해주세요.");
            }

        }

        // 강사 풀이
        int totalCost = 0;

        while(true){
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            int option = scanner.nextInt();

            if(option == 1){
                scanner.nextLine();

                System.out.print("상품명을 입력하세요: ");
                String product = scanner.nextLine();

                System.out.print("삳품의 가격을 입력하세요: ");
                int price = scanner.nextInt();

                System.out.print("구매 수량을 입력하세요: ");
                int quantity = scanner.nextInt();

                totalCost += price * quantity;
                System.out.println("상품명: "+product+" 가격: "+price+" 수량: "+quantity+" 합계: "+price*quantity);

            }else if(option == 2){
                System.out.println("총 비용: "+totalCost);
                totalCost =0;
            }else if(option == 3){
                System.out.println("프로그램을 종료합니다.");
                break;
            }else{
                System.out.println("올바른 옵션을 선택해주세요.");
            }

        }
    }
    // 누적 할 때
    // 반드시 초기화해야 함
    // int num;        // 선언만 함 (초기값 없음)
    // num += 1;       // 에러! num 이 뭔지 모르는 상태에서 +1을 할 수 없음

    // 왜 초기화가 필요한가?
    // num += 1은 num = num + 1과 같은 의미
    // 기존 num 값에 1을 더해서 다시 num 에 저장
    // 근데 기존 num 값이 뭔지 모르면 계산할 수 없음
    // 핵심은 사용하기 전에 반드시 값을 할당해야 한다는 것




}

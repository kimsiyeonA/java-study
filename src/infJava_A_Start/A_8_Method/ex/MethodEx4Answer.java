package infJava_A_Start.A_8_Method.ex;

// 문제 - 은행 계좌 입출금

// 다음 실행 예시를 참고해서, 사용자로부터 계속 입력을 받아 입금과 출금을 반복 수행하는 프로그램을 작성하자.
// 또한 간단한 메뉴를 표시하여 어떤 동작을 수행해야 할지 선택할 수 있게 하자
// 출금시 잔액이 부족하다면 "x원을 출금하려 했으나 잔액이 부족합니다."라고 출력해야 한다.

import java.util.Scanner;

// 실행 예시
// ---------------------------------
// 1.입금 | 2.출금 | 3.잔액 확인 | 4.종료
// ---------------------------------
// 선택: 1
// 입금액을 입력하세요: 10000
// 10000원을 입금하였습니다. 현재 잔액: 10000원
// ---------------------------------
// 1.입금 | 2.출금 | 3.잔액 확인 | 4.종료
// ---------------------------------
// 선택: 2
// 출금액을 입력하세요: 8000
// 8000원을 출금하였습니다. 현재 잔액: 2000원
// ---------------------------------
// 1.입금 | 2.출금 | 3.잔액 확인 | 4.종료
// ---------------------------------
// 선택: 2
// 출금액을 입력하세요: 3000
// 3000원을 출금하려 했으나 잔액이 부족합니다.
// ---------------------------------
// 1.입금 | 2.출금 | 3.잔액 확인 | 4.종료
// ---------------------------------
// 선택: 3
// 현재 잔액: 2000원
// ---------------------------------
// 1.입금 | 2.출금 | 3.잔액 확인 | 4.종료
// ---------------------------------
// 선택: 4
// 시스템을 종료합니다.
public class MethodEx4Answer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int balance = 0;

        while(true){
            System.out.println("---------------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
            System.out.println("---------------------------------");

            System.out.print("선택: ");
            int choice = scanner.nextInt();
            int amount;

            switch(choice) {
                case 1:
                    System.out.print("입금액을 입력하세요: ");
                    amount = scanner.nextInt();
                    balance = deposit(balance,amount);
                    break;
                case 2:
                    System.out.print("출금액을 입력하세요: ");
                    amount = scanner.nextInt();
                    balance = withdraw(balance,amount);
                    break;
                case 3:
                    System.out.println("현재 잔액: " + balance);
                    break;
                case 4:
                    System.out.println("시스템을 종료합니다.");
                    return;
                    // break 는 switch 문만 종료 while 루프는 계속 실행
                    // return 은 main 메서드 자체 종료
                default:
                    System.out.println("올바른 선택이 아닙니다. 다시 선택해주세요.");

            }
        }
    }
    public static int deposit(int balance, int amount){
        balance += amount;
        System.out.println(amount + "원을 입금하였습니다. 현재 잔액: " + balance + "뤙");
        return balance;
    }

    public static int withdraw(int balance, int amount){
        if(balance >= amount){
            balance -= amount;
            System.out.println(amount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
        }else{
            System.out.println(amount + "원을 출금하려 했으나 잔액을 부족합니다.");
        }
        return balance;
    }
}

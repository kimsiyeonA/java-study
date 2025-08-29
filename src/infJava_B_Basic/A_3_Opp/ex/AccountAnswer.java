package infJava_B_Basic.A_3_Opp.ex;

// 객체 지향 - 계좌 클래스

public class AccountAnswer {
    int balance; // 잔액

    void deposit(int amount){
        balance += amount;
    }

    void withdraw(int amount){
        if(balance < amount){
            System.out.println("잔액 부족");
        }else{
            balance -= amount;
        }
    }
}

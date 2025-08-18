package infJava_A_Start.A_8_Method.ex;

// 문제 - 입출금 리펙토링

// 다음은 입금, 출금을 나타내는 코드이다.
// 입금(deposit), 출금(withdraw)을 메서드로 만들어서 리펙토링 해보자
public class MethodEx3RefAnswer {
    public static void main(String[] args) {
        int balance = 10000;
        balance = deposit(balance, 1000);
        balance = withdraw(balance, 12000);
        System.out.println("최종 잔액: " + balance + "원");
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

// 리펙토링 결과를 보면 main() 은 세세한 코드가 아니라 전체 구조를 한눈에 볼 수 있게 되었다.
// 쉽게 이야기해서 책의 목차를 보는 것 같다.
// 더 자세히 알고 싶으면 해당 메서드를 찾아서 들어가면 된다.
// 그리고 입금과 출금 부분이 메서드로 명확하게 분리되었기 때문에 이후에 변경 사항이 발생하면 관련된 메서드만 수정하면 된다.
// 특정 메서드로 수정 범위가 한정되기 때문에 더 유지보수 하기 좋다.

// 이런 리펙토링을 메서드 추출(Extract Method)이라 한다. -> 있던 로직을 구조적으로 필요한 부분을 떼서 메소드로 뽑는 것
// 메서드를 재사용하는 목적이 아니어도 괜찮다.
// 메서드를 적절하게 사용해서 분류하면 구조적으로 읽기 쉽고 유지보수 하기 좋은 코드를 만들 수 있다.
// 그리고 메서드의 이름 덕분에 프로그램을 더 읽기 좋게 구조적으로 만들 수 있다.

// 잘짠 코드: 세세하고 지저분한 부분을 메소드 안으로 숨기고 요구하는 사항들을 전체적으로 볼 수 있게 한다.
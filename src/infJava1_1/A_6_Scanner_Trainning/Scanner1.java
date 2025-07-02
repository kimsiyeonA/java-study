package infJava1_1.A_6_Scanner_Trainning;

// Scanner 기본예제 1

// System.out 을 통해서 출력했듯이 ,System.in 을 통해서 사용자의 입력을 받을 수 있다.
// 자바가 제공하는 System.in을 통해서 사용자 입력을 받으려면 여러 과정들을 거쳐야해서 복잡하고 어렵다
// 자바는 이런 문제를 해결하기 위해 Scanner 라는 클래스를 제공한다.

import java.util.Scanner;
// 자바가 제공하는 라이브러리를 가져다가 씀'

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 사용자에게 입력받는 것을 Scanner 를 사용해서 씀

        System.out.print("문자열을 입력하세요: ");
        String str = scanner.nextLine(); // 입력을 String 으로 가져온다.
        System.out.println("입력한 문자열: " + str);

        System.out.print("정수를 입력하세요: ");
        int intValue = scanner.nextInt(); // 입력을 int 로 가져온다.
        System.out.println("입력한 정수: "+intValue);

        System.out.print("실수를 입력하세요: ");
        double doubleValue = scanner.nextDouble(); // 입력을 double 로 가져온다.
        System.out.println("입력한 실수: " + doubleValue);
    }

    // Scanner scanner = new Scanner (System.in);
    // 객체와 클래스를 배워야 정확히 이해할 수 있다.
    // 지금은 Scanner 의 기능을 사용하기 위해 new 를 사용해서 Scanner 를 만든다 정도로 이해한다.
    // Scanner 는 System.in 을 사용해서사용자의 입력을 편리하게 받도록 도와준다.
    // Scanner scanner 코드는 scanner 변수를 선언하는 것이다. 이제 scanner 변수를 통해서 scanner 를 사용할 수 있다.

    // scanner.nextLine()
    // 엔터(\n)을 입력할 때까지의 문자를 가져온다.

    // scanner.nextInt()
    // 입력을 int 형으로 가져온다. 정수 입력에 사용한다.

    // scanner.nextDouble()
    // 입력을 double 형으로 가져온다. 실수 입력에 사용한다.

    // 주의! 다른 타입 입력시 오류
    // 타입이 다르면 오류가 발생한다. 숫자에 문자를 입력하면 타입 오류가 발생한다.

    // print() vs println()
    // println()이 아니라 print()를 사용한다.
    // 엔터키를 치면 (\n) 이라는 문자를 남긴다.
    // 이 문자는 영어로 new line character; 한글로 줄바꿈 문자 또는 개행 문자라고 한다.
    // 새로운 라인으로 넘긴다는 뜻이다.
    // print("asdf\n") == println("asdf")


}

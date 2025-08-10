package infJava_A_Start.A_6_Scanner_Trainning;

// Scanner - 반복예제1

// 지금까지 개발한 프로그램들은 단 한번의 결과 출력 후 종료되는 일회성 프로그램이었다.
// 실제 프로그램들은 이렇게 한번의 결과만 출력하고 종료되지 않는다.
// 한번 실행하면 사용자가 프로그램을 종료할 때까지 반복해서 실행된다.
// 이제부터는 사용자의 입력을 지속해서 받아드리고 반복동작하는 프로그램을 개발해보다.

// Scanner 와 반복문을 함께 사용하면 된다.

// 사용자가 입력한 문자열을 그대로 출력하는 예제를 만들어보자
// exit 라는 문자가 입력되면 프로그램 종료한다.
// 프로그램은 반복해서 출력한다.


import java.util.Scanner;

public class ScannerWhile1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("문자열을 입력하세요: ");
            String str = scanner.nextLine();
            if(str.equals("exit")){
                System.out.println("프로그램을 종료합니다.");
                break;
            }else{
                System.out.println(str);
            }
        }

        // 강사 풀이
        while(true){
            System.out.print("문자열을 임력하세요(exit: 종료): ");
            String str = scanner.nextLine();
            if(str.equals("exit")){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.println("입력한 문자열: "+str);
        }

    }

    // while (true): 중간에 break 문을 만나기 전까지 무한 반복한다.
    // 입력 받은 문자가 "exit"이면 "프로그램을 종료합니다"를 출력하고 break 문을 통해서 while 문을 빠져나간다.

}

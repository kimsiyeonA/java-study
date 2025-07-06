package infJava1_1.A_6_Scanner_Trainning.ex;

// 문제 - 이름과 나이 반복 *

// 사용자로부터 이름과 나이를 반복해서 입력받고,
// 입력받은 이름과 나이를 출력하는 프로그램을 작성하세요.
// 사용자가 "종료"를 입력하면 프로그램이 종료 되어야 합니다.
// 다음 실행 결과 예시를 참고해주세요.

import java.util.Scanner;

public class ScannerWhileEx1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        while(true){
            System.out.print("이름을 입력하세요 (죵료를 입력하면 종료): ");
            String name = input.nextLine();

            if(name.equals("종료")){
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("나이를 입력하세요: ");
            int age = input.nextInt();
            input.nextLine();

            System.out.println("입력한 이름: "+name+", 나이: "+age);
        }

        // 강사 풀이

        while(true){
            System.out.print("이름을 입력하세요 (죵료를 입력하면 종료): ");
            String name = input.nextLine();

            if(name.equals("종료")){
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("나이를 입력하세요: ");
            int age = input.nextInt(); // 10\n
            input.nextLine(); // \n

            System.out.println("입력한 이름: "+name+", 나이: "+age);
        }


    }

    // 괄호 자동 닫힘 단축키 ctrl + shift + enter

    // input.nextInt();
    // 10\n에서 10만 가져가고 \n이 남아있음
    // 그다음 input.nextLine 에서 \n 읽고 빈 값으로 들어감
    // 그래서 숫자, 문자 받는 입력이 번걸아 나올시 숫자입력에서 \n처리를 해줘야하고
    // 다른 input.nextLine 영향을 안 받게 input.nextLine 에서 읽게 만들어줘야함
}

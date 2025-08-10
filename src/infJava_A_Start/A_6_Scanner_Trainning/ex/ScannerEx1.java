package infJava_A_Start.A_6_Scanner_Trainning.ex;

// 문제 - 이름 나이 입력 받고 출력하기

// 사용자로부터 입력받은 이름과 나이를 출력하세요.
// 출력 형태는 "당신의 이름은 [이름]이고, 나이는 [나이]살 입니다." 이어야 합니다.

// 실행 결과 예시
// 당신의 이름을 입력하세요:자바
// 당신의 나이를 입력하세요:30
// 당신의 이름은 자바이고, 나이는 30살입니다

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("당신의 이름을 입력하세요: ");
        String name = scanner.nextLine();

        System.out.print("당신의 나이를 입력하세요: ");
        int age = scanner.nextInt();

        System.out.println("당신의 이름은 "+name+"이고, 나이는 "+age+"살입니다.");

        // 강사 풀이
        System.out.print("당신의 이름을 입력하세요: ");
        String name2 = scanner.nextLine(); // 이름을 입력 받는다.

        System.out.print("당신의 나이를 입력하세요: ");
        int age2 = scanner.nextInt(); // 나이를 입력받는다. 나이는 정수이므로 nextInt()를 사용한다.

        System.out.println("당신의 이름은 "+name2+"이고, 나이는 "+age2+"살입니다.");

    }
}

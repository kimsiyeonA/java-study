package infJava_A_Start.A_6_Scanner_Trainning;

// Scanner - 반복 예제 3

// 사용자 입력을 받아 그 합계를 계산하는 프로그램을 작성해야한다.
// 사용자는 한 번에 한 개의 정수르 입력할 수 있으며, 사용자가 0을 입력하면 프로그램은 종료된다.
// 이 때, 프로그램이 종료될때까지 사용자가 입력한 모든 정수의 합을 출력해야한다.

import java.util.Scanner;

public class ScannerWhile3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;

        // 내 풀이
        while(true){
            System.out.print("정수를 입력하세요 (0을 입력하면 종료): ");
            int num = input.nextInt();
            if (num == 0){
                System.out.println("총 합계: "+sum);
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            sum+=num;
        }

        // 강사풀이
        sum = 0;

        while(true){
            System.out.print("정수를 입력하세요 (0을 입력하면 종료): ");
            int number = input.nextInt();
            if (number == 0){
                break;
            }
            sum+=number;
        }
        System.out.println("입력한 모든 정수의 합: "+sum);
    }
}

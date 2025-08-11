package infJava_A_Start.A_6_Scanner_Trainning.ex;

// 문제 - 사이숫자 *

// 사용자로부터 두 개의 정수를 입력 받고,
// 이 두 정수 사이의 모든 정수를 출력하는 프로그램을 작성하세요.

// - 사용자에게 첫 번째 숫자를 입력 받으세요. 변수 이름은 num1 이어야 합니다.
// - 사용자에게 두 번째 숫자를 입력 받으세요. 변수 이름은 num2 이어야 합니다.
// - 만약 첫 번째 숫자 num1이 두번째 숫자 num2보다 크다면, 두 숫자를 교환하세요.
//   - 참고 : 교환을 위해 임시 변수 사용을 고려해보세요.
// - num1부터 num2까지의 각 숫자를 출력하세요.
// - 출력 결과에 유의하세요. 다음 예시와 같이 2,3,4,5처럼 ,로 구분해서 촐력해야 합니다.

import java.util.Scanner;

public class ScannerEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = scanner.nextInt();

        if(num1 > num2){
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        for(int i = num1; i <= num2; i++ ){
            System.out.print(i);
            if(i != num2){
                System.out.print(", ");
            }
        }

        // 강사 풀이
        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num11 = scanner.nextInt();

        System.out.print("두 번째 숫자를 입력하세요: ");
        int num22 = scanner.nextInt();

        // num11이 num22보다 큰 경우, 두 숫자를 교환합니다.
        if(num11 > num22){
            int temp = num11;
            num11 = num22;
            num22 = temp;
        }

        System.out.print("두 숫자 사이의 모든 정수: ");
        for(int i = num11; i <= num22; i++ ){
            System.out.print(i);
            if(i != num22){ // i가 마지막 값이면 출력 못하게
                System.out.print(", ");
            }
        }
    }
}

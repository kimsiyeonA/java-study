package infJava1_1.A_6_Scanner_Trainning.ex;

// 문제 - 입력한 숫자의 합계와 평균

// - 사용자로부터 여러 개의 숫자를 입력 받고,
//   그 숫자들의 합계와 평균을 계산하는 프로그램을 작성하세요.
//   사용자는 숫자를 입력하고,
//   마지막에는 -1을 입력하여 숫자 입력을 종료한다고 가정합니다.
// - 모든 숫자의 입력이 끝난 후에는, 숫자들의 합계 sum 과 평균 average 를 출력하세요.
//   평균은 소수점 아래까지 계산해야합니다.
// - 다음 실행 결과 예시를 참고해주세요.

// 실행 결과 예시
// 숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요:
// 1
// 2
// 3
// 4
// -1
// 입력한 숫자들의 합계: 10
// 입력한 숫자들의 평균: 2.5

import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum =0;
        int count =0;
        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요: ");
        while(true){
            int num = scanner.nextInt();

            if(num == -1){
                break;
            }

            sum += num;
            count += 1;
        }
        System.out.println("입력한 숫자들의 합계: "+sum);
        System.out.println("입력한 숫자들의 평균: "+((double)sum/count));

        // 강사 풀이
        int sum2 =0;
        int count2 =0;
        int input2 =0;

        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요: ");
//        while(true){
//            input2= scanner.nextInt();
//
//            if(input2 == -1){
//                break;
//            }
//
//            sum2 += input2;
//            count2++;
//        }

        // 반복문 축약, break 없이
        while((input2 = scanner.nextInt()) != 1){ // 입력 값이 -1이 아닐때까지 반복, 조건식으로 받아서 씀
            sum2 += input2;
            count2++;
        }

        double average2 = (double)sum2 / count2;
        System.out.println("입력한 숫자들의 합계: "+sum);
        System.out.println("입력한 숫자들의 평균: "+average2);
    }

    // 반복문 축약 실행
    // while((input2 = scanner.nextInt()) != 1) // 사용자 3 입력
    // while((input2 = 3) != 1) // input 에 3 대입
    // while((3) != 1) // () 제거
    // while(3 != 1) // 부동식 연산
    // while(true) // while 문 실행

    // 반복문 축약 종료
    // while((input2 = scanner.nextInt()) != 1) // 사용자 -1 입력
    // while((input2 = -1) != 1) // input 에 -1 대입
    // while((-1) != 1) // () 제거
    // while(-1 != 1) // 부동식 연산
    // while(false) // while 문 종료


}

package infJava_A_Start.A_4_Loop.ex;

// 짝수 출력 - for 문 버전

// 반복문을 사용하여 처음 10개의 짝수를 출력하는 프로그램을 작성해보세요.
// 이때, num라는 변수를 사용해야 합니다.

public class ForEx2 {
    public static void main(String[] args) {
        int count = 0;

        for(int num = 1; ; num++){
            if(num % 2 == 0) {
                System.out.println(num);
                count++;
            }
            if(count == 10){
                break;
            }
        }

        System.out.println();

        for(int num = 1; num <= 20; num++){
            if(num % 2 == 0) {
                System.out.println(num);
            }
            num++;
        }

        System.out.println();

        // 강사 풀이
        for (int num =2, count2 = 1; count2 <= 10 ; num += 2, count2++){
            System.out.println(num);
        }

        int num =2;
        for (int count2 = 1; count2 <= 10 ; count2++){
            System.out.println(num);
            num += 2;
        }

    }
}

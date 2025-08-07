package infJava_A_Start.A_4_Loop.ex;

// 짝수 출력 - while 문 버전

// 반복문을 사용하여 처음 10개의 짝수를 출력하는 프로그램을 작성해보세요.
// 이때, num라는 변수를 사용해야 합니다.

public class WhileEx2 {
    public static void main(String[] args) {
        int num = 1;
        int count = 0;

        while(true){
            if(num % 2 == 0) {
                System.out.println(num);
                count++;
            }
            num++;
            if(count == 10){
                break;
            }
        }

        System.out.println();

        num = 1;
        while(num<=20){
            if(num % 2 == 0) {
                System.out.println(num);
            }
            num++;
        }

        System.out.println();

        // 강사 풀이
        num = 2;
        count =1;
        while (count <= 10){
            System.out.println(num);
            num += 2;
            count++;
        }

    }
}

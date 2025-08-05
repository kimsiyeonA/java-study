package infJava_A_Start.A_4_Loop;

// do-while 문
// while문과 비슷하지만, 조건에 상관없이 무조건 한번은 코드를 실행한다.

public class DoWhile1 {
    public static void main(String[] args) {
        // do-while 문
        // do{
        //  //  코드
        // }while (조건식);
        //
        //

        int i = 10;

        do{ // 일단 한번 실행함
            System.out.println("현재 숫자는: "+i);
            i++;
        }while(i < 3); 
        // 조건이 참이라면 반복하고 거짓이라면 반복문을 나옴
        // while문 조건 뒤에 ; 붙이기

        while (i < 3) { // 조건이 거짓이므로 실행되지 않는다
            System.out.println("현재 숫자는: "+i);
            i++;
        }

    }
}

package infJava1_1.A_4_Loop;

// while 1

public class While1_2 {
    public static void main(String[] args) {
        // while 문
        // while (조건식){
        //      코드
        // }
        // 조건식을 확인한다. 참이면 코드블럭을 실행하고, 거짓이면 while 문을 벗어난다.
        // 조건식이 참이면 코드블럭을 실행한다.
        // 이후에 코드 블럭이 끝나면 다시 조건식 검사로 돌아가서 조건식을 검사한다.

        int count = 0;

        while (count < 3){
            count = count + 1;
            System.out.println("현재 숫자는: "+ count);
        }
    }

}

package infJava_A_Start.A_8_Method.ex;

// 문제 - 반복 출력 리펙토링

// 다음은 특정 숫자만큼 같은 메시지를 반복 출력하는 기능이다.
// 메서드를 사용해서 리펙토링해보자.
public class MethodEx2RefAnswer {
    public static void main(String[] args) {
        String message = "Hello, world!";

        printMessage("Hello, world!", 3);
        printMessage("java", 5);
        printMessage("hi",7);
    }

    public static void printMessage(String message, int times){
        for(int i = 0; i < times; times++){
            System.out.println(message);
        }
    }
}

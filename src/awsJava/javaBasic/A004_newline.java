package awsJava.javaBasic;

public class A004_newline {// 들여쓰기

    public static void main(String[] args) {
        System.out.print("안녕");
        System.out.print("안녕");
        System.out.print("안녕");

        // 출력
        // 안녕안녕안녕

        System.out.println("안녕");
        System.out.print("안녕");
        System.out.println("안녕");

        // 출력
        // 안녕
        // 안녕안녕

        System.out.println(); // 이 코드는 System.out.print("\n"); 과 같다.

        // 출력
        // \n -> 강제로 줄바꿈함
        // 추가설명 : 실제로 출력창에 \n 는 보이지 않고 줄바꿈으로 작동한다.

        System.out.println("안녕\n안녕안녕");

        // 출력
        // 안녕
        // 안녕안녕

        System.out.print("안녕\n");
        System.out.print("안녕");
        System.out.print("안녕");

        // 출력
        // 안녕
        // 안녕안녕

        // print = 줄바꿈하지 않는 출력
        // println = 줄바꿈하는 출력

        // 주황색 = 예약어/키워드 (미리 쓰기로 약속된 단어)
        // // 이 붙어 있는 줄은 무시됨 -> 주석이라고 함
        // 주석 단축키 ctrl+/
    }
}


package infJava_A_Start.A_4_Loop;

// 중첩 반복문
// 반복문 내부에 또 반복문을 만들 수 있다
// for, while 모두 가능하다.

public class Nested1 {
    public static void main(String[] args) {
        for(int i = 0; i < 2; i++){
            System.out.println("외부 for 시작 i:"+i);
            for(int j = 0; j < 3; j++){
                System.out.println("-> 내부 for "+i+"-"+j);
            }
            System.out.println("외부 for 종료 i:" + i);
            System.out.println();
        }
    }
}

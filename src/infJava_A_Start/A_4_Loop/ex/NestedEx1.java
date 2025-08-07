package infJava_A_Start.A_4_Loop.ex;

// 구구단 출력 - 중첩 for 문

// 중첩 for 문을 사용해서 구구단을 완성해라

public class NestedEx1 {
    public static void main(String[] args) {

        for(int i = 1; i <10; i++){
            for(int j = 1; j<10; j++){
                System.out.println(i+" * "+j+" = "+(i*j));
            }
        }

        System.out.println();

        // 강사 풀이
        for(int i = 1; i <=9; i++){
            for(int j = 1; j<=9; j++){
                System.out.println(i+" * "+j+" = "+(i*j));
            }
        }

    }
}

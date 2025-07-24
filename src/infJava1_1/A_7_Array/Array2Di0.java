package infJava1_1.A_7_Array;

// 2차원 배열

// 1차원 배열 : 단순히 순서대로 나열
// 2차원 배열 : 행과 열로 구성된 표형태

// int[][] arr = new int[2][3] 와 같이선언하고 생성한다.
// arr[1][2] 에서 [1]은 행번호 이고, [2]은 열변호 이다.
// 행은 영어로 row(로우), 열은 영어로 column(컬럼)이라 한다.
// arr[행][열], arr[row][column]

public class Array2Di0 {
    public static void main(String[] args) {
        // 2x3 2차원 배열을 만든다.
        int[][] arr = new int[2][3]; // 행2, 열3

        arr[0][0] = 1; // 0행, 0열
        arr[0][1] = 2; // 0행, 1열
        arr[0][2] = 3; // 0행, 2열
        arr[1][0] = 4; // 1행, 0열
        arr[1][1] = 5; // 1행, 1열
        arr[1][2] = 6; // 1행, 2열

        // 0행 출력
        System.out.print(arr[0][0] + " "); // 0열
        System.out.print(arr[0][1] + " "); // 1열
        System.out.print(arr[0][2] + " "); // 2열
        System.out.println(); // 한 행이 끝나면 라인을 변경한다.

        // 1행 출력
        System.out.print(arr[1][0] + " "); // 0열
        System.out.print(arr[1][1] + " "); // 1열
        System.out.print(arr[1][2] + " "); // 2열
        System.out.println(); // 한 행이 끝나면 라인을 변경한다.
    }
}

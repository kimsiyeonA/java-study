package infJava_A_Start.A_7_Array;

// 2차원 배열 - 리팩토링(구조 개선 - 행 출력 반복)

public class Array2Di1 {
    public static void main(String[] args) {
        // 2x3 2차원 배열을 만든다.
        int[][] arr = new int[2][3]; // 행2, 열3

        arr[0][0] = 1; // 0행, 0열
        arr[0][1] = 2; // 0행, 1열
        arr[0][2] = 3; // 0행, 2열
        arr[1][0] = 4; // 1행, 0열
        arr[1][1] = 5; // 1행, 1열
        arr[1][2] = 6; // 1행, 2열

        for(int row = 0; row < 2; row++){
            System.out.print(arr[row][0] + " "); // 0열
            System.out.print(arr[row][1] + " "); // 1열
            System.out.print(arr[row][2] + " "); // 2열
            System.out.println(); // 한 행이 끝나면 라인을 변경한다.
        }

        // for 문을 통해서 행(row)을 반복해서 접근한다. 각 행 안에서 열 (column)이 3개 이므로
        // arr[row][0], arr[row][1], arr[row][2] 3번 출력한다.
        // for 문을 한번 도는 동안 3개의 열을 출력할 수 있다.
    }
}

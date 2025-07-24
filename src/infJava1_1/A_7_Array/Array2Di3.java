package infJava1_1.A_7_Array;

// 2차원 배열 - 리팩토링(구조 개선 - 초기화, 배열의 길이)

public class Array2Di3 {
    public static void main(String[] args) {
        // 2x3 2차원 배열을 만든다.
        int[][] arr = new int[][]{
                {1, 2, 3},
                {4, 5, 6}
        }; // 행2, 열3

        //  int[][] arr = {
        //    {1, 2, 3},
        //    {4, 5, 6}
        //   }; // 행2, 열3

        for(int row = 0; row < arr.length; row++){ // arr.length -> 행의 수
            for(int column = 0; column < arr[row].length; column++){ // arr[row].length -> [row]행의 열의 수
                System.out.print(arr[row][column] + " ");
            }
            System.out.println(); // 한 행이 끝나면 라인을 변경한다.
        }

        // for 문을 통해서 행(row)을 반복해서 접근한다. 각 행 안에서 열 (column)이 3개 이므로
        // arr[row][0], arr[row][1], arr[row][2] 3번 출력한다.
        // for 문을 한번 도는 동안 3개의 열을 출력할 수 있다.
    }
}

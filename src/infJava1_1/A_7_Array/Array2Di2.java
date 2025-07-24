package infJava1_1.A_7_Array;

// 2차원 배열 - 리팩토링(구조 개선 - 열 출력 반복)

public class Array2Di2 {
    public static void main(String[] args) {
        // 2x3 2차원 배열을 만든다.
        int[][] arr = new int[2][3]; // 행2, 열3

        arr[0][0] = 1; // 0행, 0열
        arr[0][1] = 2; // 0행, 1열
        arr[0][2] = 3; // 0행, 2열
        arr[1][0] = 4; // 1행, 0열
        arr[1][1] = 5; // 1행, 1열
        arr[1][2] = 6; // 1행, 2열

        for(int row = 0; row < arr.length; row++){ // arr.length -> 행의 수
            for(int column = 0; column < arr[row].length; column++){ // arr[row].length -> [row]행의 열의 수
                System.out.print(arr[row][column] + " ");
            }
            System.out.println(); // 한 행이 끝나면 라인을 변경한다.
        }

        // 초기화
        // 1차원 배열은 다음과 같이 초기화 한다.
        // {1,2,3}

        // 2차원 배열은 다음과 같이 초기화 한다. 밖이 행이 되고, 안이 열이 된다. 그런데 이렇게 하면 행열이 잘 안느껴진다.
        // {{1, 2, 3},{4, 5, 6}}

        // 이렇게 라인을 적절하게 넘겨주면 행과 열이 명확해진다. 따라서 코드를 더 쉽게 이해할 수 있다.
        // {
        //  {1, 2, 3},
        //  {4, 5, 6}
        // }

        // 2차원 배열의 길이
        // arr.length 는 행의 길이를 뜻한다. 여기서는 2가 출력된다.
        // arr[row].length 는 열의 길이를 뜻한다. 여기서는 3이 출력된다.
    }
}

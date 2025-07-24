package infJava1_1.A_7_Array;

// 2차원 배열 - 리팩토링(구조 개선 - 값 입력)

public class Array2Di4 {
    public static void main(String[] args) {
        // 2x3 2차원 배열을 만든다.
        int[][] arr = new int[3][3]; // 행2, 열3

        int i = 1;
        for(int row = 0; row < arr.length; row++){
            for(int column = 0; column < arr[row].length; column++){
                arr[row][column] =  i++; // 후위증감연산자를 사용해서 값을 먼저 대입한 다음에 증가한다.
            }
        }
        // 중헙된 for 문을 사용해서 값을 순서대로 입력한다.


        for(int row = 0; row < arr.length; row++){ // arr.length -> 행의 수
            for(int column = 0; column < arr[row].length; column++){ // arr[row].length -> [row]행의 열의 수
                System.out.print(arr[row][column] + " ");
            }
            System.out.println(); // 한 행이 끝나면 라인을 변경한다.
        }

    }
}

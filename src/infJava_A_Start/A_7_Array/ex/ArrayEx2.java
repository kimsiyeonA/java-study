package infJava_A_Start.A_7_Array.ex;

// 문제 - 배열의 입력과 출력

// 사용자에게 5개의 정수를 입력받아서 배열에 저장하고, 입력 순서대로 출력하자.
// 출력시 출력 포멧은 1, 2, 3, 4, 5와 같이 , 쉼표를 사용해서 구분하고,
// 마지막에는 쉼표를 넣지 않아야 한다.

// 실행 결과 예시
// 5개의 정수를 입력하세요:
// 1
// 2
// 3
// 4
// 5
// 출력
// 1, 2, 3, 4, 5

import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int[] arr = new int [5];

        System.out.println("5개의 정수를 입력하세요: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }

        System.out.println("출력");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
            if(i != (arr.length-1)){
                System.out.print(", ");
            }
        }

        // 강사 풀이
        int[] numbers = new int [5];

        System.out.println("5개의 정수를 입력하세요: ");
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = scanner.nextInt();
        }

        System.out.println("출력");
        for (int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i]);
            if(i < numbers.length - 1){
                System.out.print(", ");
            }
        }
    }
}

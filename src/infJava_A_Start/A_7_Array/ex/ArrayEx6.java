package infJava_A_Start.A_7_Array.ex;

// 문제 - 가장 작은 수, 큰 수 찾기 *

// 사용자로부터 n개의 정수를 입력받아 배열에 저장한 후,
// 배열 내에서 가장 작은 수와 가장 큰 수를 찾아 출력하는 프로그램을 작성하자

// 실행 결과 예시
// 입력받을 숫자의 개수를 입력하세요:3
// 3개의 정수를 입력하세요:
// 1
// 2
// 3
// 가장 작은 정수: 1
// 가장 큰 정수: 5


import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("입력받을 숫자의 갯수를 입력하세요: ");
        int index = scanner.nextInt();
        int[] arr = new int [index];

        System.out.println(index + "개의 정수를 입력하세요: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
            if(i != (arr.length-1)){
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("가장 작은 정수: " + arr[0]);
        System.out.println("가장 큰 정수: " + arr[arr.length-1]);

        // 강사 풀이
        System.out.print("입력받을 숫자의 갯수를 입력하세요: ");
        int n = scanner.nextInt();
        int[] numbers = new int [n];
        int minNumber, maxNumber;

        System.out.println(n + "개의 정수를 입력하세요: ");
        for(int i = 0; i < n; i++){
            numbers[i] = scanner.nextInt();
        }

        minNumber = maxNumber = numbers[0]; // 첫 번째 항목 넣기

        for (int i = 1; i < n; i++){
            if(numbers[i] <  minNumber){ // 다른 항목과 비교해서 작은 값이면 넣기
                minNumber = numbers[i];
            }
            if(numbers[i] > maxNumber){
                maxNumber = numbers[i];
            }
        }

        System.out.println("가장 작은 정수: " + minNumber);
        System.out.println("가장 큰 정수: " + maxNumber);


    }
}

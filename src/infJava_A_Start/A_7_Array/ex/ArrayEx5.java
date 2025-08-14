package infJava_A_Start.A_7_Array.ex;

// 문제 - 합계와 평균2

// 이전 문제에서 입력받을 숫자의 개수를 입력받도록 개선하자

// 실행 결과 예시
// 입력받을 숫자의 개수를 입력하세요:3
// 3개의 정수를 입력하세요:
// 1
// 2
// 3
// 입력한 정수의 합계: 6
// 입력한 정수의 평균: 2.0

// 실행 결과 예시 2
// 5개의 정수를 입력하세요:
// 1
// 2
// 3
// 4
// 5
// 입력한 정수의 합계: 15
// 입력한 정수의 평균: 3.0

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("입력받을 숫자의 갯수를 입력하세요: ");
        int index = scanner.nextInt();
        int[] arr = new int [index];

        System.out.println(index + "개의 정수를 입력하세요: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }

        int total = 0;
        for(int num : arr){
            total += num;
        }
        double average = (double)total / index;

        System.out.println("입력한 정수의 합계: " + total);
        System.out.println("입력한 정수의 평균: " + average);

        // 강사 풀이
        System.out.print("입력받을 숫자의 갯수를 입력하세요: ");
        int count = scanner.nextInt();
        int[] numbers = new int [count];

        int sum =0;
        double avg;

        System.out.println(count + "개의 정수를 입력하세요: ");
        for(int i = 0; i < count; i++){
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }

        avg = (double)sum / count;

        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 정수의 평균: " + avg);


    }
}

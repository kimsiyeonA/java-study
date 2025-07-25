package infJava1_1.A_7_Array.ex;

// 문제 - 합계와 평균

// 사용자에게 5개의 정수를 입력받아서 이들 정수의 합계와 평균을 계산하는 프로그램을 작성하자

// 실행 결과 예시
// 5개의 정수를 입력하세요:
// 1
// 2
// 3
// 4
// 5
// 입력한 정수의 합계: 15
// 입력한 정수의 평균: 3.0

import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int[] arr = new int [5];

        System.out.println("5개의 정수를 입력하세요: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }

        int total = 0;
        for(int num : arr){
            total += num;
        }
        double average = (double)total / 5;

        System.out.println("입력한 정수의 합계: " + total);
        System.out.println("입력한 정수의 평균: " + average);

        // 강사 풀이
        int[] numbers = new int [5];
        int sum =0;
        double avg;

        System.out.println("5개의 정수를 입력하세요: ");
        for(int i = 0; i < arr.length; i++){
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }

        avg = (double)sum / 5;

        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 정수의 평균: " + avg);


    }
}

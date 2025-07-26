package infJava1_1.A_7_Array.ex;

// 문제 - 2차원 배열 2

// 사용자로부터 4명 학생의 국어, 수학, 영어 점수를 입력받아
// 각 학생의 총점과 평균을 계산하는 프로그램을 작성하다.

// 실행 결과 예시
// 1번 학생의 성적을 입력하세요:
// 국어 점수:100
// 영어 점수:80
// 수학 점수:70
// 2번 학생의 성적을 입력하세요:
// 국어 점수:30
// 영어 점수:40
// 수학 점수:50
// 3번 학생의 성적을 입력하세요:
// 국어 점수:60
// 영어 점수:70
// 수학 점수:50
// 4번 학생의 성적을 입력하세요:
// 국어 점수:90
// 영어 점수:100
// 수학 점수:80
// 1번 학생의 총점: 250, 평균: 83.33333333333333
// 2번 학생의 총점: 120, 평균: 40.0
// 3번 학생의 총점: 180, 평균: 60.0
// 4번 학생의 총점: 270, 평균: 90.0

// 학생수를 입력하세요:3
// 1번 학생의 성적을 입력하세요:
// 국어 점수:10
// 영어 점수:20
// 수학 점수:30
// 2번 학생의 성적을 입력하세요:
// 국어 점수:10
// 영어 점수:10수학 점수:10
// 3번 학생의 성적을 입력하세요:
// 국어 점수:20
// 영어 점수:20
// 수학 점수:20
// 1번 학생의 총점: 60, 평균: 20.0
// 2번 학생의 총점: 30, 평균: 10.0
// 3번 학생의 총점: 60, 평균: 20.0
import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("학생 수를 입력하세요: ");
        int rowIndex = scanner.nextInt();

        int[][] students = new int [rowIndex][3];

        for(int row = 0; row < students.length; row++){
            System.out.println((row+1) + "번 학생의 성적을 입력하세요: ");
            for(int column = 0; column < students[row].length; column++){
                if(column == 0){
                    System.out.print("국어 점수: ");
                }else if(column == 1){
                    System.out.print("영어 점수: ");
                }else if(column == 2){
                    System.out.print("수학 점수: ");
                }
                students[row][column] = scanner.nextInt();
            }
        }

        int[] scoreTotal = new int [rowIndex];
        for (int row = 0; row < students.length; row++) {
            for (int column = 0; column < students[row].length; column++) {
                scoreTotal[row] += students[row][column];
            }
        }

        for(int i = 0; i < scoreTotal.length; i++){
            System.out.println((i + 1) + "번 학생의 총점: " + scoreTotal[i] + ", 평균: " + ((double)scoreTotal[i]/3));
        }

        // 강사 풀이
        System.out.print("학생 수를 입력하세요: ");
        int studentCount = scanner.nextInt();

        int[][] scores = new int[studentCount][3];
        String[] subjects = {"국어", "영어", "수학"};

        for(int i = 0; i < studentCount; i++){ // 학생
            System.out.println((i+1) + "번 학생의 성적을 입력하세요: ");
            for(int j = 0; j < 3; j++){ // 점수
                System.out.println(subjects[j] + " 점수: ");
                scores[i][j] = scanner.nextInt();
            }
        }

        for(int i = 0; i < studentCount; i++){
            int total = 0;
            for(int j = 0; j < 3; j++){
                total += scores[i][j];
            }
            double average = total / 3.0;
            System.out.println((i+1) + "번 학생의 총점: " + total + " 평균: " + average);
        }
    }
}

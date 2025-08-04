package infJava_A_Start.A_3_Cond.ex;

// 문제 : "학점 계산하기"
// - 90점 이상 : "A"
// - 80점 이상 90점 미만 : "B"
// - 70점 이상 80점 미만 : "C"
// - 60점 이상 70점 미만 : "D"
// - 60점 미만 : "F"
// 점수는  변수 (int score)로 지정하고, 해당 변수를 기반으로 학점을 출력하자

// 출력 예시
// score: 95
// 출력: 학점은 A입니다.
// score: 85
// 출력: 학점은 B입니다.
// score: 75
// 출력: 학점은 C입니다.
// score: 65
// 출력: 학점은 D입니다.
// score: 55
// 출력: 학점은 F입니다.

public class Score {
    public static void main(String[] args) {
        int score = 90;
        String grade;

        if(score < 60){
            grade = "F";
        }else if(score < 70){
            grade = "D";
        }else if(score < 80){
            grade = "C";
        }else if(score < 90){
            grade = "B";
        }else{
            grade = "A";
        }

        System.out.println("학점은 "+ grade +"입니다.");

        /* 강사 풀이 */
        if (score >= 90) {
            System.out.println("학점은 A입니다.");
        }else if (score >= 80){
            System.out.println("학점은 B입니다.");
        }else if (score >= 70){
            System.out.println("학점은 C입니다.");
        }else if (score >= 60){
            System.out.println("학점은 D입니다.");
        }else{
            System.out.println("학점은 F입니다.");
        }
    }
}

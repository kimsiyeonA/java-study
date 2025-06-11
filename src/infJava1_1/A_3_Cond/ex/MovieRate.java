package infJava1_1.A_3_Cond.ex;

// 문제 : "평점에 따른 영화 추천하기"
// 요청한 평점 이상의 영화를 찾아서 추천하는 프로그램
// - 어바웃타임 - 평점 9점
// - 토이스토리 - 평점 8점
// - 고질라 - 평점 7점
// 평점 변수는 (double rating)를 사용하세요. if문을 활용할 것

// 출력 예시
// rating: 9
// 출력:
// '어바웃타임'을 추천합니다.
// rating: 8
// 출력:
// '어바웃타임'을 추천합니다.
// '토이 스토리'를 추천합니다.
// rating: 7.1
// 출력:
// '어바웃타임'을 추천합니다.
// '토이 스토리'를 추천합니다.
// rating: 7
// 출력:
// '어바웃타임'을 추천합니다.
// '토이 스토리'를 추천합니다.
// '고질라'를 추천합니다.

public class MovieRate {
    public static void main(String[] args) {
        double rating = 7;

        if (rating <= 9){
            System.out.println("'어바웃타임'을 추천합니다.");
        }
        if (rating <= 8){
            System.out.println("'토이스토리'를 추천합니다.");
        }
        if (rating <= 7){
            System.out.println("'고질라'를 추천합니다.");
        }

        /* 강사 풀이 */
        // 동일함.
    }
}

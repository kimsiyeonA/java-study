package infJava_B_Basic.A_1_Class.ex;

// 문제 - 영화 리뷰 관리하기1

// 문제 설명
// 당신은 영화 리뷰 정로를 관리하려고 한다.
// 먼저, 영화 리뷰 정보를 담을 수 있는 MovieReview 클래스를 만들어보자

// 요구 사항
// 1. MovieReview 클래스는 다음과 같은 멤버 변수를 포함해야 한다.
//    - 영화 제목(title)
//    - 리뷰 내용(review)
// 2. MovieReviewMain 클래스 안에 main() 메서드를 포함하여, 영화 리뷰 정보를 선언하고 출력하자

// 출력 예시
// 영화 제목: 인셉션, 리뷰: 인생은 무한 루프
// 영화 제목: 어바웃 타임, 리뷰: 인생 시간 영화!
public class MovieReviewMainAnswer {
    public static void main(String[] args) {
        // 영화 리뷰 정보 선언
        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "인생은 무한 루프";

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃 타임";
        aboutTime.review = "인생 시간 영화!";

        // 영화 리뷰 정보 출력

        System.out.println("영화 제목: " + inception.title + ", 리뷰: " + inception.review);
        System.out.println("영화 제목: " + aboutTime.title + ", 리뷰: " + aboutTime.review);

    }
}

package infJava_B_Basic.A_1_Class.ex;

// 문제 - 영화 리뷰 관리하기2

// 기존 문제에 배열을 도입하고 영화 리뷰를 배열에 관리하자.
// 리뷰를 출력할 때 배열과 for 문을 사용해서 System.out.println 을 한번만 사용하자
public class MovieReviewMain2 {
    public static void main(String[] args) {
        // 영화 리뷰 정보 선언
        MovieReview movieReview1 = new MovieReview();
        movieReview1.title = "인셉션";
        movieReview1.review = "인생은 무한 루프";

        MovieReview movieReview2 = new MovieReview();
        movieReview2.title = "어바웃 타입";
        movieReview2.review = "인생 시간 영화!";

        MovieReview[] movieReviews = {movieReview1, movieReview2};

        // 영화 리뷰 정보 출력
        for(MovieReview m : movieReviews){
            System.out.println("영화 제목: " + m.title + ", 리뷰: " + m.review);
        }
    }
}

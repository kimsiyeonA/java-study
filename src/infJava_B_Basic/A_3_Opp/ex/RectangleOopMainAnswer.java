package infJava_B_Basic.A_3_Opp.ex;

// 절차 지향 직사각형 프로그램을 객체 지향으로 변경하기 - 직사각형 실행 클래스

public class RectangleOopMainAnswer {
    public static void main(String[] args) {
        RectangleAnswer rectangle = new RectangleAnswer();
        rectangle.width = 5;
        rectangle.height = 8;

        int area = rectangle.calculateArea();
        System.out.println("넓이: " + area);
        int perimeter = rectangle.calculatePerimeter();
        System.out.println("둘레 길이: " + perimeter);
        boolean square = rectangle.isSquare();
        System.out.println("정사각형 여부: " + square);
    }
}

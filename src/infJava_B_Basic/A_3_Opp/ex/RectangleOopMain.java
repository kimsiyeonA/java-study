package infJava_B_Basic.A_3_Opp.ex;

// 절차 지향 직사각형 프로그램을 객체 지향으로 변경하기 - 직사각형 실행 클래스

public class RectangleOopMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.width = 5;
        rectangle.height = 8;
        rectangle.calculateArea();
        rectangle.calculatePerimeter();
        rectangle.isSquare();
    }
}

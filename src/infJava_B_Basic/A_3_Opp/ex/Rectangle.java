package infJava_B_Basic.A_3_Opp.ex;

// 절차 지향 직사각형 프로그램을 객체 지향으로 변경하기 - 직사각형 클래스
public class Rectangle {
    int width, height, area, perimeter;
    boolean square;

    void calculateArea(){
        area = width * height;
        System.out.println("넓이: " + area);
    }

    void calculatePerimeter(){
        perimeter = 2 * (width + height);
        System.out.println("둘레 길이: " + perimeter);
    }

    void isSquare(){
        square = width == height;
        System.out.println("정사각형 여부: " + square);
    }
}

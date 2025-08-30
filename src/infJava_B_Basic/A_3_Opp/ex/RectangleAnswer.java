package infJava_B_Basic.A_3_Opp.ex;

// 절차 지향 직사각형 프로그램을 객체 지향으로 변경하기 - 직사각형 클래스

public class RectangleAnswer {
    int width, height;


    int calculateArea(){
        return  width * height;
    }

    int calculatePerimeter(){
        return 2 * (width + height);
    }

    boolean isSquare(){
        return width == height;
    }
}

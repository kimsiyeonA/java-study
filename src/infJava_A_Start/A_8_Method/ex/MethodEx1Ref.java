package infJava_A_Start.A_8_Method.ex;

// 문제 - 평균값 리펙토링

// 메서드를 잘 이해하고 있는지 확인하기 위해 다음 코드를 메서드를 사용하도록 리펙토링해보자

public class MethodEx1Ref {
    public static void main(String[] args) {
        average(1,2,3);
        average(15,25,35);
    }

    public static void average(int a, int b, int c){
        int sum = a + b + c;
        double average = sum / 3.0;
        System.out.println("평균값: " + average);
    }
}

package infJava_A_Start.A_7_Array;

// 배열이 필요한 이유

public class Array1 {
    public static void main(String[] args) {
        int student1 = 90;
        int student2 = 80;
        int student3 = 70;
        int student4 = 60;
        int student5 = 50;

        System.out.println("학생1 점수: " + student1);
        System.out.println("학생2 점수: " + student2);
        System.out.println("학생3 점수: " + student3);
        System.out.println("학생4 점수: " + student4);
        System.out.println("학생5 점수: " + student5);

        // 학생을 몇 명 더 추가하는 것은 코딩으로 해결할 수 있지만,
        // 학생을 수백명 이상 추가해야 한다면 코드가 상당히 많이 늘어날것이다.
        // 학생수가 증가함에 따라 선언부와 출력부 코딩 양이 비례해서 증가하는 문제가 있다.
        // 반복문으로 해결할 수 있을것 같지만 점수를 출럭하는 부분을 보면 변수의 이름이 다르기 때문에 반복문으로 적용할 수 없다.

        // 같은 타입의 변수를 반복해서 선언하고 반복해서 사용하는 문제를 해결하는 것이 바로 배열이다.
    }
}

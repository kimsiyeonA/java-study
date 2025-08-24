package infJava_B_Basic.A_2_Ref;

// 변수의 종류, 초기화
// 멤버 변수(필드): 클래스에 선언
// 지역 변수: 메서드에 선언, 매개변수도 지역 변수의 한 종류이다.

// 멤버 변수, 필드 예시
//public class Student {
// String name;
// int age;
// int grade;
//}
//name , age , grade 는 멤버 변수이다.

// 지역 변수 예시
//public class ClassStart3 {
// public static void main(String[] args) {
// Student student1;
// student1 = new Student();
// Student student2 = new Student();
// }
//}
//student1 , student2 는 지역 변수이다.

//public class MethodChange1 {
// public static void main(String[] args) {
// int a = 10;
// System.out.println("메서드 호출 전: a = " + a);
// changePrimitive(a);
// System.out.println("메서드 호출 후: a = " + a);
// }
// public static void changePrimitive(int x) {
// x = 20;
// }
//}
// a , x (매개변수)는 지역 변수이다.
// 지역 변수는 이름 그대로 특정 지역에서만 사용되는 변수라는 뜻이다.
// 예를 들어서 변수 x 는 changePrimitive()
// 메서드의 블록에서만 사용된다.
// changePrimitive() 메서드가 끝나면 제거된다. a 변수도 마찬가지이다.
// main() 메서드가 끝나면 제거된다.

// 변수의 값 초기화
// - 멤버 변수: 자동 초기화
//   - 인스턴스의 멤버 변수는 인스턴스를 생성할 때 자동으로 초기화된다.
//   - 숫자( int )= 0 , boolean = false , 참조형 = null ( null 값은 참조할 대상이 없다는 뜻으로 사용된다.)
//   - 개발자가 초기값을 직접 지정할 수 있다.
// - 지역 변수: 수동 초기화
//   - 지역 변수는 항상 직접 초기화해야 한다.

public class InitData {
    int value1; // 초기화 하지 않음
    int value2 = 10; // 10으로 초기화
}

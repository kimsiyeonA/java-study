package infJava_B_Basic.A_1_Class;

// 클래스에 배열 도입

// 클래스와 객체 덕분에 학생 데이터를 구조적으로 이해하기 쉽게 변경할 수 있었다.
// 이제 각각의 학생 별로 객체를 생성하고, 해당 객체에 데이터를 관리하면 된다.

// 하지만 코드를 보면 아쉬운 부분은 출력하는 부분이다.
// 새로운 학생이 추가 될때마다 출력하는 부분도 함께 추가해야 한다.

// 배열을 사용하면 특정 타입을 연속한 데이터 구조로 몪어서 편리하게 관리할 수 있다.
// Student 클래스를 사용한 변수들도 Student 타입이기 때문에
// 학생도 배열을 사용해서 하나의 데이터 구조로 묶어서 관리할 수 있다.

public class ClassStart4 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        Student[] students = new Student[2];
        students[0] = student1;
        students[1] = student2;

        System.out.println("이름: " + students[0].name + " 나이: " + students[0].age + " 성적: " + students[0].grade);
        System.out.println("이름: " + students[1].name + " 나이: " + students[1].age + " 성적: " + students[1].grade);

    }
    // 배열에 참조값 대입
    // Student students = new Student[2]
    // - Student 변수를 2개를 보관할 수 있는 사이즈 2의 배열을 만든다.
    // - Student 타입의 변수는 Student 인스턴스의 참조값을 보관한다.
    //   Student 배열의 각각의 항목도 Student 타입의 변수일 뿐이다.
    //   따라서 Student 타입의 참조값을 보관한다.
    // - 배열에는 아직 참조값을 대입하지 않았기 때문에 참조값이 없다는 의미의 null(내가 갈 주소가 아직 없어) 값으로 초기화 된다.

    // student[0] = student1;
    // student[1] = student2;

    // 자바에서 대입은 항상 변수에 들어가 있는 값을 복사한다.
    // student[0] = x001;
    // student[1] = x002;

    // student1, student2 에는 참조값이 보관되어 있다.
    // 따라서 이 참조 값이 배열에 저장된다.
    // 또는 student1, student2 에 보관된 참조값을 읽고 복사해서 배열에 대입한다고 표현한다.
    // 자바에서 변수의 대입( = )은 모두 변수에 들어있는 값을 복사해서 전달하는 것이다.
    // 이 경우 오른쪽 변수인 student1 , student2 에는 참조값이 들어있다.
    // 그래서 이 값을 복사해서 왼쪽에 있는 배열에 전달한다.
    // 따라서 기존 student1 , student2 에 들어있던 참조값은 당연히 그대로 유지된다.

    // => 변수에는 인스턴스 자체가 들어있는 것이 아니다! 인스턴스의 위치를 가리키는 참조값이 들어있을 뿐이다!
    // 따라서 대입 ( = )시에 인스턴스가 복사되는 것이 아니라 참조값만 복사된다.

    // 학생1 예제
    // System.out.println(students[0].name); //배열 접근 시작
    // System.out.println(x005[0].name); //[0]를 사용해서 x005 배열의 0번 요소에 접근
    // System.out.println(x001.name); //.(dot)을 사용해서 참조값으로 객체에 접근
    // System.out.println("학생1");

    // 학생2 예제
    // System.out.println(students[1].name); //배열 접근 시작
    // System.out.println(x005[1].name); //[0]를 사용해서 x005 배열의 0번 요소에 접근
    // System.out.println(x001.name); //.(dot)을 사용해서 참조값으로 객체에 접근
    // System.out.println("학생1");
}



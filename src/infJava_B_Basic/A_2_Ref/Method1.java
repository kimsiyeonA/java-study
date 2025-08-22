package infJava_B_Basic.A_2_Ref;

// 메서드에 객체 전달(Class ClassStart3 1차 리펙토링)

public class Method1 {
    public static void main(String[] args) {

        Student student1 = new Student(); // x001
        // student1.name = "학생1";
        // student1.age = 15;
        // student1.grade = 90;
        initStudent(student1,"학생1", 15, 90);// x001

        Student student2 = new Student(); // x002
        // student2.name = "학생2";
        // student2.age = 16;
        // student2.grade = 80;
        initStudent(student2,"학생2", 16, 80); // x002

        // System.out.println("이름: " + student1.name + " 나이: " + student1.age + " 성적: " + student1.grade);
        // System.out.println("이름: " + student2.name + " 나이: " + student2.age + " 성적: " + student2.grade);
        printStudent(student1);
        printStudent(student2);
    }

    static void initStudent(Student student, String name,int age, int grade){// x001 // x002
        student.name = name;
        student.age = age;
        student.grade = grade;
        // student1 이 참조하는 Student 인스턴스에 값을 편리하게 할당하고 싶어서 initStudent() 메서드를 만들었다.
        // 이 메서드를 호출하면서 student1 을 전달한다.
        // 그러면 student1 의 참조값이 매개변수 student 에 전달된다.
        // 이 참조값을 통해 initStudent() 메서드 안에서 student1 이 참조하는 것과 동일한 x001 Student
        // 인스턴스에 접근하고 값을 변경할 수 있다.
    }

    static void printStudent(Student student){
        System.out.println("이름: " + student.name + " 나이: " + student.age + " 성적: " + student.grade);
    }

    // 참조형은 메서드를 호출할 때 참조값을 전달한다.
    // 따라서 메서드 내부에서 전달된 참조값을 통해 객체의 값을 변경하거나, 값을 읽어서 사용할 수 있다.
    // - initStudent(Student student, ...) : 전달한 학생 객체의 필드에 값을 설정한다.
    // - printStudent(Student student, ...) : 전달한 학생 객체의 필드 값을 읽어서 출력한다.

    // import class1.Student; 이 선언되어 있으면 안된다.
    // 이렇게 되면 class1 패키지에서 선언한 Student 를 사용하게 된다.
    // 이 경우 접근 제어자 때문에 컴파일 오류가 발생한다.
    // 만약 선언되어 있다면 삭제하자. 삭제하면 같은 패키지에 있는 ref.Student 를 사용한다.
}



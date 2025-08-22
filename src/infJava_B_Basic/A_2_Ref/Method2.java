package infJava_B_Basic.A_2_Ref;

// 메서드에 객체 반환(Class ClassStart3 2차 리펙토링)

public class Method2 {
    public static void main(String[] args) {

        // Student student1 = new Student(); // x001
        // initStudent(student1,"학생1", 15, 90);// x001
        Student student1 = createStudent("학생1", 15, 90);
        // 메서드 내부에서 인스턴스를 생성한 후에 참조값을 메서드 외부로 반환했다.
        // 이 참조값만 있으면 해당 인스턴스에 접근할 수 있다. 여기서는 student1 에 참조값을 보관하고 사용한다.

        // 진행 과정
        // Student student1 = createStudent("학생1", 15, 90) //메서드 호출후 결과 반환
        // Student student1 = student(x001) //참조형인 student를 반환
        // Student student1 = x001 //student의 참조값 대입
        // student1 = x001

        // createStudent() 는 생성한 Student 인스턴스의 참조값을 반환한다.
        // 이렇게 반환된 참조값을 student1 변수에 저장했다.
        // 앞으로는 student1 을 통해 Student 인스턴스를 사용할 수 있다

        // Student student2 = new Student(); // x002
        // initStudent(student2,"학생2", 16, 80); // x002
        Student student2 = createStudent("학생2", 16, 80);

        printStudent(student1);
        printStudent(student2);
    }

    // 생성되고 나면 생성된 건 반환되고 메서드안에 있는 값은 사라진다.
    // 다시 호출하면 새로운 호출로 재생성 된다.
    static Student createStudent(String name, int age, int grade){
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student;

        // createStudent() 라는 메서드를 만들고 객체를 생성하는 부분도 이 메서드안에 함께 포함했다.
        // 이제 이 메서드 하나로 객체의 생성과 초기값 설정을 모두 처리한다.
        // 그런데 메서드 안에서 객체를 생성했기 때문에 만들어진 객체를 메서드 밖에서 사용할 수 있게 돌려주어야 한다.
        // 그래야 메서드 밖에서 이 객체를 사용할 수 있다.
        // 메서드는 호출 결과를 반환( return )을 할 수 있다.
        // 메서드의 반환 기능을 사용해서 만들어진 객체의 참조값을 메서드 밖으로 반환하면 된다.
    }

    static void initStudent(Student student, String name,int age, int grade){// x001 // x002
        // 초기화 생성
        student.name = name;
        student.age = age;
        student.grade = grade;
    }

    static void printStudent(Student student){
        System.out.println("이름: " + student.name + " 나이: " + student.age + " 성적: " + student.grade);
    }

 }



package infJava_B_Basic.A_1_Class;

// 클래스에 배열 - 리펙토링

public class ClassStart5 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        Student[] students = {student1, student2};

        for(int i = 0; i < students.length; i++){
            System.out.println("이름: " + students[i].name + " 나이: " + students[i].age + " 성적: " + students[i].grade);
        }

        for(int i = 0; i < students.length; i++){
            Student s = students[i]; // 학생의 참조값을 껴내서 만들어 코드의 길일을 줄어들게 함. 담아두고 씀
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);
        }

        for(Student s : students){
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);
        }
    }

    // 배열 선언 최적화
    // 일반적인 변수와 동일하게 배열을 생성할 때 포함할 수 있다.
    // Student[] students = new Student[]{student1, student2};
    // Student[] students = {student1, student2}; 생성과 선언 동시 최적화

    // students[i]를 자주 접근하는 것이 번거롭다면 반복해서 사용하는 개개체를 Student s와 같은 변수에 담아두고 사용해도 된다.
    // 향상된 for 문을 사용하는 것이 가장 깔끔하다.

}



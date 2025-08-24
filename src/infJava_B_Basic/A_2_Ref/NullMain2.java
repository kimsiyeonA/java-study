package infJava_B_Basic.A_2_Ref;

// NullPointerException

// 만약 참조값 없이 객체를 찾아간다면?
// 이 경우 NullPointerException 이라는 예외가 발생함, 개발자를 가장 많이 괴롭히는 예외이다.
// NullPointerException 은 이름 그대로 null 을 가리키다(Pointer)인데,
// 이때 발생하는 예외(Exception)다.
// null 은 없다는 뜻이므로 결국 주소가 없는 곳을 찾아갈 때 발생하는 예외이다.
// 객체를 참조할 때는 . (dot)을 사용한다.
// 이렇게 하면 참조값을 사용해서 해당 객체를 찾아갈 수 있다.
// 그런데 참조값이 null 이라면 값이 없다는 뜻이므로, 찾아갈 수 있는 객체(인스턴스)가 없다.
// NullPointerException 은 이처럼 null 에 . (dot)을 찍었을 때 발생한다.
public class NullMain2 {
    public static void main(String[] args) {
        Data data = null;
        data.value = 10; // NullPointerException
        System.out.println("data = " + data.value);
    }

    // data.value = 10
    // null.value = 10 //data 에는 null 값이 들어있다.

    // 결과적으로 null 값은 참조할 주소가 존재하지 않는다는 뜻이다.
    // 따라서 참조할 객체 인스턴스가 존재하지 않으므로
    // 다음과 같이 java.lang.NullPointerException 이 발생하고,
    // 프로그램이 종료된다. 참고로 예외가 발생했기
    // 때문에 그 다음 로직은 수행되지 않는다.
}

package infJava1_1.A_8_Method;

// 메서드 정의

// public static int add (int a, int b){
//      // 메세지 본문, 실행 코드
// }

// 제어자 반환타입 메서드 이름(매개변수 목록){
//      메서드 본문
// }

// 제어자(Modifier): public , static 과 같은 부분이다.
// 반환 타입(Return Type): 메서드가 실행 된 후 반환하는 데이터의 타입을 지정한다.
//   메서드가 값을 반환하지 않는 경우, 없다는 뜻의 void 를 사용해야 한다.
//   예) void print(String str) -> 출력만 하고 값을 반환하지 않음
// 메서드 이름(Method Name): 메서드의 이름이다.
//   이 이름은 메서드를 호출하는 데 사용된다.
// 매개변수(Parameter): 입력 값으로, 메서드 내부에서 사용할 수 있는 변수이다.
//   매개변수는 옵션이다. 입력값이 필요 없는 메서드는 매개변수를 지정하지 않아도 된다. 예) add()
// 메서드 본문(Method Body): 실제 메서드의 코드가 위치한다.
//   중괄호 {} 사이에 코드를 작성한다.

public class Method2 {
    public static void main(String[] args) {
        // 매개 변수가 없거나 반환 타입도 없는 경우
        printHeader();
        System.out.println("프로그램이 동작합니다");
        printFooter();
    }

    public static void printHeader(){
        System.out.println("= 프로그램을 시작합니다 =");
        return; // void 에서는 생략 가능, 생략하면 자바가 알아서 넣어줌 > return 을 마주치면 멈춤
    }

    public static void printFooter(){
        System.out.println("= 프로그램을 종료합니다 =");
    }

    // 매개변수가 없는 경우
    // 선언: public static void printHeader() 와 같이 매개변수를 비워두고 정의하면 된다.
    // 호출: printHeader(); 와 같이 인수를 비워두고 호출하면 된다.

    // 반환 타입이 없는 경우
    // 선언: public static void printHeader() 와 같이 반환 타입을 void 로 정의하면 된다.
    // 호출: printHeader(); 와 같이 반환 타입이 없으므로 메서드만 호출하고 반환 값을 받지 않으면 된다.
    //      String str = printHeader(); 반환 타입이 void 이기 때문에 이렇게 반환 값을 받으면 컴파일 오류가 발생한다.

    // void와 return 생략
    // 모든 메서드는 항상 return 을 호출해야 한다.(대전제)
    // 그런데 반환 타입 void 의 경우에는 예외로 printFooter() 와 같이 생략해도 된다.
    // 자바가 반환 타입이 없는 경우에는 return 을 마지막줄에 넣어준다.
    // 참고로 return 을 만나면 해당 메서드는 종료된다.
}

package infJava1_1.A_5_Scope_Casting;

// 스코프 존재 이유

public class Scope3_1 {
    public static void main(String[] args) {
        int m = 10;
        int temp = 0;
        if (m > 0) {
            temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }
    // 조건이 맞으면 변수 m의 값을 2배 증가해서 출력하는 코드이다.
    // 2배 증가한 값을 저장해두기 위해 임시 변수 temp를 사용했다.
    // 이 코드는 좋은 코드라고 보기 어렵다.
    // 임시 변수 temp는 if 조건이 만족할 때 임시로 잠깐 사용하는 변수이다.
    // 임시 변수 temp main() 코드 블록에 선언 되었다.

    // 문제
    // 1. 비효율적 메모리 사용
    //    main() 코드 블록이 종료될 때꺼지 매모리에 유지된다. 따라서 불필요한 메모리가 낭비된다.
    // 2. 코드 복잡성 증가
    //    만약 if 코드 블록 안에 temp를 선언했다면 if가 끝나고 나면 temp에 대해 전혀 생각하지 않아도 된다.
    //    지금 작성한 코드는 if 코드 블록이 끝나도 main() 어디서나 temp를 접근할 수 있다.
    //    누군가 유지보수를 할때 m과 tamp 모두 신경써야한다. 영역이 불필요하게 넓다.

    //if문 안에서만 잠깐 사용하는 변수를 main 영역의 변수로 선언하는 것은 비효율적이다.
}

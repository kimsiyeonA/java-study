package infJava_A_Start.A_5_Scope_Casting;

// 스코프 존재 이유 - 고려 할 경우

public class Scope3_2 {
    public static void main(String[] args) {
        int m = 10;
        if (m > 0) {
            int temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
        //  System.out.println("temp = " + temp); // if문 영역에서 temp가 제거되었기 때문에 사용이 불가하다.
    }

    // while vs for 스코프 비교(loop While2_3 vs For2)
    // while 문의 경우 변수 i의 스코프가 main()메서드 전체가 된다.
    // 반면에 for문의 경우는 변수 i의 스코프가 for문 안으로 한정된다.
    // 따라서 변수 i의 값이 for문 안에서만 사용되는 카운터 변수가 있다면 while문 보다는 for문을 사용해서
    // 스코프의 범위를 제한하는 것이 메모리 사용과 유지보수 관점에서 더 좋다

    // 정리
    // 변수는 꼭 필요한 범위로 한정해서 사용하는 것이 좋다.
    // 변수의 스코프는 꼭 필요한 곳으로 한정해서 사용하자.
    // 메모리를 효율적으로 사용하고 더 유지보수 하기 좋은 코드를 만들 수 있다.
    // 좋은 프로그램은 무한한 자유가 있는 프로그램이 아니라 적절한 제약이 있는 프로그램이다.
}

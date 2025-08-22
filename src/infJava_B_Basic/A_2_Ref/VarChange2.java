package infJava_B_Basic.A_2_Ref;

// 참조형과 변수 대입

public class VarChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA;
        // 변수의 대입은 변수에 들어있는 값을 복사해서 대입한다.
        // 변수 dataA 에는 참조값 x001 이 들어있다.
        // 여기서는 변수 dataA 에 들어있는 참조값 x001 을 복사해서 변수 dataB 에 대입한다.
        // 참고로 변수 dataA 가 가리키는 인스턴스를 복사하는 것이 아니다! 변수에 들어있는 참조값만 복사해서 전달한다.
        // 이제 dataA 와 dataB 에 들어있는 참조값은 같다. 따라서 둘다 같은 x001 Data 인스턴스를 가리킨다

        System.out.println("dataA 참조값= " + dataA); // Data@2f4d3709
        System.out.println("dataB 참조값= " + dataB); // Data@2f4d3709
        System.out.println("dataA.value = " + dataA.value); // 10
        System.out.println("dataB.value = " + dataB.value); // 10

        // dataA 변경
        dataA.value = 20;
        // dataA.value = 20 코드를 실행하면 dataA 가 가리키는 x001 인스턴스의 value 값을 10 에서 20 으로 변경한다.
        // 그런데 dataA 와 dataB 는 같은 x001 인스턴스를 참조하기 때문에 dataA.value 와 dataB.value 는 둘다 같은 값인 20 을 출력한다.
        System.out.println("변경 dataA.value = 20");
        System.out.println("dataA.value = " + dataA.value); // 20
        System.out.println("dataB.value = " + dataB.value); // 20

        // dataB 변경
        dataB.value = 30;
        // dataB.value = 20 코드를 실행하면 dataA 가 가리키는 x001 인스턴스의 value 값을 10 에서 20 으로 변경한다.
        // 그런데 dataA 와 dataB 는 같은 x001 인스턴스를 참조하기 때문에 dataA.value 와 dataB.value 는 둘다 같은 값인 20 을 출력한다.
        System.out.println("변경 dataB.value = 20");
        System.out.println("dataA.value = " + dataA.value); // 30
        System.out.println("dataB.value = " + dataB.value); // 30

        // 핵심은 Data dataB = dataA 라고 했을 때 "변수에 들어있는 값"을 복사해서 사용한다는 점이다.
        // 그런데 그값이 참조값이다.
        // 따라서 dataA 와 dataB 는 같은 참조값을 가지게 되고, 두 변수는 같은 객체 인스턴스를 참조하게 된다.

    }
}

package infJava_B_Basic.A_2_Ref;

// 멤버 변수와 null

public class NullMain3 {
    public static void main(String[] args) {
        BigData bigData = new BigData(); // x001
        System.out.println("bigData.count= " + bigData.count); // 0
        // System.out.println("bigData.data= " + bigData.data ); // null

        // NullPointerException
        // System.out.println("bigData.data.value= " + bigData.data.value ); // null에 .을 찍어서 예외가 터짐
    }

    // BigData 를 생성하면 BigData 의 인스턴스가 생성된다.
    // 이때 BigData 인스턴스의 멤버 변수에 초기화가 일어나는데,
    // BigData 의 data 멤버 변수는 참조형이므로 null 로 초기화 된다.
    // count 멤버 변수는 숫자이므로 0 으로 초기화된다.

    // - bigData.count 를 출력하면 0 이 출력된다.
    // - bigData.data 를 출력하면 참조값인 null 이 출력된다.
    //   이 변수는 아직 아무것도 참조하고 있지 않다.
    // - bigData.data.value 를 출력하면 data 의 값이 null 이므로 null 에 . (dot)을 찍게 되고,
    //   따라서 참조할 곳이 없으므로 NullPointerException 예외가 발생한다

    // 예외 발생 과정
    // bigData.data.value
    // x001.data.value //bigData는 x001 참조값을 가진다.
    // null.value //x001.data는 null 값을 가진다.
    // NullPointerException //null 값에 .(dot)을 찍으면 예외가 발생한다.

}

package infJava_B_Basic.A_2_Ref;

// bigData.data.value NullPointerException 해결

public class NullMain4 {
    public static void main(String[] args) {
        BigData bigData = new BigData(); // x001
        bigData.data = new Data(); // 이렇게 선언하면 NullPointerException 해결됨
        System.out.println("bigData.count= " + bigData.count); // 0
        System.out.println("bigData.data= " + bigData.data ); // null
        System.out.println("bigData.data.value= " + bigData.data.value ); // null에 .을 찍어서 예외가 터짐
    }

    // NullPointerException 이 발생하면 null 값에 . (dot)을 찍었다고 생각하면 문제를 쉽게 찾을 수 있다.

}

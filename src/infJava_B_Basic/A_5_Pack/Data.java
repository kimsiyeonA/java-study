package infJava_B_Basic.A_5_Pack;

// 패키지 사용 1 - Pack.Data.java

public class Data {
    public Data(){
        System.out.println("패키지 infJava_B_Basic.A_5_Pack Data 생성");
    }
}

// 패키지를 사용하는 경우 항상 코드 첫줄에 package infJava_B_Basic.A_5_Pack; 과 같이 패키지 이름을 적어주어야 한다.
// 여기서는 pack 패키지에 Data 클래스를 만들었다.
// 이후에 Data 인스턴스가 생성되면 생성자를 통해 정보를 출력한다
// 보통 IDE 가 자동으로 적어주는데 안 맞는다면 적어줘야 한다.
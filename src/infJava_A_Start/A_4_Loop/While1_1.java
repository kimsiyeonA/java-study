package infJava_A_Start.A_4_Loop;

// 반복문 : 특정 코드를 반복해서 실행할때 사용
// 자바는 3가지 종류의 반복문이 있음 => while, do-while, if

public class While1_1 {
    public static void main(String[] args) {
        // 반복문이 필요한 이유
        int count = 0;

        count++; //count = count + 1;
        System.out.println("현재 숫자는: "+count);
        count++; //count = count + 1;
        System.out.println("현재 숫자는: "+count);
        count++; //count = count + 1;
        System.out.println("현재 숫자는: "+count);

        // 같은 코드가 반복되고 있고 100개 반복이 필요하나면 똑같은 코드 00개를 써야한다.
        // 특정 코드를 반복해서 실행할 때 사용하는 것이 반복문

    }
}

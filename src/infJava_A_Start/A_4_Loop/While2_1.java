package infJava_A_Start.A_4_Loop;

// while 2 누적합계
public class While2_1 {
    public static void main(String[] args) {
        int sum = 0;
        sum = sum + 1;
        System.out.println("i="+1+" sum="+sum);
        sum = sum + 2;
        System.out.println("i="+2+" sum="+sum);
        sum = sum + 3;
        System.out.println("i="+3+" sum="+sum);

        // 변경에 유연하지 않다.
        // 변수를 사용해서 더 변경하기 쉬운 코드로 만들수 있다.
        // 변경되는 부분을 변수 i로 바꾼다.


    }
}

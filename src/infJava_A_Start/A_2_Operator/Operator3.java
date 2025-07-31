package infJava_A_Start.A_2_Operator;

// 연산자 우선순위
public class Operator3 {
    public static void main(String[] args) {
        int sum1 = 1 + 2 * 3;   //1 + (2 * 3) > 괄호 우선순위가 높음
        int sum2 = (1 + 2) * 3;
        System.out.println("sum1 = " + sum1);
        System.out.println("sum2 = " + sum2);
    }
}

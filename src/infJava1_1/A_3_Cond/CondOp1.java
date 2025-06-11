package infJava1_1.A_3_Cond;

// 삼항연산자 1
public class CondOp1 {
    public static void main(String[] args) {
        int age = 18;
        String status;
        if (age >= 18) {
            status = "성인";
        } else {
            status = "미성년자";
        }
        System.out.println("age = " + age + "status = " + status);

        // 두 결과, 참과 거짓에 따라 특정 값을 구하는 경우
        // 삼항연산자 또는 조건연산자라고 불리는 ?: 연산자를 사용할 수 있음
        // 코드를 단순화 할 수 있음
    }
}

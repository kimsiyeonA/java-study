package infJava_A_Start.A_3_Cond;

// 삼항연산자 2
public class CondOp2 {
    public static void main(String[] args) {
        int age = 18;
        String status = (age >= 18) ? "성인" : "미성년자";
        System.out.println("age = " + age + "status = " + status);

        // 참이면 성인, 거짓이며 미성년자가 들어감

        // (조건) ? 참_표현식 : 거짓_표현식

        // 삼항연산자는 항이 3개라는 뜻 -> 조건, 참_표현식, 거짓_표현식
        // 특정조건에 따라 결과가 나오기 때문에 조건 연산자라고도 함
        // 조건에 만족하면 참_표현식이 실행되고, 조건에 만족하지 않으면 거짓_표현식이 실행된다.
        // 단순한 표현식만 넣을 수 있음
        

    }
}

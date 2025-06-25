package infJava1_1.A_4_Loop;

// break
// 반복문에서 사용할 수 있는 키워드
// 반복문을 즉시 종료하고 나간다.
// while, do-while, for 와 같은 모든 반복문에서 사용할 수 있다.

public class Break1 {
    public static void main(String[] args) {
        // break
        // while (조건식){
        //      코드1;
        //      break; // 즉시 whlie 문 종료로 이동한다.
        //      코드2;
        // }
        // while 문 종료
        // 코드2가 실행되지 않고 while문이 종료된다.

        int sum = 0;
        int i = 1;

        while(true){
            sum += i;
            if(sum > 10){
                System.out.println("합이 10보다 크면 종료: i="+i+", sum="+sum);
                break;
            }
            i++;
        }
        // 조건식이 항삼 참이기 때문에 무한반복된다. 하지만 break문이 있어서 중간에 빠져나온다.
        // sum > 10조건을 만족하면 결과를 출력하고 break를 사용해서 whlie문을 빠져나간다.
        // 조건문에는 영향을 주지 않는다



    }
}

package infJava1_1.A_8_Method;

// 반환 타입

// 반환 타입이 있으면 반드시 값을 반환해야 한다.
// 반환 타입이 있는 메서드는 반드시 return을 사용해서 값을 반환해야 한다.
// 조건문과 함께 사용할 때 주의해야한다.
public class Method3Return1 {
    public static void main(String[] args) {
        boolean result = ood(2);
        System.out.println(result);
    }

    public static boolean ood(int i){ // 홀짝 판별
        if(i % 2 == 1){
            return true;
        }else{
            return false;
        }
    }

//    public static boolean ood(int i){ // 홀짝 판별
//        if(i % 2 == 1){
//            return true;
//        }
//    }

    // false 일때의 반환값이 없기에 컴파일 오류가 남
    // if 조건이 만족할 때는 true 가 반환되지만, 조건을 만족하지 않은 경우에는 return 문이 실행되지 않는다.
    // 따라서 이 코드를 실행하면 return 문을 누락했다는 컴파일 오류가 발생한다.
    // 컴파일 오류
    // java: missing return statement

    // else를 통해 조건을 만족하지 않아도 return 문이 실행되게 된다.
}

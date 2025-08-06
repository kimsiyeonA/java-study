package infJava_A_Start.A_4_Loop;

// for 문

public class For3 {
    public static void main(String[] args) {
        // for 문
        // for{초기식;조건식;증감식){
        //  // 코드
        // }
        // 초기식, 조건식, 증감식은 선택, 각 영역을 구분하는 세미콜론(;)은 필수이다.

        // for{;;){
        //  // 코드
        // }
        // 조건이 없기 때문에 무한반복 됨 while(true){}와 동일

        // 내가 미리 푼 문제
        // int sum = 0;

        // for(int i = 1; ; i++){
        //    sum += i;
        //    if(sum > 10){
        //        System.out.println("합이 10보다 크면 종료: i="+i+" sum="+sum);
        //        break;
        //    }
        // }

        int i = 1;
        int sum = 0;
        for(; ; ){
            sum += i;
            if(sum > 10){
                System.out.println("합이 10보다 크면 종료: i="+i+" sum="+sum);
                break;
            }
            i++;
        }

    }
}

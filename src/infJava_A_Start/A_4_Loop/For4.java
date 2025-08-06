package infJava_A_Start.A_4_Loop;

// for 문

public class For4 {
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

        // 조건을 for문 안으로 넣음
        int sum = 0;

         for(int i = 1; ; i++){ // i는 안에서만 쓸 수 있고 밖에서는 쓸 수없음
            sum += i;
            if(sum > 10){
                System.out.println("합이 10보다 크면 종료: i="+i+" sum="+sum);
                break;
            }
         }

        // => 카운터 변수가 명확하거나, 반복 횟수가 정해진 경우에는 for문을 사용하는것이 구조적으로 깔끔하고 유지보기 하기 좋음
        


    }
}

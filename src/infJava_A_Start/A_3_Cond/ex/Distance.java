package infJava_A_Start.A_3_Cond.ex;

// 문제 : "거리에 따른 운송수단 선택하기"
// 주어진 거리에 따라 가장 적합한 운송수단을 선택하는 프로그램
// - 거리가 1km 이하이면 : "도보"
// - 거리가 10km 이하이면 : "자전거"
// - 거리가 100km 이하이면 : "자동차"
// - 거리가 100km 초과이면 : "비행기"
// 거리는 변수 (int distance)로 지정하고, 해당 변수를 기반으로 운송수단을 출력하자

// 출력 예시
// distance: 1
// 출력: 도보를 이용하세요.
// distance: 5
// 출력: 자전거를 이용하세요.
// distance: 25
// 출력: 자동차를 이용하세요.
// distance: 150
// 출력: 비행기를 이용하세요.

public class Distance {
    public static void main(String[] args) {
        int distance = 500;
        String transport;

        if(distance <= 1) {
            transport = "도보";
        }else if(distance <= 10){
            transport = "자전거";
        }else if(distance <= 100) {
            transport = "자동차";
        }else{
            transport = "비행기";
        }

        System.out.println(transport + "를 이용하세요.");

        /* 강사 풀이 */
        if(distance <= 1){
            System.out.println("도보를 이용하세요.");
        }else if(distance <= 10){
            System.out.println("자전거를 이용하세요.");
        }else if(distance <= 100){
            System.out.println("자동차를 이용하세요.");
        }else{
            System.out.println("비행기를 이용하세요.");
        }
    }
}

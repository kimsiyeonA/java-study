package infJava_B_Basic.A_3_Opp;

// 객체 지향 프로그래밍 - 음악 플레이어 클래스

public class MusicPlayer {
    int volume = 0;
    boolean isOn = false;

    void on(){
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    void off(){
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    void volumeUp(){
        volume++;
        System.out.println("음악 플레이어 볼룸: " + volume);
    } // 내부에서 볼륨을 높임

    void volumeDown( ){
        volume--;
        System.out.println("음악 플레이어 볼룸: " + volume);
    }

    void showStatus( ){
        System.out.println("음악 플레이어 상태 확인");
        if(isOn){
            System.out.println("음악 플레이어 ON, 볼륨: " + volume );
        }else{
            System.out.println("음악 플레이어 OFF");
        }
    }
}
// MusicPlayer 클래스에 음악 플레이어에 필요한 속성과 기능을 모두 정의했다.
// 음악 플레이어가 필요한 곳에서 이 클래스만 있으면 온전한 음악 플레이어를 생성해서 사용할 수 있다.
// 음악 플레이어를 사용하는데 필요한 모든 속성과 기능이 하나의 클래스에 포함되어 있다!
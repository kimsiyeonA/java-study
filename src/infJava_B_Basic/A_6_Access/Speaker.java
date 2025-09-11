package infJava_B_Basic.A_6_Access;

// 접근 제어자 이해1

// 자바는 public , private 같은 접근 제어자(access modifier)를 제공한다.
// 접근 제어자를 사용하면 해당 클래스 외부에서 특정 필드나 메서드에 접근하는 것을 허용하거나 제한할 수 있다.

// 접근 제어자가 왜 필요할까? 예제를 통해 알아보자

// 스피커에 들어가는 소프트웨어를 개발하는 개발자다.
// 스피커의 음량은 절대로 100을 넘으면 안된다는 요구사항이 있다.
// (100을 넘어가면 스피커의 부품들이 고장난다.)
// 스피커 객체를 만들어보자.
// 스피커는 음량을 높이고, 내리고, 현재 음량을 확인할 수 있는 단순한 기능을 제공한다.
// 요구사항 대로 스피커의 음량은 100까지만 증가할 수 있다. 절대 100을 넘어가면 안된

public class Speaker {
    private int volume; // 클래스 안에서만 접근할 수 있다.

    Speaker(int volume){
        if(volume>100){
            System.out.println("100 초과의 음량이 들어갈 수 없습니다. 음량 0으로 조정합니다.");
        }else{
            this.volume = volume;
        }
    }

    void volumeUp(){
        if(volume >= 100){
            System.out.println("음량을 증가할 수 없습니다. 최대 음량입니다.");
        }else{
            volume += 10;
            System.out.println("음량을 10 증가합니다.");
        }
    }

    void volumeDown(){
        volume -= 10;
        System.out.println("음략을 10 감소합니다.");
    }

    void showVolume(){
        System.out.println("현재 음량: " + volume);
    }
}

// 생성자를 통해 초기 음량 값을 지정할 수 있다.
// volumeUp() 메서드는 음량을 한번에 10씩 증가한다.
// 단 음량이 100을 넘게되면 더는 음량을 증가하지 않는다

// --------
// 문제를 근본적으로 해결하는 방법은 volume 필드를 Speaker 클래스 외부에서는 접근하지 못하게 막는 것이다.
// volume 필드에 private 를 붙인다.
// private 접근 제어자는 모든 외부 호출을 막는다.
// 따라서 private 이 붙은 경우 해당 클래스 내부에서만 호출할 수 있다.

// volume 필드를 private 을 사용해서 Speaker 내부에 숨겼다.
// 외부에서 volume 필드에 직접 접근할 수 없게 막은 것이다.
// volume 필드는 이제 Speaker 내부에서만 접근할 수있다
package infJava_B_Basic.A_6_Access;

// 접근 제어자 이해1

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker  = new Speaker(90);
        speaker.showVolume();

        speaker.volumeUp(); // +10 100
        speaker.showVolume();

        speaker.volumeUp(); // 증가 할 수 없음 문구 출력
        speaker.showVolume();

        // 필드에 직접 접근해서 소리 키우기
        System.out.println("volume 필드 직접 접근 수정");
        //speaker.volume = 200;
        speaker.showVolume(); // 폭발

    }
}
// 핵심은 100을 증가할 수 없게 만드는 것

// 음량을 높이는 메서드를 여러번 호출해도 음량을 100을 넘기지 않도록 설정했다.

// 업그레이드 된 다음 버전의 스피커를 출시하게 되었다.
// 이때는 새로운 개발자가 급하게 기존 코드를 이어받아서 개발을 하게 되었다.
// 참고로 새로운 개발자는 기존 요구사항을 잘 몰랐다.

// 코드를 실행해보니 이상하게 음량이 100이상 올라가지 않았다.
// 소리를 더 올리면 좋겠다고 생각한 개발자는 다양한 방면으로 고민했다.
// Speaker 클래스를 보니 volume 필드를 직접 사용할 수 있었다.
// volume 필드의 값을 200으로 설정하고 이 코드를 실행한 순간 스피커의 부품들에 과부하가 걸리면서 폭발했다

// Speaker 객체를 사용하는 사용자는 Speaker 의 volume 필드와 메서드에 모두 접근할 수 있다.
// volumeUp() 과 같은 메서드를 만들어서 음량이 100을 넘지 못하도록 기능을 개발했지만 소용이 없다.
// 왜냐하면 Speaker 를 사용하는 입장에서는 volume 필드에 직접 접근해서 원하는 값을 설정할 수 있기 때문이다.
// 이런 문제를 근본적으로 해결하기 위해서는 volume 필드의 외부 접근을 막을 수 있는 방법이 필요하다.

// ---------------------
// private 붙인 후
// speaker.volume = 200 부분에 오류가 발생하는 것을 확인할 수 있다.
// volume has private access in access.Speaker
// volume 필드는 private 으로 설정되어 있기 때문에 외부에서 접근할 수 없다는 오류이

// 이제 Speaker 외부에서 volume 필드에 직접 접근하는 것은 불가능하다.
// 이 경우 자바 컴파일러가 컴파일 오류를 발생시킨다.

// 만약 Speaker 클래스를 개발하는 개발자가 처음부터 private 을 사용해서 volume 필드의 외부 접근을 막아두었다면 어떠했을까?
// 새로운 개발자도 volume 필드에 직접 접근하지 않고, volumeUp() 과 같은 메서드를 통해서 접근했을 것이다.
// 결과적으로 Speaker 가 폭발하는 문제는 발생하지 않았을 것이다.
// 참고: 좋은 프로그램은 무한한 자유도가 주어지는 프로그램이 아니라 적절한 제약을 제공하는 프로그램이다.

// 메서드를 통해서 필드와 접근하는 데이터를 통제할 수 있다는 장점이 있다.
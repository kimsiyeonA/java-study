package awsJava.javaBasic;

import javax.sound.midi.Soundbank;

public class A008_if {

    public static void main(String[] args) {
        int age = 20;
        System.out.println("당신의 나이 : "+age);

        // 숫자에 따라서 하나만 실행시키고 싶은 것
        // if(조건식){
        //     실행할 명령어
        // }

        if(age >= 20){
            System.out.println("성인");
        }
        if(age < 20){
            System.out.println("미성년자");
        }



    }
}
/*
 * if문
 * 노란줄은 warining  항상참인데 왜해? 같은 느낌
 * 조건식이 거짓일때는 실행하지 않고 참일 때만 실행한다.
 *
 * 사칙연산로 연결되어 있으면 숫자로 나옴
 * 비교안산자로 연결되어 있으면 참거짓으로 나옴 => false/true => boolean
 *
 */

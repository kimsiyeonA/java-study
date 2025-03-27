package awsJava.javaBasic.exam;
// 문제 : 할인 대상인지 아닌지 출력해주세요.
// 조건 : 나이가 19세 이하이거나 60세 이상이면 할인 대상입니다.
// 조건 : 출력예시 처럼 출력되어야 합니다.
// 조건 : `구현시작` 부분만 수정 할 수 있습니다.
// 조건 : 4가지 이상의 방법으로 풀어야 합니다.
// 조건 : 그 중 2가지 방법은 `&&, ||`없이 풀어야 합니다.
public class A010_1_else {
    public static void main(String[] args) {
        int age = 60; // 이 값을 바꿔가면서 실행해보세요.

        System.out.println("당신의 나이는 " + age + "살 입니다.");

        // 구현시작
        System.out.println("=====v1=====");
        if(age <= 0){
            System.out.println("할인대상 아님");
        }
        else if(age <= 19){
            System.out.println("할인대상");
        }
        else if(age <= 59){
            System.out.println("할인대상 아님");
        }
        else if(age >= 60){
            System.out.println("할인대상");
        }

        System.out.println("=====v2=====");
        if(age <= 0){
            System.out.println("할인대상 아님");
        }
        else if(age > 19 && age <= 59){
            System.out.println("할인대상 아님");
        }
        else {
            System.out.println("할인대상");
        }

        System.out.println("=====v3=====");
        if(age <= 19){
            System.out.println("할인대상");
        }
        else if(age >= 60){
            System.out.println("할인대상");
        }
        else {
            System.out.println("할인대상 아님");
        }

        System.out.println("=====v4=====");
        if(age > 1 && age <= 19){
            System.out.println("할인대상");
        }
        else if(age >= 60){
            System.out.println("할인대상");
        }
        else {
            System.out.println("할인대상 아님");
        }


        // 출력 => 할인대상입니다. 또는 할인 대상이 아닙니다
        System.out.println("=====A1=====");
        if(age <= 19 || age >= 60){
            System.out.println("할인대상");
        }
        if(age > 19 && age < 60){
            System.out.println("할인대상 아님");
        }
        System.out.println("=====A2=====");
        if(age <= 19 || age >= 60){
            System.out.println("할인대상");
        }
        else if(age > 19 && age < 60){
            System.out.println("할인대상 아님");
        }
        System.out.println("=====A3====="); //**
        if(age <= 19 || age >= 60){
            System.out.println("할인대상");
        }
        else{
            System.out.println("할인대상 아님");
        }
        System.out.println("=====A4=====");
        if(age <= 19){
            System.out.println("할인대상");
        }
        if(age >= 60){
            System.out.println("할인대상");
        }
        if(age > 19 && age < 60){
            System.out.println("할인대상 아님");
        }
        System.out.println("=====A5=====");
        if(age <= 19){ // or
            System.out.println("할인대상");
        }
        if(age >= 60){ // or
            System.out.println("할인대상");
        }
        if(age > 19){ // and
            if(age < 60){
                System.out.println("할인대상 아님");
            }
        }
        // 범위가 곂치지 않는 대상을 동시에 if문으로 엮을 때 안에 넣어주기
        // 둘다 참일 때 안으로 들어올 수 있음
        System.out.println("=====A6=====");
        if(age <= 19) { // or
            System.out.println("할인대상");
        }
        else if(age >= 60){ // or
            System.out.println("할인대상");
        }
        else if(age > 19){ // and
            if(age < 60){
                System.out.println("할인대상 아님");
            }
        }

        System.out.println("=====A6=====");
        if(age <= 19) { // or
            System.out.println("할인대상");
        }
        else if(age >= 60){ // or
            System.out.println("할인대상"); // 65가 참인것을 여기에서 걸러줌
        }
        else if(age > 19){ // and
            System.out.println("할인대상 아님");
        }

        System.out.println("=====A7====="); //**
        if(age <= 19) { // or
            System.out.println("할인대상");
        }
        else if(age >= 60){ // or
            System.out.println("할인대상"); // 65가 참인것을 여기에서 걸러줌
        }
        else{ // and
            System.out.println("할인대상 아님");
        }

        System.out.println("=====A6=====");
        if(age <= 19) { // or
            System.out.println("할인대상");
        }
        else { // or
            if(age >= 60){ // and
                System.out.println("할인대상 아님");
            }
            else {
                System.out.println("할인대상");
            }
        }

        // 같은 코드를 더 나은 코드가 있는지 생각해보기


    }
}




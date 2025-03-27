package awsJava.javaBasic;

public class A010_else {

    public static void main(String[] args) {
        /*
         * 수능 16번. 나이에 맞는 보기를 골라주세요
         *
         * 당신의 나이 : 36
         *
         * 1) 유아/아동
         * 2) 10대
         * 3) 20대
         * 4) 30대
         * 5) 40대 이상
         *
         */

        int age = 36;

        if(age >= 1 && age < 10){
            // &&인 이유 =>교집합
            // ||로 엮으면 둘중에 하나만 맞아도 되기 때문에 => 합집합 (모든 조건에 충족이 되어버림)
            System.out.println("유아/아동");
        }
        if(age >= 10 && age < 20){
            System.out.println("10대");
        }
        if(age >= 20 && age < 30){
            System.out.println("20대");
        }
        if(age >= 30 && age < 40){
            System.out.println("30대");
        }
        if(age >= 40){
            System.out.println("40대 이상");
        }

        // 이렇게 if로만 되어있는 if문은 모든 줄을 실행함 (위에서부터 아래로 실행되기 때문에)

        if(age >= 1 && age < 10){
            System.out.println("유아/아동");
        }
        else if(age >= 10 && age < 20){
            System.out.println("10대");
        }
        else if(age >= 20 && age < 30){
            System.out.println("20대");
        }
        else if(age >= 30 && age < 40){
            System.out.println("30대");
        }
        else if(age >= 40){
            System.out.println("40대 이상");
        }

        // else if를 붙이면 코드가 실행되다가 조건이 참인 값을 찾았을 때 더 코드진행이 되지 않음
        // 한 덩어리가 됨

        if(age >= 1 && age < 10){
            System.out.println("유아/아동");
        }
        else if(age >= 10 && age < 20){
            System.out.println("10대");
        }
        else if(age >= 20 && age < 30){
            System.out.println("20대");
        }
        else if(age >= 30 && age < 40){
            System.out.println("30대");
        }
        else {
            System.out.println("40대 이상");
        }

        // 위의 조건이 다 거짓이었을 때 맞는 답은 마지막이라는 답일것이라는 가정으로
        // 마지막 조건에는 if문과 조건식을 빼고 상위에 해당하는 조건이 없다면
        // else를 사용해서 마지막을 실행시킨다.


        //----------------------------
        int age2 = 20;

        if(age2 >= 20){
            System.out.println(1);
        }
        else if(age2 <= 20){
            System.out.println(2);
        }

        if(age2 >= 30){
            System.out.println(1);
        }
        else if(age2 <= 20){
            System.out.println(2);
        }

        // else는 동시에 참일 수 있는 상태를 만들어 주지 않는다.
        // if와 else if만을 사용할 때 모든 조건이 틀렸을 때 모두 실행하지 않는다.

    }
}

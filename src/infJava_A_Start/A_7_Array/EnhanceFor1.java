package infJava_A_Start.A_7_Array;

// 향상된 for 문(Enhanced For Loop)

// 각각의 요소를 탐색한다는 의미로 for-each 문이라고도 많이 부른다.
// 향상된 for 문은 배열을 사용할 때 기존 for 문 보다 더 편리하게 사용할 수 있다.

// 향상된 for 문 정의
// for(변수 : 배열 또는 컬랙션){
//     // 배열 또는 컬렉션의 요소를 순회하면서 수행할 작업
// }

// 일반 for 문과 동일하게 작동한다.
// 향상된 for 문은 배열의 인덱스를 사용하지 않고, 종려조건을 주지 않아도 된다.
// 단순히 배열을 처음부터 끝까지 탐색한다.
// :의 오른쪽에 numbers 와 같이 참색할 배열을 선택하고, : 왼쪽에 int number 와 같이 반복할 때 마다 찾은 값을 저장할 변수를 선언한다.
// 배열의 값을 하나씩 꺼내서 왼쪽에 있는 number 에 담고 for 문을 수행한다.
// numbers 배열의 끝에 도달해서 더 값이 없으면 for 문이 완전히 종료된다.
// 인덱스를 사용하지 않고도 배열의 요소를 순회할 수 있기 때문에 코드가 간결하고 가독성이 좋다.

public class EnhanceFor1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // 일반 for 문
        for(int i = 0; i < numbers.length; i++){
            int number = numbers[i];
            System.out.println(number);
        }

        //for (int number : numbers) {
        //
        //} -> 향상된 for 문 단축키: iter + enter

        // 향상된 for 문, for-each 문
        // 내부에 인덱스와 종료조건이 숨겨져있음, 끝까지 돌릴때에 적합함
        for(int number : numbers){ // numbers 배열을 0부터 끝까지 돌면서 number 에 넘김
            System.out.println(number);
        }

        // 향상된 for 문을 사용하지 못하는 경우
        // 향상된 for 문에는 증가하는 인덱스 값이 감추어져 있다.
        // int i와 같은 증가하는 인덱스 값을 직접 사용해야하는 경우에는 향상된 for 문을 사용할 수 없다.

        // for-each 문을 사용할 수 없는 경우, 증가하는 index 값 필요
        // 몇 번째의 결과가 필요할 때
        for(int i = 0; i <numbers.length; i++){
            System.out.println("number" + i + "번의 결과는: " + numbers[i]);
        }

        // 향상된 for 문 밖에 변수를 선언해서 쓸 수는 있지만 그럴 경우 일반 for문을 사용하는 것이 더 좋다.

    }
}

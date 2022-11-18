package j10_배열;

import java.util.Random;

public class Array3 {
    public static int foundMinNumber(int[] numbers){
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++){
            if(min > numbers[i]){
                min = numbers[i];
            }
        }

        return min;
    }

    public static int foundMaxNumber(int[] numbers){
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++){
            if(max < numbers[i]){
                max = numbers[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        /*
            randomArray 배열을 생성(10개)
            10, 2, 4, 5, 3, 7... (1부터 10까지)
            총합: ??
         */

        Random random = new Random();
        int[] randomArray = new int[10];
        int total = 0;


        //배열에 랜덤한 값 대입 (앞의 배열값과 중복 X)
        for (int i = 0; i < randomArray.length; i++){
            while (true){
                int randomNumber = random.nextInt(10) + 1;  // 1~10까지 랜덤한 수 생성
                boolean found = true;
                for (int k : randomArray) {
                    if (k == randomNumber) {    // 중복되는 수 찾기
                        found = false;
                        break;
                    }
                }
                if(found){
                    randomArray[i] = randomNumber;
                    break;
                }
            }
        }

        /*
            1. 배열에서 값을 하나씩 꺼내어 total에 더한다.
            2. 배열의 값을 하나씩 꺼내어 출력한다. (단, 마지막에는 쉼표를 찍지 않는다.)
         */

        for (int i = 0; i < randomArray.length; i++) {
            total += randomArray[i];
            System.out.print(randomArray[i]);
            if(i != randomArray.length - 1)
                System.out.print(", ");
        }
        System.out.println();
        System.out.println("총합: " + total);
        System.out.println("최소값: " + foundMinNumber(randomArray));
        System.out.println("최댓값: " + foundMaxNumber(randomArray));
    }
}

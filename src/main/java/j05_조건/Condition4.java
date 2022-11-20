package j05_조건;

import java.util.Scanner;

public class Condition4 {
    /*
            점수가 0보다 작거나 100보다 크면 잘못된 입력! 출력
            90 ~ 100 A학점 출력
            80 ~ 89 B학점 출력
            70 ~ 79 C학점 출력
            60 ~ 69 D학점 출력
            0 ~ 59 F학점 출력
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        System.out.print("시험 성적 입력: ");
        score = scanner.nextInt();
        if(score < 0 || score > 100){
            System.out.println("잘못된 입력!");
        }else{
            switch (score / 10){
                case 10:
                case 9:
                    System.out.println("A학점");
                    break;
                case 8:
                    System.out.println("B학점");
                    break;
                case 7:
                    System.out.println("C학점");
                    break;
                case 6:
                    System.out.println("D학점");
                    break;
                default:
                    System.out.println("F학점");
            }
        }
    }
}

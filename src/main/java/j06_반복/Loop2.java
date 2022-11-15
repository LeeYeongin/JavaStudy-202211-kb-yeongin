package j06_반복;

public class Loop2 {

    public static void main(String[] args) {
        /*
            [2단]
            2 x 1 = 2
            2 x 2 = 4
            ...
            2 x 9 =18

        int dan = 3;
        System.out.println("[" + dan + "단]");
        for(int i = 0; i < 9; i++){
            int num = i + 1;
            System.out.println(dan + " x " + num + " = " + (dan * num));
        }*/

        for(int i = 0; i < 8; i++){
            int dan = i + 2;
            System.out.println("[" + dan + "단]");
            for(int j = 0; j < 9; j++) {
                int num = j + 1;
                System.out.println(dan + " x " + num + " = " + (dan * num));
            }
        }
    }
}

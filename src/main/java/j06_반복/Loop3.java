package j06_반복;

public class Loop3 {

    public static void main(String[] args) {
        /*
        1.*
          **
          ***
          ****
          *****
         2.
            *****
            ****
            ***
            **
            *
         3.
               *
              **
             ***
            ****
           *****
         4.
           *****
            ****
             ***
              **
               *
         */

        int n = 5;
        //1.
        System.out.println("1.");
        for(int i = 0 ; i < n; i++){
            for(int j = 0; j < i + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //2.
        System.out.println("2.");
        for(int i = 0 ; i < n; i++){
            for(int j = 0; j < n - i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //3.
        System.out.println("3.");
        for(int i = 0 ; i < n; i++){
            for(int j = 0; j < n - i - 1; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < i + 1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //4.
        System.out.println("4.");
        for(int i = 0 ; i < n; i++){
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < n - i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //5.
        System.out.println("5.");
        for(int i = 0 ; i < n; i++){
            for(int j = 0; j < n - i - 1; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < 2 * (i + 1) - 1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //6.
        System.out.println("6.");
        for(int i = 0 ; i < n; i++){
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < 2 * (n - i) - 1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
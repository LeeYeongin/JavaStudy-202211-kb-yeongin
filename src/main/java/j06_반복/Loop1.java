package j06_반복;

public class Loop1 {
    public static void main(String[] args) {

        int n = 10;

        for(int i = 0; i < n; i++){ // 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
            System.out.print(i);
            if(i < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for(int i = 0; i < n; i++){ // 10, 11, 12, 13, 14, 15, 16, 17, 18, 19
            System.out.print(i + 10);
            if(i < n - 1){
                System.out.print(", ");
            }
        }
        System.out.println();

        for(int i = 0; i < n; i++){ // 10, 9, 8, 7, 6, 5, 4, 3, 2, 1
            System.out.print(n - i);
            if(i < n - 1){
                System.out.print(", ");
            }
        }
        System.out.println();

        for(int i = 0; i < n; i++){ // 20, 19, 18, 17, 16, 15, 14, 13, 12, 11
            System.out.print(n - i + 10);
            if(i < n - 1){
                System.out.print(", ");
            }
        }
        System.out.println();

        for(int i = 0, j = n; i < n; i++, j--){
            System.out.println("i: " + i + ", j: " + j);
        }
    }
}
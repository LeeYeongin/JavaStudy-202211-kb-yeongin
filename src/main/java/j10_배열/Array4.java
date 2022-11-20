package j10_배열;

public class Array4 {
    public static int cmpMin(int[] array1, int[] array2){
        int min = 0;
        boolean firstvalue = true;
        for(int i=0; i<array1.length; i++){
            for(int j=0; j<array2.length; j++){
                if(array1[i]==array2[j]) {
                    if (firstvalue) {
                        min = array1[i];
                        firstvalue = false;
                    }
                    if(array1[i] < min) {
                        min = array1[i];
                    }
                }
            }
        }

        return min;
    }

    public static int cmpMax(int[] array1, int[] array2){
        int max = 0;
        /*int[] array3 = new int[array1.length + array2.length];
        boolean diff = true;
        int cnt = 0;

        for(int i = 0; i < array1.length; i++){
            diff = true;
            for(int j = 0; j < array2.length; j++){
                if(array1[i] == array2[j]){
                    diff = false;
                    break;
                }
            }
            if(diff){
                array3[cnt] = array1[i];
                cnt++;
            }
        }

        for(int i = 0; i < array2.length; i++){
            diff = true;
            for(int j = 0; j < array1.length; j++){
                if(array1[j] == array2[i]){
                    diff = false;
                    break;
                }
            }
            if(diff){
                array3[cnt] = array2[i];
                cnt++;
            }
        }

        max = array3[0];
        for(int i = 0; i < array3.length; i++){
            if(max < array3[i]){
                max = array3[i];
            }
        }*/

        boolean firstvalue = true;
        boolean flag = true;
        for(int i=0; i<array1.length; i++){
            flag = true;
            for(int j=0; j<array2.length; j++){
                if(array1[i]==array2[j]) {
                    flag = false;
                    break;
                }
            }
            if(flag){
                if (firstvalue) {
                    max = array1[i];
                    firstvalue = false;
                }
                if(array1[i] > max) {
                    max = array1[i];
                }
            }
        }

        for(int i=0; i<array2.length; i++){
            flag = true;
            for(int j=0; j<array1.length; j++){
                if(array1[j]==array2[i]) {
                    flag = false;
                    break;
                }
            }
            if(flag){
                if(array2[i] > max) {
                    max = array2[i];
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {

        int[] nums1 = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] nums2 = new int[] {6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        System.out.println("min: " + cmpMin(nums1, nums2));
        System.out.println("max: " + cmpMax(nums1, nums2));

        /*
        1. 두 배열에서 중복된 값 중 최소값 -> 6
        2. 두 배열에서 중복되지 않은 값 중 최대값 -> 15
         */
    }
}

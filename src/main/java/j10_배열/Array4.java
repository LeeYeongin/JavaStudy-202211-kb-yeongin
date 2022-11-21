package j10_배열;

public class Array4 {
    // 배열의 길이를 하나 추가해주는 function
    public static int[] add(int[] array, int value){    // 배열은 생성되면 바로 추가 X
        int[] resultArray = new int[array.length + 1];  //원래 배열에 하나가 더 늘어난 배열 생성
        for(int i = 0; i < array.length; i++) { // 원래 배열값 그대로 복사
            resultArray[i] = array[i];
        }
        resultArray[array.length] = value;  //새로운 값 추가

        return resultArray;
    }

    // 중복된 값을 찾아 새로운 배열에 저장하는 fucntion
    public static int[] getDuplicateArray(int[] array1, int[] array2){
        int[] resultArray = new int[0]; // 비어있는 새로운 array

        for(int i = 0; i < array1.length; i++){
            for(int j = 0; j < array2.length; j++){
                if(array1[i] == array2[j]){    // 두 배열에서 중복되는 값 찾기
                    resultArray = add(resultArray, array1[i]);  // resultArray에 추가
                }
            }
        }

        return resultArray;
    }

    // 중복되지 않는 값을 찾아 새로운 배열에 저장하는 fucntion
    public static int[] getNonDuplicateArray(int[] array1, int[] array2){
        int[] resultArray = new int[0]; // 비어있는 새로운 array

        for(int i = 0; i < array1.length; i++){
            int duplicateArray1 = 0;
            for(int j = 0; j < array2.length; j++){
                if(array1[i] == array2[j]){    // 두 배열에서 중복되지 않는 값이 있으면
                    duplicateArray1++;  // 중복되는 값 개수 count
                }
            }
            if(duplicateArray1 != 0){   // 중복되는 값이 있으면
                continue;
            }
            resultArray = add(resultArray, array1[i]);  //중복되지 않으면 추가
        }

        for(int i = 0; i < array2.length; i++){
            int duplicateArray2 = 0;
            for(int j = 0; j < array1.length; j++){
                if(array2[i] == array1[j]){    // 두 배열에서 중복되는 값이 있으면
                    duplicateArray2++;  //중복 되는 값 개수 count
                }
            }
            if(duplicateArray2 != 0){   //중복되는 값이 있으면
                continue;
            }
            resultArray = add(resultArray, array2[i]);  //중복되지 않으면 추가
        }

        return resultArray;
    }

    public static int getMinNumberInArray(int[] array1){    // 배열에서 최소값 찾기
        int min = array1[0];

        for(int i = 0; i < array1.length; i++){
           if(array1[i] < min){
               min = array1[i];
           }
        }
        return min;
    }

    public static int getMaxNumberInArray(int[] array1){    // 배열에서 최대값 찾기
        int max = array1[0];

        for(int i = 0; i < array1.length; i++){
            if(array1[i] > max){
                max = array1[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {

        int[] nums1 = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] nums2 = new int[] {6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        int[] duplicateArray = getDuplicateArray(nums1, nums2);
        int[] nonDuplicateArray = getNonDuplicateArray(nums1, nums2);

        int minNumberInDuplicateArray = getMinNumberInArray(duplicateArray);
        int maxNumberInNonDuplicateArray = getMaxNumberInArray(nonDuplicateArray);

        System.out.println("중복된 값 중 최소값: " + minNumberInDuplicateArray);
        System.out.println("중복되지 않은 값 중 최대값: " + maxNumberInNonDuplicateArray);

        /*
        1. 두 배열에서 중복된 값 중 최소값 -> 6
        2. 두 배열에서 중복되지 않은 값 중 최대값 -> 15
         */
    }

}

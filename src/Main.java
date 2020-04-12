import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] arr = {1, 0, 1, 1, 1, 0, 0, 0, 0, 1};
        changeZeroOne(arr);

        int [] arr2 = new int[8];
        threeUp(arr2);

        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, -78, 4, 8, 9, 1};
        lessSixDouble(arr3);

        int[][] arr4 = new int [5][5];
        fillByOne(arr4);

        int [] arr5 = {12, 5, 8, 23, 7, -18 };
        findMinMax(arr5);

        int[]arr6 = {1, 1, 1, 1, 4};
        findBalance(arr6);

        int[]arr7 ={2,6,3,7,9,3};
        moveArr(arr7, -2);


    }

    public static void changeZeroOne (int[]arr){
        for (int i = 0; i < arr.length ; i++) {
            if( arr[i] == 0 ){
                arr[i] = 1;
            } else{
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void threeUp (int [] arr2) {
        for (int i = 0, j = 0; j < 8 ; i+=3, j++) {
            arr2[j]=i;
        }
        System.out.println(Arrays.toString(arr2));
    }

    public static void lessSixDouble (int[] arr3) {
        for (int i = 0; i <arr3.length ; i++) {
            if (arr3[i] < 6) {
                arr3[i] =arr3[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr3));
    }

    public static void fillByOne(int[][] arr4) {
        for (int i = 0 ; i <arr4.length ; i++) {
            for (int j = 0; j < arr4.length; j++) {
                if(i==j || i + j ==arr4.length-1){
                    arr4[i][j] = 1;
                }

            }
        }
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4.length; j++) {
                System.out.print(arr4[i][j] + "\t");
            }
            System.out.println();
        }

    }

    public static void findMinMax(int[] arr5) {
        int max = arr5[0];
        int min = arr5[0];
        for (int i = 0; i < arr5.length; i++) {
            if (arr5[i]> max){
                max = arr5[i];
            }
            if(arr5[i] < min){
                min= arr5[i];
            }

        }
        System.out.println(max +"  " +min);

    }
    public static boolean findBalance(int[]arr6){
        int sum = 0;
        int sum2=0;

        for (int i = 0; i < arr6.length ; i++) {
            sum+=arr6[i];
        }
        for (int i = 0; i < arr6.length; i++) {
            sum2 +=arr6[i];
            if(sum2 == sum - sum2) {
                return true;
            }
            }

        return false;
    }

    public static void moveArr(int[]arr7, int n) {
        int[]arr = new int [arr7.length];
        if(n>0) {
            for (int i = 0; i < arr7.length; i++) {
                if (i + n > arr7.length - 1) {
                    arr[i + n - arr7.length] = arr7[i];
                } else {
                    arr[i + n] = arr7[i];
                }

            }
        } if(n<0){
            for(int i = 0; i < arr7.length; i++){
                if(i+n<0){
                    arr[i+n+arr7.length] = arr7[i];
                } else {
                    arr[i + n] = arr7[i];
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }

}

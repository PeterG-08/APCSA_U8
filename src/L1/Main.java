package L1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[][] arr1 = new Integer[2][3];
        Integer[][] arr2 = new Integer[3][2];

        arr1[0][0] = 1;
        arr1[0][1] = 2;
        arr1[0][2] = 3;
        arr1[1][0] = 4;
        arr1[1][1] = 5;
        arr1[1][2] = 6;

        arr2[0][0] = 1;
        arr2[1][0] = 2;
        arr2[2][0] = 3;
        arr2[0][1] = 4;
        arr2[1][1] = 5;
        arr2[2][1] = 6;

        System.out.println(arr1[0][2] + arr2[2][0]);
    }
}

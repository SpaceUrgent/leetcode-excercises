package org.easy;

import java.util.Arrays;

public class TwoSum {

//    https://leetcode.com/problems/two-sum/

    public static int[] findIndexes(int[] arr, int sum){
        int[] indexes = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (i == j) continue;
                if ((arr[i] + arr[j]) == sum){
                    indexes[0] = i;
                    indexes[1] = j;
                }
            }
        }
        return indexes;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2,7,11,15};
        int[] arr1 = new int[]{3,2,4};

        int[] indexes = findIndexes(arr1, 6);

        System.out.println(Arrays.toString(indexes));
    }

}

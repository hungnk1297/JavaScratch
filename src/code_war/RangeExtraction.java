package code_war;

import java.util.Arrays;

/**
 * https://www.codewars.com/kata/51ba717bb08c1cd60f00002f/train/java
 */
public class RangeExtraction {
    public static String rangeExtraction(int[] arr) {

        int from;
        StringBuilder rangeExtracted = new StringBuilder();
        for(from = 0; from < arr.length;){
            rangeExtracted.append(arr[from]);
            int consecutiveIndex = calculateConsecutive(from + 1, arr);

            if (consecutiveIndex >= 3){
                rangeExtracted.append("-");
                rangeExtracted.append(arr[from + consecutiveIndex - 1]);
                from = from + consecutiveIndex;
            }else {
                from ++;
            }
            if (from < arr.length)
                rangeExtracted.append(",");
        }
        return rangeExtracted.toString();
    }

    private static int calculateConsecutive(int index, int[] arr){
        int consecutive = 1;
        for (int temp = index; temp < arr.length; temp++){
            if (arr[temp] - arr[temp-1] != 1){
                return consecutive;
            }else {
                consecutive++;
            }
        }
        return consecutive;
    }

    public static void main(String[] args) {
        System.out.println(rangeExtraction(new int[] {-6,-3,-2,-1,0,1,3,4,5,7,8,9,10,11,14,15,17,18,19,20}));
    }
}

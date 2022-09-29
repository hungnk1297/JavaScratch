package code_war;

/**
 * https://www.codewars.com/kata/515e271a311df0350d00000f/train/java
 */
public class SquareNSum {

    public static int squareSum(int[] n) {
        //Your Code
        int sum = 0;
        for (int a : n) {
            sum += (int) Math.pow(a, 2);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(squareSum(new int[]{1, 2, 2}));
    }
}

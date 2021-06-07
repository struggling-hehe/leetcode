package main.java.beigin2021.dynamicProgramming;

/**
 * @author jiexipeng
 * @date 2021/06/04
 */
public class LeetCode53 {

    public static int method(int arr[]) {
        int maxCount = 0;
        for (int i = 0; i < arr.length; i++) {
            maxCount = maxCount + arr[i];
            if (maxCount < 0) {
                maxCount = maxCount - maxCount;
            }
        }
        System.out.println(maxCount);
        return 1;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        method(arr);
    }
}

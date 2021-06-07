package main.java.beigin2021.dynamicProgramming;

/**
 * 给定一个整数数组 nums ，
 * 找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * @date 2021/06/04
 */

public class LeetCode53 {

    public static int method(int nums[]) {
        int num = nums[0];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count <= 0) {
                count = nums[i];
            } else {
                count += nums[i];
            }
            num = Math.max(num, count);
        }
        return num;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        method(arr);
    }
}

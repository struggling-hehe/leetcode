package beigin2021.greedylAgorithm;

import javax.swing.plaf.SliderUI;

/**
 * @author jiexipeng
 * @date 2021/06/01
 */
public class LeetCode392 {

    public static boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }

    public static void main(String[] args) {
        String s = "abc";
        String t = "adscfb";
        System.out.println(isSubsequence(s, t));
    }
}

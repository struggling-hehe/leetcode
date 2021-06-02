package beigin2021.greedylAgorithm;


/**
 *  判断子序列
 *
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

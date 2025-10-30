package IncreasingSubStringFinder;

public class IncreasingSubstringFinder {
    public static String findLongestIncreasingSubstring(String s) {
        if (s == null || s.isEmpty()) return "";

        int n = s.length();
        int[] dp = new int[n];      // dp[i] = length LIS kết thúc tại i
        int[] prev = new int[n];    // prev pointer để reconstruct
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
            prev[i] = -1;
        }

        int maxLen = 1;
        int maxIdx = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (s.charAt(j) < s.charAt(i) && dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                    prev[i] = j;
                }
            }
            if (dp[i] > maxLen) {
                maxLen = dp[i];
                maxIdx = i;
            }
        }

        // Reconstruct subsequence
        StringBuilder sb = new StringBuilder();
        int idx = maxIdx;
        while (idx != -1) {
            sb.append(s.charAt(idx));
            idx = prev[idx];
        }
        // sb chứa chuỗi theo thứ tự ngược, đảo lại
        return sb.reverse().toString();
    }
}

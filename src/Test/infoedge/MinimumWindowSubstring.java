package Test.infoedge;

public class MinimumWindowSubstring {
    public static String minWindowBruteForce(String s, String t) {
        int minLength = Integer.MAX_VALUE;
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String sub = s.substring(i, j);
                if (containsAll(sub, t)) {
                    if (sub.length() < minLength) {
                        minLength = sub.length();
                        result = sub;
                    }
                }
            }
        }
        return result;
    }

    // Helper function to check if sub contains all characters of t (with correct counts)
    private static boolean containsAll(String sub, String t) {
        int[] subFreq = new int[128];
        int[] tFreq = new int[128];

        for (char ch : sub.toCharArray()) subFreq[ch]++;
        for (char ch : t.toCharArray()) tFreq[ch]++;

        for (int i = 0; i < 128; i++) {
            if (tFreq[i] > subFreq[i]) return false;
        }
        return true;
    }

    public static String minWindowOptimized(String s, String t) {
        int[] tFreq = new int[128];
        for (char ch : t.toCharArray()) tFreq[ch]++;

        int left = 0, minLen = Integer.MAX_VALUE, formed = 0;
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            int ch = s.charAt(i);
            if (tFreq[ch] > 0) {
                tFreq[ch]--;
                formed++;
            }
            while (formed == t.length()) {
                if (i - left + 1 < minLen) {
                    minLen = i - left + 1;
                    result = s.substring(left, i + 1);
                }
                int leftCh = s.charAt(left);
                if (tFreq[leftCh] == 0) formed--;
                tFreq[leftCh]++;
                left++;
            }
        }
        return result;
    }
}

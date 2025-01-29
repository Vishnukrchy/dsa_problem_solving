package String;

public class MaxFreqChar {
    public static void main(String[] args) {
        String s1="geeksforgeeks";
        System.out.println("Max Freq Char : "+maxFreqChar(s1));
        System.out.println("Max Freq Char : "+maxFreqChar1(s1));
        System.out.println("Max Freq Char : "+maxFreqChar2(s1));

    }

    public static char maxFreqChar2(String s1) {
        int freq[] = new int[26];
        for (char c :s1.toCharArray()) {
            freq[c-'a']++;

        }
        char maxChar = ' ';
        int max = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > max) {
                max = freq[i];
                maxChar = (char) (i + 'a');
            }
        }
        return maxChar;
    }

    public static char maxFreqChar1(String s1) {
        int freq[] = new int[256];
        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i)]++;
        }
        char maxChar = ' ';
        int max = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > max) {
                max = freq[i];
                maxChar = (char) i;
            }
        }
        return maxChar;
    }

    private static char maxFreqChar(String s1) {
        int max=0;
        char maxChar=' ';
        for (int i = 0; i < s1.length(); i++) {
            int count=0;
            for (int j = 0; j < s1.length(); j++) {
                if(s1.charAt(i)==s1.charAt(j)){
                    count++;
                }
            }
            if(count>max){
                max=count;
                maxChar=s1.charAt(i);
            }
        }
        return maxChar;
    }
}

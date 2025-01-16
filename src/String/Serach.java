package String;

public class Serach {

        public int findFirstOccurrence(String txt, String pat) {
            int n = txt.length(); // Length of the text
            int m = pat.length(); // Length of the pattern

            // Iterate through the text
            for (int i = 0; i <= n - m; i++) { // Ensure there is enough space for the pattern
                boolean match = true; // Reset match status for each starting index

                // Check for match of the pattern with the substring starting at i
                for (int j = 0; j < m; j++) {
                    if (txt.charAt(i + j) != pat.charAt(j)) {
                        match = false; // Mismatch found
                        break;
                    }
                }

                // If the pattern matches completely
                if (match) {
                    return i; // Return the starting index
                }
            }

            // If no match is found
            return -1;
        }
    public int findFirstOccurrence1(String txt, String pat) {
        return txt.indexOf(pat);
    }

        public static void main(String[] args) {
            Serach Serach
                     = new Serach();

            // Test cases

            System.out.println(Serach
                    .findFirstOccurrence("hello world", "world")); // Output: 6
            System.out.println(Serach
                    .findFirstOccurrence("abcdef", "def")); // Output: 3
            System.out.println(Serach
                    .findFirstOccurrence("abcdef", "gh")); // Output: -1
        }


}

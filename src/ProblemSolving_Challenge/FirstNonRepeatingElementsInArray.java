
package ProblemSolving_Challenge;

public class FirstNonRepeatingElementsInArray {
    public static void main(String[] args) {
        System.out.println(" ==================== Fixed Array For Testing =================== ");
        int test[] = {22, 21, 3, 5, 22, 3,21, 0, 2, 1};

        int[] result = firstNonRepeatingElementsOfArray(test);
        int[] result1 = firstNonRepeatingElements(test);
        if (result1[0] != -1) {
            System.out.println("First non-repeating element is: " + result[0] + " at index: " + result[1]);
        } else {
            System.out.println("No non-repeating element found.");
        }
    }

    private static int[] firstNonRepeatingElementsOfArray(int[] test) {
        for (int i = 0; i < test.length; i++) {
            int j;
            for (j = 0; j < test.length; j++) {
                if (i != j && test[i] == test[j])
                    break;  // Exit inner loop if duplicate is found
            }
            // If no duplicate was found in the inner loop, return the current element and its index
            if (j == test.length) {
                return new int[] {test[i], i};  // Return the first non-repeating element and its index
            }
        }
        return new int[] {-1, -1};  // Return -1 if no non-repeating element was found
    }
    private static  int []  firstNonRepeatingElements( int a[]){
        int max=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]>max)max=a[i];
        }
        int count [] =new int[max+1];
        for (int i = 0; i <a.length ; i++) {
            count[a[i]]++;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[a[i]]==1){
                return new int[]{a[i], i};
            }
        }
        return new  int []{-1,-1};
    }
}

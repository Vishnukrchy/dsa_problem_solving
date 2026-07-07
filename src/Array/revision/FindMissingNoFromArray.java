package Array.revision;
/*
find missing number from array
example:
arr = [1,2,3,4,5]
missing number = 6

 */
public class FindMissingNoFromArray {
    static void main() {
        int [] arr = {1,2,3,5};

        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            int expected = i + 1;
            if (current != expected) {
                System.out.println("Missing number: " + expected);
                return;
            }
        }

    }
}

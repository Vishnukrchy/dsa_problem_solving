package pattern_programing;
/*
 1  5  9 13
 2  6 10 14
 3  7 11 15
 4  8 12 16

 */
public class ColumnWisePattern {
    public static void main(String[] args) {
        int rows = 4;
        int cols = 4;

        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < cols; j++) {
                int val = i + j * rows;
                System.out.printf("%2d ", val);  // Neat formatting
            }
            System.out.println();
        }

        /*
         for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < cols; j++) {
                int num = i + j * rows;
                System.out.print(num + " ");
            }
            System.out.println();
        }
         */
    }
}

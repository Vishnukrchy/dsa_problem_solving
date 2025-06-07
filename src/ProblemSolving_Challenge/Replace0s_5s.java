package ProblemSolving_Challenge;

import java.util.Scanner;

public class Replace0s_5s {

    public static void main(String[] args) {
        int[] arr1 = User.userInputArray();
        int[] arr = {0, 1, 0, 0, 3, 5, 0};
        replace0s_5_left_right(arr);
        replace0s_5_right_left(arr1);
        // Convert 0 to 5 in  a number
        convertfive();
    }

    static void convertfive() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = scanner.nextInt();
        if (num == 0) {
            System.out.println(5);
        }
        // By recursion
//       int rem=num%10;
//       return convertfive(num/10)*10+convertfive(rem);
        int result = 0;
        int mult = 1;
        while (num != 0) {
            int digit = num % 10;
            if (digit == 0) {
                digit = 5;
            }
            result = result + digit * mult;
            mult = mult * 10;
            num = num / 10;

        }
        System.out.println(result);
    }

    public static int[] replace0s_5_left_right(int[] arr) {
        int arrLength = arr.length;
        int count = 0;
        for (int i = 0; i < arrLength; i++) {
            if (arr[i] == 0) {
                arr[i] = 5;
                count++;
            }
        }
        User.printArray(arr);
        for (int i = 0; i < count; i++) {
            arr[arrLength - 1 - i] = 0;
        }
        User.printArray(arr);
        return arr;
    }

    public static int[] replace0s_5_right_left(int[] arr) {
        int arrLength = arr.length;
        int count = 0;
        for (int i = 0; i < arrLength; i++) {
            if (arr[i] == 0) {
                arr[i] = 5;
                count++;
            }
        }
        User.printArray(arr);
        for (int i = 0; i < count; i++) {
            arr[i] = 0;
        }
        User.printArray(arr);
        return arr;
    }

}

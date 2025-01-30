package leet_code;
/*

@Author: Vishnu
@Date: 2022-07-30 10:41
Problem Statement : LeatCode :13. Roman to Integer
Roman numerals represent numbers using combinations of letters, where each letter has a specific value:

Approach to Convert Roman Numerals to Integer
Read the input string from left to right.
Check each numeral and its next numeral:
If the current numeral is smaller than the next numeral, subtract its value.
Otherwise, add its value.
Sum up all the values to get the final result.

Example Walkthrough
Example 1:
Input: "III"
Process:
I + I + I = 3
Output: 3
 */



import java.util.Map;
import java.util.Scanner;

public class RomanNumeralstoInteger {
    public static void main(String[] args) {
//        String s = new   Scanner(System.in).nextLine();

        String s = "V";

        System.out.println(romanToInt(s));

    }

    public  static  int romanToInt1(String s) {
        Map<Character,Integer> romanMap=Map.of(
                'I',1,
                'V',5,
                'X',10,
                'L',50,
                'C',100,
                'D',500,
                'M',1000
        );
        int total=0;
        int preValue=0;
        for (int i=s.length()-1;i>=0;i--) {
            int currentValue=romanMap.get(s.charAt(i));
            if (currentValue<preValue){
                total=total-currentValue;
            }else {
                total= total+currentValue;
            }
            preValue=currentValue;
        }
        return total;
    }
    public  static  int romanToInt2(String s) {
        //  Note of() method is used to create a map of characters and their values and its return type  Map
        Map<Character, Integer> map = Map.
                of('I', 1,
                'V', 5,
                        'X', 10,
                        'L', 50,
                        'C', 100,
                        'D', 500,
                        'M', 1000);

        int result = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                result -= map.get(s.charAt(i));
            } else {
                result += map.get(s.charAt(i));
            }
        }
        result += map.get(s.charAt(s.length() - 1));
        return result;

    }
    private static Integer romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == 'I' && s.charAt(i + 1) == 'V') {
                result += 4;
                i++;
            } else if (s.charAt(i) == 'I' && s.charAt(i + 1) == 'X') {
                result += 9;
                i++;
            } else if (s.charAt(i) == 'X' && s.charAt(i + 1) == 'L') {
                result += 40;
                i++;
            } else if (s.charAt(i) == 'X' && s.charAt(i + 1) == 'C') {
                result += 90;
                i++;
            } else if (s.charAt(i) == 'C' && s.charAt(i + 1) == 'D') {  // 400
                result += 400;
                i++;
            } else if (s.charAt(i) == 'C' && s.charAt(i + 1) == 'M') {  // 900
                result += 900;
                i++;
            } else {
                if (s.charAt(i) == 'I') {
                    result += 1;
                } else if (s.charAt(i) == 'V') {
                    result += 5;
                } else if (s.charAt(i) == 'X') {
                    result += 10;
                } else if (s.charAt(i) == 'L') {
                    result += 50;
                } else if (s.charAt(i) == 'C') {
                    result += 100;
                } else if (s.charAt(i) == 'D') {
                    result += 500;
                } else if (s.charAt(i) == 'M') {
                    result += 1000;
                }
            }
        }
                if (s.length() == 1) {
                    if (s.charAt(0) == 'I') {
                        result += 1;
                    } else if (s.charAt(0) == 'V') {
                        result += 5;
                    } else if (s.charAt(0) == 'X') {
                        result += 10;
                    } else if (s.charAt(0) == 'L') {
                        result += 50;
                    } else if (s.charAt(0) == 'C') {
                        result += 100;
                    } else if (s.charAt(0) == 'D') {
                        result += 500;
                    } else if (s.charAt(0) == 'M') {
                }
            }
        return result;

    }
}

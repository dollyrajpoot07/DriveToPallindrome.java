// For a given positive number num, identify the palindrome formed by performing the following operations-
// Add num and its reverse 
// Check whether the sum is palindrome or not. 
// If not, add the sum and its reverse and repeat the process until a palindrome is obtained.
// Explanation: Reverse and Add given number repeatedly to get a Palindrome number
// Input 1: 124
// Output 1: 545
// Input 2: 4
// Output 2: 8

import java.util.*;

public class DriveToPallindrome {

    private static Integer reverse(Integer number) {
        int reverse = 0;
        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer num = sc.nextInt();
        while (true) {
            Integer addedNum = num + reverse(num);
            if (Objects.equals(addedNum, reverse(addedNum))) {
                System.out.println(addedNum);
                break;
            }
            num = addedNum;
            sc.close();
        }
    }
}
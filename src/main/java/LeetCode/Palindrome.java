package LeetCode;

import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int original = x;
        int reversed = 0;

        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 +digit;
            x= x/10;

        }
        if(original == reversed) {
            return true;
        }
        return false;
    }
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter the number : ");
        int x= sc.nextInt();
        boolean result = isPalindrome(x);
        System.out.println(result);
    }
}

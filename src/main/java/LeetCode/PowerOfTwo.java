package LeetCode;

import java.util.Scanner;

public class PowerOfTwo {
    public static boolean isPowerOfTwo(int n){
        if(n<=0){
            return false;
        }
        long power = 1;
        while(power<n){
            power = power * 2;
        }
        return power == n;
    }
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter Your Number : ");
        int n = sc.nextInt();
        System.out.print(isPowerOfTwo(n));

    }
}

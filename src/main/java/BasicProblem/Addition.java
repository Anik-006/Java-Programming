package BasicProblem;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a first number : ");
        int a = sc.nextInt();
        System.out.print("Enter a second number : ");
        int b = sc.nextInt();
        int sum = (a + b);
        System.out.print("Sum of two numbers are : ");
        System.out.println(sum);
    }
}

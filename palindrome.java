
// ---------------This is the program to palindrome or revers one varibale value by taking input from user---------------------------

import java.util.Scanner;

public class palindrome
{
    public static void main(String[] args) 
    {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter any digit : ");
        int b = a.nextInt();
        a.close();

        // Using one more integer and while loop to revers it----------------
        int rev = 0;

        while(b!=0)
        {
            rev = rev * 10 + b % 10;
            b = b / 10;
        }
        System.out.println("The number after reversing it : " + rev);
    }
}
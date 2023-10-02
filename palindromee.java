// -----------------------This is a program to find a String is palindrome or not---------------------------------------

import java.util.Scanner;

public class palindromee 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String value : ");

        String a = sc.next();
        String b = a;
        
        String rev = "";

        int lg = a.length();
        sc.close();

        // Using for loop-----------------------------

        for(int i=lg-1; i>=0; i--)
        {
            rev = rev + a.charAt(i);
        }
        if(b.equals(rev))
        {
            System.out.println("This is palindrome : " + b);
        }
        else
        {
            System.out.println("This is not palindrome : " + b);
        }
    }
}

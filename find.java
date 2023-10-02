// --------------------This is a program to find the largest of 3 numbers------------------------

import java.util.Scanner;

public class find 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number : ");
        int num1 = sc.nextInt();

        System.out.println("Enter Second Number : ");
        int num2 = sc.nextInt();


        System.out.println("Enter Third Number : ");
        int num3 = sc.nextInt();

        sc.close();

        // Using if else and && operator

        if(num1 > num2 && num1 > num2)
        {
            System.out.println("num1 is greater then other numbers : " + num1);
        }
        else if (num2 > num1 && num2 > num3)
        {
            System.out.println("num2 is greater then other numbers : " + num2);
        }
        else
        {
            System.out.println("num3 is greater then other numbers : " + num3);
        }

    }
}
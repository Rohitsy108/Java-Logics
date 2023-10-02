// -----------------------This is a program to find the sum of all in numbers---------------------------

public class summ 
{
    public static void main(String[] args) 
    {
        int a = 123456789;

        int b = 0;

        // Using while loop--------------------------

        while (a > 0)
        {
            b = b + a % 10;
            a = a / 10;
        }
        System.out.println("Sum of all the numbers is : " + b);
    }
}

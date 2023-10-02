
// -------------------This is a program to swap two different variables value--------------------

public class swaping 
{
    public static void main(String[] args) 
    {
        int a = 12;
        int b = 13;

        System.out.println("Before swapping the values : " + a + " " + b);

        // 1) Logic here I am using 3 variable to swap-------------------
        // int  c = a;
        // a = b;
        // b = c;

        // 2) Logic here I am using bitwise XOR---------------------------
        a=a^b;
        b=a^b;
        a=a^b;

        System.out.println("After swapping the values : " + a + " " + b);
    }
}
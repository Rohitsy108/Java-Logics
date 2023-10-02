// ------------------This program is to count number of digit in a number------------------

public class counting 
{
    public static void main(String[] args) 
    {
        int a = 9473837;

        int b = 0;

        // Using while loop
        
        while(a > 0)
        {
            a = a / 10;
            b++;
        }
        System.out.println("Number of digits : " + b);
    }
}

// --------------------------This program is to fine numbers of odd and even in a number-----------------------

public class odd 
{
    public static void main(String[] args) 
    {
        int a = 123456789;

        int even = 0;
        int odd = 0;

        // Using while loop-------------------------

        while(a > 0)
        {
            int b = a / 10;
            if (b % 2 == 0)
            {
                even++;
            }
            else
            {
                odd++;
            }
            a = a / 10;
        }
        System.out.println("Number of Even Numbers : " + even);
        System.out.println("Number of Odd Numbers : " + odd);
    }
}

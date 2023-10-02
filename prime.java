// ---------------------This is program to find the prime number----------------

public class prime 
{
    public static void main(String[] args) 
    {
        int a = 20;

        int b= 0;

        if(a >1)
        {
            for(int i=1; i<=a; i++)
            {
                if(a%i==0)
                b++;
            }
            if(b==2)
            {
                System.out.println(a + " is a prime number");
            }
            else
            {
                System.out.println(a + " is not a prime number");
            }
        }
        else
        {
            System.out.println(a + " is not a prime number");
        }
    }
}
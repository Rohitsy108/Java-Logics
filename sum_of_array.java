// -------------------This is a program to find the sum of array--------------------
public class sum_of_array 
{
    public static void main(String[] args) 
    {
        int a[] = {1,2,3,4,5,6,7,8,};

        int b = 0;

        for(int i=0; i<a.length-1; i++)
        {
            b = b+a[i];
        }
        System.out.println("Sum of Array is : "+ b);
    }
}
